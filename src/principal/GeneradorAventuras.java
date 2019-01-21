package principal;

import conexion.ConexionDerby;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class GeneradorAventuras extends javax.swing.JFrame {   
    //Los nombres de los atributos son específicos y respetan el encapsulamiento. 
    private int rand, rand2, numeroCriatura, numeroMision, numeroComplicacion;
    private String tipoMision, tipoCriatura, tipoCriatura2, tipoSeleccionado, sql, tipoComplicacion;
    
    //Se hacen las listas para manejarlas con más comodidad más adelante.     
    private List <String> mision = new ArrayList<>();
    private List <String> criatura = new ArrayList<>();
    private List <String> complicacion = new ArrayList<>();
    private List <JTextArea> txt = new ArrayList<>();
    
    //Se instancia ConexionDerby para usar sus métodos y Resultado para mandarle datos.
    private Resultado R = new Resultado();
    private ConexionDerby CN = new ConexionDerby();
    
    public GeneradorAventuras() throws Exception {
        initComponents();
        //Facilita llevar las cosas a la otra pantalla a través de un solo método.        
        txt.add(R.txtMision);
        txt.add(R.txtBicho);
        txt.add(R.txtComp);

        //Se usa el método llenarCombo de ConexionDerby. Se llenan las listas y se cargan los combos.
        CN.llenarCombo(mision, lstMision, "SELECT nombre FROM misiones");
        CN.llenarCombo(criatura, lstBicho, "SELECT nombre FROM tipocriaturas");
        CN.llenarCombo(complicacion, lstComp, "SELECT nombre FROM complicaciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRandom = new javax.swing.JButton();
        lstMision = new javax.swing.JComboBox<>();
        lstBicho = new javax.swing.JComboBox<>();
        lstComp = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador rolero");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setIconImage(getIconImage());

        btnRandom.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnRandom.setText("¡Tirar!");
        btnRandom.setMaximumSize(new java.awt.Dimension(100, 37));
        btnRandom.setMinimumSize(new java.awt.Dimension(100, 37));
        btnRandom.setPreferredSize(new java.awt.Dimension(100, 37));
        btnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRandomActionPerformed(evt);
            }
        });

        lstMision.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lstMision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Aleatorio>" }));
        lstMision.setPreferredSize(new java.awt.Dimension(121, 28));

        lstBicho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lstBicho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Aleatorio>" }));

        lstComp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lstComp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Aleatorio>" }));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Misión");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Complicación");
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tipo de criaturas involucradas");
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 25));

        btnVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setMaximumSize(new java.awt.Dimension(100, 25));
        btnVolver.setMinimumSize(new java.awt.Dimension(100, 25));
        btnVolver.setPreferredSize(new java.awt.Dimension(100, 23));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lstBicho, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstComp, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRandom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lstMision, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lstMision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lstBicho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lstComp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnRandom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRandomActionPerformed
        //Mostrar pantalla        
        R.setVisible(true);
        R.setLocationRelativeTo(null);//para centrar la ventana
        R.setResizable(false);//Evita que se maximice la ventana
        
        //Se determina qué número de la lista es la Misión seleccionada.
        numeroMision=lstMision.getSelectedIndex();
        //Se toma el nombre de la misión para ponerla en la pantalla siguiente
        tipoMision = lstMision.getSelectedItem().toString();
        
        //Si la misión es el index 0, es decir, <Aleatorio>, se aplica el método rand  
        //Si no, entonces directamente se establece que la misión va a ser la seleccionada
        if(numeroMision==0){
            rand(mision, 0, tipoMision);
        }else{           
            txt.get(0).setText(tipoMision);
        }
        
        //Se toma el número seleccionado y se toma el String correspondiente.        
        numeroCriatura=lstBicho.getSelectedIndex();
        tipoSeleccionado=lstBicho.getSelectedItem().toString();
        
        //Si numeroCriatura es 0, entonces es <Aleatorio>, si tipoSeleccionado es "Dos enemigos" también se pasa para no repetir código. Se aplica el método rand2.
        //IMPORTANTE: LAS CADENAS SE COMPARAN CON EQUALS Y NO CON ==
        if(numeroCriatura==0||tipoSeleccionado.equalsIgnoreCase("Dos enemigos")){
            rand2(criatura, 1);        
            
            //Si rand2 devuelve tipoCriatura2 como no nulo o hay "Dos enemigos", entonces
            if(tipoCriatura2!=null||tipoSeleccionado.equalsIgnoreCase("Dos enemigos")){ 
                
                //Asegurarse de que rand es distinto de rand2
                do{
                rand=(int) (Math.random() * (criatura.size()-1));
                rand2=(int) (Math.random() * (criatura.size()-1));
                }while (rand==rand2);
                              
                //Se establecen tipoCriatura y tipoCriatura2 en base a rand y rand2 en la lista criatura
                tipoCriatura=(String) criatura.get(rand);
                tipoCriatura2=(String) criatura.get(rand2);

                //Se establece que el txtArea explicite los atributos
                txt.get(1).setText(tipoCriatura + " y " + tipoCriatura2);
                
                //Se les suma 1 porque el rand se hizo a partir del size() que toma desde valor 0, pero las id funcionan desde valor 1.
                rand=rand+1;
                rand2=rand2+1;
                
                //Si la tblEdit tiene algo, se borra.
                limpiarTabla(R.tblEdit);
                
                //Sentencia que va a servir para llenar la tabla con el método llenarTabla de ConexionDerby.
                sql="SELECT nombre FROM criaturas WHERE tcriatura_id="+rand+" OR tcriatura_id="+rand2;
                
                try {
                    CN.llenarTabla(R.tblEdit, sql);
                } catch (Exception ex) {
                    Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                //En caso contrario, se usa un solo rand
            }else{
                //Si la tblEdit tiene algo, se borra.
                limpiarTabla(R.tblEdit);
                
                //Se le suma 1 porque el rand se hizo a partir del size() que toma desde valor 0, pero las id funcionan desde valor 1.
                rand=rand+1;
                
                //Sentencia que va a servir para llenar la tabla con el método llenarTabla de ConexionDerby.
                sql="SELECT nombre FROM criaturas WHERE tcriatura_id="+rand;
                                
                try {
                    CN.llenarTabla(R.tblEdit, sql);
                } catch (Exception ex) {
                    Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
                }            
            }
            //Si ni numeroCriatura es 0 ni la selección es "Dos enemigos", entonces se manda el resultado seleccionado          
        }else{
            //Se toma el tipoSeleccionado y se lo manda al txt.
            txt.get(1).setText(tipoSeleccionado);
            
            //Si la tblEdit tiene algo, se borra.
                limpiarTabla(R.tblEdit);
            
            //Sentencia que va a servir para llenar la tabla con el método llenarTabla de ConexionDerby.
            sql="SELECT nombre FROM criaturas WHERE tcriatura_id="+numeroCriatura;
            
            try {
                CN.llenarTabla(R.tblEdit, sql);
            } catch (Exception ex) {
                Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }
        
        //Se le da a sqlResultado de Resultado el valor del sql que se haya aplicado. Va a servir en CrearCriatura.
        R.setSqlResultado(sql);
        
        //Si la complicación es el index 0, es decir, <Aleatorio>, se aplica el método rand. Si no, se lleva la seleccionada.
        numeroComplicacion=lstComp.getSelectedIndex();
        tipoComplicacion=lstComp.getSelectedItem().toString();
        
        if(numeroComplicacion==0){
        rand(complicacion, 2, tipoComplicacion);
        }else{
            txt.get(2).setText(tipoComplicacion);
        }
        
        //Al final, se cierra esta ventana.
        this.dispose();
    }//GEN-LAST:event_btnRandomActionPerformed

    //Vuelve a Principal, reinstanciando, centrando e impidiendo que se maximice. Al final, se cierra.
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal PP = new Principal();
        PP.setVisible(true);
        PP.setLocationRelativeTo(null);//para centrar la ventana
        PP.setResizable(false);//Evita que se maximice la ventana
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneradorAventuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorAventuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorAventuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorAventuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GeneradorAventuras().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRandom;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> lstBicho;
    private javax.swing.JComboBox<String> lstComp;
    private javax.swing.JComboBox<String> lstMision;
    // End of variables declaration//GEN-END:variables
    
    //Método rand para agarrar los elementos de la lista, elegir entre ellos y enviar la selección al txt de Resultado
    public void rand(List lista, int t, String tipo){
        rand=(int) (Math.random() * lista.size());
        tipo=(String) lista.get(rand);
        txt.get(t).setText(tipo);
    }
    
    //Similar al método anterior pero además, si el rand es igual al último elemento se ejecuta otro random que se sigue probando hasta que rand y rand2 sean distintos.
    public void rand2(List lista, int t){
        rand=(int) (Math.random() * lista.size());
        tipoCriatura=(String) lista.get(rand);
        //Nótese que, si bien lista.size() es 10, el último elemento es 9 porque empieza a contar desde 0.
        if(rand==(lista.size()-1)){           
            do{
            rand=(int) (Math.random() * (lista.size()-1));
            rand2=(int) (Math.random() * (lista.size()-1));
            }while (rand==rand2);
            
            tipoCriatura=(String) lista.get(rand);
            tipoCriatura2=(String) lista.get(rand2);

            txt.get(t).setText(tipoCriatura + " y " + tipoCriatura2);           
        }else{
            txt.get(t).setText(tipoCriatura);
        } 
    }
    
    //Método que sirve para limpiar la tabla si tenía contenido.
    private void limpiarTabla(JTable tabla){
        if(tabla!= null){
            while (tabla.getRowCount() > 0) {
                ((DefaultTableModel) tabla.getModel()).removeRow(0);
            }
        } 
    }
    
    //Getter de criatura para respetar encapsulamiento.
    public List<String> getCriatura() {
        return criatura;
    }
    
    //Este Override permite meter img/DW.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/DW.png"));
        return retValue;
    }
}
