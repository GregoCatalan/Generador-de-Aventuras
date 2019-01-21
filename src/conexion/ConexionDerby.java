package conexion;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionDerby {
    //Se establecen los objetos Connection, ResultSet, PreparedStatement y ResultSetMetaData dek paquete java.sql
    //Se establece el objeto DefaultTableModel del paquete javax.swing.table
    //Los nombres de los atributos son específicos y respetan el encapsulamiento. 
    //System.getProperty localiza dónde está el proyecto
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    private DefaultTableModel dtm;
    private String cadena;
    private int numero;
    private boolean booleano;
    private String barra = File.separator;
    private String proyecto = System.getProperty("user.dir")+barra+"bases";
    
    //Conexión
    public Connection getConexion() throws Exception{
        
        //url para dist. Para ver el programa en funcionamiento copiar la carpeta src/bases/bestiario, copiar el contenido de la carpeta dist 
        //y pegar ambas cosas en una carpeta nueva.
        //url=".\\bestiario";
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        cn=DriverManager.getConnection("jdbc:derby:"+proyecto+";");
        
        return cn;
    }
      
    
    //Llena un combobox a partir de una búsqueda. Mientras haya elementos, se agregan al combo.
    public void llenarCombo(List lista, JComboBox combo, String busqueda)throws Exception{
        ps=getConexion().prepareStatement(busqueda);
        rs=ps.executeQuery();
        
        while (rs.next()) {            
            combo.addItem(rs.getString(1));
            lista.add(rs.getString(1));
        }
        
        ps.close();
        rs.close();
        cn.close();
    }
    
    //Trae todos esos datos de CrearCriatura y ejecuta una consulta que puede ser de INSERT INTO o de EDIT e incluye todos esos datos.
    //Nota: Esas consultas incluyen 25 signos de pregunta (?). Se establece el valor de cada uno con ps.setTIPO(número, dato).
    //Nota 2: Nótese que se usa executeUpdate() y no executeQuery() para ingresar datos nuevos.
    public void datosSQL(String nombre, int pg, int armadura, String danMP, int danDado, String danModDado, boolean nulo, String danArm, String formAtaque,
            boolean dToque, boolean dCerca, boolean dCorto, boolean dMedio, boolean dLargo, boolean contundente, boolean escabroso, String desc,
            String mov1, String mov2, String mov3, String cua1, String cua2, String cua3, int tipoCriatura, String instinto, String consulta) throws Exception{

        ps=getConexion().prepareStatement(consulta);   
   
        ps.setString(1, nombre);
        ps.setInt(2, pg);
        ps.setInt(3, armadura);
        ps.setString(4, danMP);
        ps.setInt(5, danDado);
        ps.setString(6, danModDado);
        ps.setBoolean(7, nulo);
        ps.setString(8, danArm);
        ps.setString(9, formAtaque);
        ps.setBoolean(10, dToque);
        ps.setBoolean(11, dCerca);
        ps.setBoolean(12, dCorto);
        ps.setBoolean(13, dMedio);
        ps.setBoolean(14, dLargo);
        ps.setBoolean(15, contundente);
        ps.setBoolean(16, escabroso);
        ps.setString(17, desc);
        ps.setString(18, mov1);
        ps.setString(19, mov2);
        ps.setString(20, mov3);
        ps.setString(21, cua1);
        ps.setString(22, cua2);
        ps.setString(23, cua3);
        ps.setInt(24, tipoCriatura);
        ps.setString(25, instinto);
        
        ps.executeUpdate();
        
        ps.close();
        cn.close();
    }
    
    //Trae las etiquetas de las criaturas, su id y la consulta a ejecutar. Pasa lo mismo que con el método anterior en cuanto a los ?.
    //Inserta las etiquetas en relacionesetiquetas, relacionando id de las criaturas con el id de las etiquetas.
    public void insertarEtiquetas(int etCria, int idCria, String consulta) throws Exception{

        ps=getConexion().prepareStatement(consulta);   
                
        ps.setInt(1, etCria);
        ps.setInt(2, idCria);

        ps.executeUpdate();
        
        cn.close();
    }
    
    //Borra las etiquetas relacionadas con un id. También usa executeUpdate().
    public void eliminarEtiquetas(String sql) throws Exception{
        ps=getConexion().prepareStatement(sql);   

        ps.executeUpdate();
        
        cn.close();
    }
    
    //Llena el ArrayList que trae. 
    //Primero hace la conexión y hace correr la búsqueda (el sql).
    //Después usa un bucle while que, mientras haya filas, recorre y rescata los objetos de la columna 1 y los agrega al ArrayList. Evita "Dos enemigos".
    //Al final cierra todo.
    public void llenarListaCriaturas(List lista, String busqueda)throws Exception{
        ps=getConexion().prepareStatement(busqueda);
        rs=ps.executeQuery();
        
        while (rs.next()) {
            if(!rs.getString(1).equals("Dos enemigos")){
                lista.add(rs.getString(1));
            }
        }
        
        ps.close();
        rs.close();
        cn.close();
    }
    
    //Es un método muy similar al anterior. Ver en Resultado que pone las criaturas en una tabla.
    //También determina el DefaultTableModel para que funcione de una determinada manera.
    public void llenarTabla(JTable tabla,String busqueda)throws Exception{      
        ps=getConexion().prepareStatement(busqueda);
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);                
            }
            datos.add(filas);
        }
        
        dtm=(DefaultTableModel)tabla.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
        
        rs.close();
        ps.close();
        cn.close();
    }
    
    //Los siguientes tres métodos se basan en traer, respectivamnete, un int, boolean o String a partir del id.
    //Se empieza reiniciando el valor a usar. Si corresponde, se lo iguala a lo que se trae de la base y después se devuelve.
    public int traerInt(String columna, String referencia) throws Exception{
        numero=0;
        
        ps=getConexion().prepareStatement("SELECT "+columna+" FROM criaturas WHERE "+referencia);
        rs=ps.executeQuery();
        
        if (rs.next()) { 
            numero = rs.getInt(columna);
        }
        
        rs.close();
        ps.close();
        cn.close();
        return numero;
    }
    
     public boolean traerBoolean (String columna, String referencia) throws Exception{
        booleano=false;
        
        ps=getConexion().prepareStatement("SELECT "+columna+" FROM criaturas WHERE "+referencia);
        rs=ps.executeQuery();
        
        if (rs.next()) { 
            booleano = rs.getBoolean(columna);
        }
        
        rs.close();
        ps.close();
        cn.close();
        return booleano;
    }
     
    public String traerString (String columna, String referencia) throws Exception{
        cadena="";
        
        ps=getConexion().prepareStatement("SELECT "+columna+" FROM criaturas WHERE "+referencia);
        rs=ps.executeQuery();
        
        if (rs.next()) { 
            cadena = rs.getString(columna);
        }
        
        rs.close();
        ps.close();
        cn.close();
        return cadena;
    }
    
    //Trae la etiqueta y la almacena en un String. 
    public String traerEtiqueta (String busqueda) throws Exception{
        cadena="";
        
        ps=getConexion().prepareStatement(busqueda);        
        rs=ps.executeQuery();
       
        while (rs.next()) {
            if(cadena.equals("")){
                cadena=rs.getString(1);
            }else{
                cadena=cadena+", "+rs.getString(1);
            }
        }
  
        rs.close();
        ps.close();
        cn.close();
        return cadena;
    }
    
    //Funciona muy parecido al método anterior, solamnete que usa un List.
    public void etiquetasArray (String busqueda, List lista) throws Exception{
        numero=0;
        
        ps=getConexion().prepareStatement(busqueda);        
        rs=ps.executeQuery();
        
        while (rs.next()) {
            lista.add(rs.getInt(1));
        }
  
        rs.close();
        ps.close();
        cn.close();
    }
}
