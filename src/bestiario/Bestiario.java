package bestiario;

import conexion.ConexionDerby;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.GeneradorAventuras;
import principal.Principal;

public class Bestiario extends javax.swing.JFrame {

    private String nombreCriatura, descripcion, instinto, formaAtaque, mov1, mov2, mov3, cua1, cua2, cua3, danioMejorPeor, danioArmadura, danioModDado, etiquetasAtaque, 
            cualidades, etiquetasCriatura, sql, sqlConsulta;  
    private int PG, armadura, danioDado, id;
    private boolean danioNulo, distToque, distCerca, distCorto, distMedio, distLargo, contundente, escabroso; 

    private ConexionDerby CN = new ConexionDerby();
    private GeneradorAventuras GA = new GeneradorAventuras();
    
    public Bestiario() throws Exception {
        initComponents();
        
        //Se traen los tipos de criatura de GeneradorAventuras a través del método getCriatura y se llena el cbxTipoCriatura
        for(int i = 0; i < GA.getCriatura().size(); i++) {
            if(!GA.getCriatura().get(i).equals("Dos enemigos")){
                cbxTipoCriatura.addItem(GA.getCriatura().get(i));
            }
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoCriatura = new javax.swing.JLabel();
        cbxTipoCriatura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCriaturas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnAgregarCriatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador rolero");
        setIconImage(getIconImage());

        lblTipoCriatura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTipoCriatura.setText("¿Qué tipo de criatura desea ver?");

        cbxTipoCriatura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbxTipoCriatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>" }));
        cbxTipoCriatura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoCriaturaItemStateChanged(evt);
            }
        });

        tblCriaturas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCriaturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criaturas"
            }
        ));
        tblCriaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblCriaturasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblCriaturas);

        btnVolver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAgregarCriatura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAgregarCriatura.setText("Agregar criatura");
        btnAgregarCriatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCriaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregarCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbxTipoCriatura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipoCriatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //A partir del ítem seleccionado en cbxTipoCriatura se muestran las criaturas correspondientes a ese tipo en tblCriaturas
    private void cbxTipoCriaturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoCriaturaItemStateChanged
        sql="SELECT nombre FROM criaturas WHERE tcriatura_id="+cbxTipoCriatura.getSelectedIndex();
        
        if(tblCriaturas!= null){
            while (tblCriaturas.getRowCount() > 0) {
                ((DefaultTableModel) tblCriaturas.getModel()).removeRow(0);
            }
        } 
        
        try {
            CN.llenarTabla(tblCriaturas, sql);
        } catch (Exception ex) {
            Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbxTipoCriaturaItemStateChanged
    
    //Si se toca dos veces (evt.getClickCount==2) sobre cualquier elemento de tblCriaturas, se libera MostrarCriatura. Se instancia, centra e impide que se maximice.
    //Después, le agrega los datos correspondientes.
    private void tblCriaturasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCriaturasMouseReleased
        if(evt.getClickCount()==2){                          
            MostrarCriatura MC = new MostrarCriatura();
            
            MC.setVisible(true);
            MC.setLocationRelativeTo(null);
            MC.setResizable(false);          
            
            //El nombreCriatura es el mismo que se toca.
            nombreCriatura = (String) tblCriaturas.getValueAt(tblCriaturas.getSelectedRow(), 0);
            
            //Se trae el id con el método traerInt de ConexionDerby a partir del nombreCriatura.
            try {
                id=CN.traerInt("criatura_id", "nombre='"+nombreCriatura+"'");
            } catch (Exception ex) {
                Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                PG=CN.traerInt("pg", "criatura_id="+id);
                armadura=CN.traerInt("armadura", "criatura_id="+id);
                danioDado=CN.traerInt("daniodado", "criatura_id="+id);
            } catch (Exception ex) {
                Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
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
                
                cualidades=cua1;
                if(!cua2.equals("")){
                    cualidades=cua1+", "+cua2;
                    if(!cua3.equals("")){
                        cualidades=cualidades+", "+cua3;
                    }
                }
                
                MC.lblCEE.setText(cualidades+".");
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
                Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            MC.lblEtiquetas.setText(etiquetasCriatura);
            
            //Se usa setResultado para indicarle a MostrarCriatura qué tiene que hacer si se toca el botón Volver.
            MC.setResultado(false);
            
            //Al final se cierra esta ventana.
            this.dispose();
        }
    }//GEN-LAST:event_tblCriaturasMouseReleased

    //Instancia CrearCriatura, lo muestra, centra y evita que se maximice. Establece en false el boolean Edit a través del método setEdit. Después cierra esta ventana.
    private void btnAgregarCriaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCriaturaActionPerformed
        try {
            CrearCriatura CC = new CrearCriatura();
            CC.setVisible(true);
            CC.setLocationRelativeTo(null);//para centrar la ventana
            CC.setResizable(false);//Evita que se maximice la ventana
            CC.setEdit(false);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarCriaturaActionPerformed

    //Instancia Principal, lo muestra, centra y evita que se maximice. Después cierra esta ventana.
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal P = new Principal();
            
        P.setVisible(true);
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
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bestiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bestiario().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Bestiario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCriatura;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxTipoCriatura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTipoCriatura;
    private javax.swing.JTable tblCriaturas;
    // End of variables declaration//GEN-END:variables
    
    //El método trae un boolean correspondiente a la etiqueta de ataque y una palabra a sumar. Si el boolean es verdadero y es el primero, se establece que 
    //etiquetasAtaque es igual a la palabra. Si es verdadero pero no es el primero, la palabra se suma al String que al final se devuelve.
    //NOTA: Usar el método idéntico desde Resultado daba error.
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
    
    //Este Override permite meter img/DW.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/DW.png"));
        return retValue;
    }
}