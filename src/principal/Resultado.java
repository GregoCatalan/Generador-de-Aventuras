package principal;

import bestiario.MostrarCriatura;
import conexion.ConexionDerby;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Resultado extends javax.swing.JFrame {
    
    //Los nombres de los atributos son específicos y respetan el encapsulamiento.     
    private String nombreCriatura, descripcion, instinto, formaAtaque, mov1, mov2, mov3, cua1, cua2, cua3, danioMejorPeor, danioArmadura, danioModDado, etiquetasAtaque, 
            cualidades, etiquetasCriatura, sqlConsulta, sqlResultado;  
    private int PG, armadura, danioDado, id;
    private boolean danioNulo, distToque, distCerca, distCorto, distMedio, distLargo, contundente, escabroso;  
    
    private ConexionDerby CN = new ConexionDerby();
    
    //Se establece que los valores puestos en txtBicho, txtComp y txtMision no sean editablesn permite que rompan la línea cuando sean demasiado largas (LineWrap) 
    //y que lo hagan con palabras completas (WrapStyleWord)    
    public Resultado() {
        initComponents();
        txtBicho.setLineWrap(true);
        txtBicho.setWrapStyleWord(true);
        txtBicho.setEditable(false);
        txtComp.setLineWrap(true);
        txtComp.setWrapStyleWord(true);
        txtComp.setEditable(false);
        txtMision.setLineWrap(true);
        txtMision.setWrapStyleWord(true);
        txtMision.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEdit = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMision = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComp = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtBicho = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador rolero");
        setIconImage(getIconImage());

        tblEdit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criaturas"
            }
        ));
        tblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblEditMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(tblEdit);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tipo de criaturas involucradas");
        jLabel2.setPreferredSize(new java.awt.Dimension(360, 29));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Complicación");

        txtMision.setColumns(20);
        txtMision.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMision.setRows(5);
        txtMision.setPreferredSize(new java.awt.Dimension(200, 50));
        jScrollPane1.setViewportView(txtMision);

        txtComp.setColumns(20);
        txtComp.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtComp.setRows(5);
        txtComp.setPreferredSize(new java.awt.Dimension(224, 50));
        jScrollPane2.setViewportView(txtComp);

        txtBicho.setColumns(20);
        txtBicho.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtBicho.setRows(5);
        txtBicho.setPreferredSize(new java.awt.Dimension(225, 50));
        jScrollPane3.setViewportView(txtBicho);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Misión");
        jLabel1.setPreferredSize(new java.awt.Dimension(87, 29));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVolver.setText("Volver a inicio");
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnVolver)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Si se toca dos veces (evt.getClickCount==2) sobre cualquier elemento de tblEdit, se libera MostrarCriatura. Se instancia, centra e impide que se maximice.
    //Después, le agrega los datos correspondientes.
    private void tblEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditMouseReleased
        if(evt.getClickCount()==2){                          
            MostrarCriatura MC = new MostrarCriatura();
            
            MC.setVisible(true);
            MC.setLocationRelativeTo(null);
            MC.setResizable(false);          
            
            //El nombreCriatura es el mismo que se toca.
            nombreCriatura = (String) tblEdit.getValueAt(tblEdit.getSelectedRow(), 0);
            
            //Se trae el id con el método traerInt de ConexionDerby a partir del nombreCriatura.
            try {
                id=CN.traerInt("criatura_id", "nombre='"+nombreCriatura+"'");
            } catch (Exception ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //A partir del id, se traen todos los String con el método traerString de ConexionDerby.
            //Se repite el proceso con traerInt y traerBoolean.
            try {
                descripcion=CN.traerString("descripcion", "criatura_id="+id);
                instinto=CN.traerString("instinto", "criatura_id="+id);
                formaAtaque=CN.traerString("formaataque", "criatura_id="+id);
                mov1=CN.traerString("mov1", "criatura_id="+id);
                mov2=CN.traerString("mov2", "criatura_id="+id);
                mov3=CN.traerString("mov3", "criatura_id="+id);
                cua1=CN.traerString("cua1", "criatura_id="+id);
                cua2=CN.traerString("cua2", "criatura_id="+id);
                cua3=CN.traerString("cua3", "criatura_id="+id);
                danioMejorPeor=CN.traerString("daniomejorpeor", "criatura_id="+id);
                danioArmadura=CN.traerString("danioarmadura", "criatura_id="+id);
                danioModDado=CN.traerString("daniomoddado", "criatura_id="+id);
            } catch (Exception ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                PG=CN.traerInt("pg", "criatura_id="+id);
                armadura=CN.traerInt("armadura", "criatura_id="+id);
                danioDado=CN.traerInt("daniodado", "criatura_id="+id);
            } catch (Exception ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                danioNulo=CN.traerBoolean("danionulo", "criatura_id="+id);
                distToque=CN.traerBoolean("disttoque", "criatura_id="+id);
                distCerca=CN.traerBoolean("distcerca", "criatura_id="+id);
                distCorto=CN.traerBoolean("distcorto", "criatura_id="+id);
                distMedio=CN.traerBoolean("distmedio", "criatura_id="+id);
                distLargo=CN.traerBoolean("distlargo", "criatura_id="+id);
                contundente=CN.traerBoolean("contundente", "criatura_id="+id);
                escabroso=CN.traerBoolean("escabroso", "criatura_id="+id);
            } catch (Exception ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Cuando se tienen todos los elementos se procede a llevarlos a MostrarCriatura.
            MC.lblNombre.setText(nombreCriatura);
            MC.setId(id);
            MC.txtDescIns.setText(descripcion+" Instinto: "+instinto+".");
            
            //Si PG no es 0, reemplazar PG por el texto correspondiente. Si PG es 0, reemplazarlo por nada.
            if(PG!=0){
                MC.lblPGyArm.setText("PG "+PG+" Armadura "+armadura);
            }else{
                MC.lblPGyArm.setText("");
            }
            
            //Si danioArmadura trae "-", igualarlo a "".
            if(danioArmadura.equals("-")){
                danioArmadura="";
            }
            
            //Si danionulo es false, revisar si danioMejorPeor es Mejor, Peor o -. Después, si danioArmadura tiene datos almacenados, ponerlos y, si no, no ponerle nada.
            //Si danionulo es true, reemplazar lblDMG por nada.
            if(!danioNulo){
                if(danioMejorPeor.equals("Mejor")){
                    if(!danioArmadura.equals("")){
                        MC.lblDMG.setText(formaAtaque+" (daño m[2d"+danioDado+"]"+danioModDado+", "+danioArmadura.toLowerCase()+")");
                    }else{
                        MC.lblDMG.setText(formaAtaque+" (daño m[2d"+danioDado+"]"+danioModDado+")");
                    }
                }else if(danioMejorPeor.equals("Peor")){
                    if(!danioArmadura.equals("")){
                        MC.lblDMG.setText(formaAtaque+" (daño p[2d"+danioDado+"]"+danioModDado+", "+danioArmadura.toLowerCase()+")");
                    }else{
                        MC.lblDMG.setText(formaAtaque+" (daño p[2d"+danioDado+"]"+danioModDado+")");
                    }
                }else if(danioMejorPeor.equals("-")){
                    if(!danioArmadura.equals("")){
                        MC.lblDMG.setText(formaAtaque+" (daño d"+danioDado+danioModDado+", "+danioArmadura.toLowerCase()+")");
                    }else{
                        MC.lblDMG.setText(formaAtaque+" (daño d"+danioDado+danioModDado+")");
                    }
                }else{
                    System.out.println("Error");
                }        
            }else{
                MC.lblDMG.setText("");
            }
            
            //Se vacía el String etiquetasAtaque
            etiquetasAtaque="";
            
            //Si danioNulo es false, se implementa el método ifEtiquetaAtaque (ver abajo) con cada boolean referido a etiquetas de ataque. y un String correspondiente.
            //Al final, el String resultante se lleva a lblEtDMG. Si danioNulo es true, lblEtDMG es igual a nada.
            if(!danioNulo){              
                etiquetasAtaque=ifEtiquetaAtaque(distToque, "Toque");
                etiquetasAtaque=ifEtiquetaAtaque(distCerca, "Cerca");
                etiquetasAtaque=ifEtiquetaAtaque(distCorto, "Corto alcance");
                etiquetasAtaque=ifEtiquetaAtaque(distMedio, "Medio alcance");
                etiquetasAtaque=ifEtiquetaAtaque(distLargo, "Largo alcance");
                etiquetasAtaque=ifEtiquetaAtaque(contundente, "Contundente");
                etiquetasAtaque=ifEtiquetaAtaque(escabroso, "Escabroso");
                
                MC.lblEtDMG.setText(etiquetasAtaque);
            }else{
                MC.lblEtDMG.setText("");
            }
            
            //Si cua1 no está vacío, mostrar lblCE y lblCEE. Después, sumar cua2 y cua3 al texto que se va a enviar a lblCEE si no están vacías.
            if(!cua1.equals("")){
                MC.lblCE.setVisible(true);
                MC.lblCEE.setVisible(true);
                
                cualidades=cua1+".";
                if(!cua2.equals("")){
                    cualidades=cua1+", "+cua2+".";
                    if(!cua3.equals("")){
                        cualidades=cualidades+", "+cua3+".";
                    }
                }
                
                MC.lblCEE.setText(cualidades);
            }
            
            //Muy similar al if anterior, solo que lblMov1 no está oculto por default porque se presupone que tiene contenido. Sin embargo, se contempla el caso de error.
            if(!mov1.equals("")){
                MC.lblMov1.setText(mov1);
                if(!mov2.equals("")){
                    MC.lblMov2.setText(mov2);
                    MC.lblMov2.setVisible(true);
                    if(!mov3.equals("")){
                        MC.lblMov3.setText(mov3);
                        MC.lblMov3.setVisible(true);
                    }
                }
            }else{
                MC.lblMov1.setText("");
            }
            
            //Consultas sql para manipular las etiquetas. La primera relaciona criaturas con etiquetas a través de relacionesetiquetas.
            sqlConsulta="SELECT E.nombre FROM criaturas C, etiquetas E, relacionesetiquetas R WHERE R.etiqueta_id=E.etiqueta_id AND R.criatura_id=C.criatura_id AND C.criatura_id="+id;
            
            //Se usa el método traerEtiqueta de ConexionDerby que permite traer en un solo String todas las etiquetas. Después, se manda a lblEtiquetas.
            try {
                etiquetasCriatura=CN.traerEtiqueta(sqlConsulta);
            } catch (Exception ex) {
                Logger.getLogger(Resultado.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            MC.lblEtiquetas.setText(etiquetasCriatura);
            
            //Se usan los setters de MostrarCriatura que sirven pura y exclusivamente por si es necesario recuperar los valores de Resultado desde MostrarCriatura.
            MC.setMisionResultado(txtMision.getText());
            MC.setBichosResultado(txtBicho.getText());
            MC.setComplicacionResultado(txtComp.getText());
            MC.setSqlResultado(sqlResultado);
            MC.setResultado(true);
            
            //Al final se cierra esta ventana.
            this.dispose();
        }
    }//GEN-LAST:event_tblEditMouseReleased

    //Instancia Principal, lo muestra, centra y evita que se maximice. Después cierra esta ventana.
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal P = new Principal();

        P.setVisible(true);
        P.setLocationRelativeTo(null);//para centrar la ventana
        P.setResizable(false);//Evita que se maximice la ventana
        
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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTable tblEdit;
    public javax.swing.JTextArea txtBicho;
    public javax.swing.JTextArea txtComp;
    public javax.swing.JTextArea txtMision;
    // End of variables declaration//GEN-END:variables
   
    //El método trae un boolean correspondiente a la etiqueta de ataque y una palabra a sumar. Si el boolean es verdadero y es el primero, se establece que 
    //etiquetasAtaque es igual a la palabra. Si es verdadero pero no es el primero, la palabra se suma al String que al final se devuelve.
    private String ifEtiquetaAtaque(boolean etiqueta, String palabra){
        if(etiqueta){
            if(etiquetasAtaque.equals("")){
                etiquetasAtaque=palabra;
            }else{
                etiquetasAtaque=etiquetasAtaque+", "+palabra;
            }
        }      
        return etiquetasAtaque;
    }
    
    //Setter de sqlResultado.
    public void setSqlResultado(String sqlResultado) {
        this.sqlResultado = sqlResultado;
    }
    
    //Este Override permite meter img/DW.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/DW.png"));
        return retValue;
    }
}
