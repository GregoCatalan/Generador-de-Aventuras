package bestiario;

import conexion.ConexionDerby;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import principal.GeneradorAventuras;
import principal.Resultado;

public class MostrarCriatura extends javax.swing.JFrame {
    //Los nombres de los atributos son específicos y respetan el encapsulamiento. 
    //Algunos están separados a pesar de ser del mismo tipo para denotar que corresponden a cosas distintas
    private String descripcion, instinto, formaAtaque, mov1, mov2, mov3, cua1, cua2, cua3, danioMejorPeor, danioArmadura, danioModDado, sqlConsulta, sqlCuenta; 
    private String sqlResultado, misionResultado, complicacionResultado, bichosResultado;
    private int id, PG, armadura, danioDado, tipoCriatura;
    private boolean danioNulo, distToque, distCerca, distCorto, distMedio, distLargo, contundente, escabroso, resultado;
    
    //Se hace la lista etiquetas para manejarlas con más comodidad más adelante.
    //Se instancia ConexionDerby para usar sus métodos.
    private List <Integer> etiquetas = new ArrayList();
    private ConexionDerby CN = new ConexionDerby();
            
    
    public MostrarCriatura() {
        initComponents();
        //Se ocultan los labels correspondientes a las Cualidades Especiales (porque no todas las criaturas tienen) y dos de los tres movimientos.
        lblCE.setVisible(false);
        lblCEE.setVisible(false);
        lblMov2.setVisible(false);
        lblMov3.setVisible(false);
        
        //Permite que txtDescIns rompa la línea cuando es demasiado larga (LineWrap) y que lo haga con palabras completas (WrapStyleWord)
        //También se desactiva la edición.
        txtDescIns.setLineWrap(true);
        txtDescIns.setWrapStyleWord(true);
        txtDescIns.setEditable(false);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblCEE = new javax.swing.JLabel();
        lblDMG = new javax.swing.JLabel();
        lblCE = new javax.swing.JLabel();
        lblMov1 = new javax.swing.JLabel();
        lblEtiquetas = new javax.swing.JLabel();
        lblEtDMG = new javax.swing.JLabel();
        lblPGyArm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescIns = new javax.swing.JTextArea();
        lblMov2 = new javax.swing.JLabel();
        lblMov3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador rolero");
        setIconImage(getIconImage());

        lblNombre.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNombre.setText("Nombre");
        lblNombre.setPreferredSize(new java.awt.Dimension(70, 25));

        lblCEE.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblCEE.setText("Cada cualidad");

        lblDMG.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDMG.setText("Daño");

        lblCE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCE.setText("Cualidades especiales:");

        lblMov1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMov1.setText("Movimiento 1");

        lblEtiquetas.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblEtiquetas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEtiquetas.setText("Etiquetas");

        lblEtDMG.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        lblEtDMG.setText("Etiquetas del daño");

        lblPGyArm.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPGyArm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPGyArm.setText("PG y Armadura");

        txtDescIns.setColumns(20);
        txtDescIns.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtDescIns.setRows(5);
        txtDescIns.setText("Descripción e instinto.\n");
        jScrollPane1.setViewportView(txtDescIns);

        lblMov2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMov2.setText("Movimiento 2");

        lblMov3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMov3.setText("Movimiento 3");

        btnEditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setPreferredSize(new java.awt.Dimension(110, 35));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setPreferredSize(new java.awt.Dimension(110, 35));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEtDMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMov3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMov2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMov1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCEE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPGyArm, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEtiquetas))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPGyArm)
                    .addComponent(lblDMG))
                .addGap(15, 15, 15)
                .addComponent(lblEtDMG)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblCEE)
                    .addComponent(lblCE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblMov1)
                .addGap(15, 15, 15)
                .addComponent(lblMov2)
                .addGap(15, 15, 15)
                .addComponent(lblMov3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //El btnEditar sirve para mandar toda la data acá presente a CrearCriatura para poder modificarla.
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {
            //Instancia, muestra, centra e impide que se maximice CrearCriatura.
            CrearCriatura CC = new CrearCriatura();
            CC.setVisible(true);
            CC.setLocationRelativeTo(null);//para centrar la ventana
            CC.setResizable(false);//Evita que se maximice la ventana
            
            //Se establece que el boolean edit de CrearCriatura sea true. Ver ahí qué implica.
            CC.setEdit(true);
            
            //Se lleva lo que haya en lblNombre al txtNombre de CrearCriatura. También se establece que el id sea el mismo que acá.
            CC.txtNombre.setText(lblNombre.getText());
            CC.setId(id);
            
            //Se usan los métodos traerString, traerInt y traerBoolean de ConexionDerby (ver ahí) para traer cada dato específico y almacenarlo en un atributo.
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
            
            PG=CN.traerInt("pg", "criatura_id="+id);
            armadura=CN.traerInt("armadura", "criatura_id="+id);
            danioDado=CN.traerInt("daniodado", "criatura_id="+id);
            tipoCriatura=CN.traerInt("tcriatura_id", "criatura_id="+id);
            
            danioNulo=CN.traerBoolean("danionulo", "criatura_id="+id);
            distToque=CN.traerBoolean("disttoque", "criatura_id="+id);
            distCerca=CN.traerBoolean("distcerca", "criatura_id="+id);
            distCorto=CN.traerBoolean("distcorto", "criatura_id="+id);
            distMedio=CN.traerBoolean("distmedio", "criatura_id="+id);
            distLargo=CN.traerBoolean("distlargo", "criatura_id="+id);
            contundente=CN.traerBoolean("contundente", "criatura_id="+id);
            escabroso=CN.traerBoolean("escabroso", "criatura_id="+id);
            
            //Se mandan los atributos a CrearCriatura
            CC.txtDescripcion.setText(descripcion);
            if(!formaAtaque.equals("")){CC.txtFormaAtaque.setText(formaAtaque);}
            CC.txtInstinto.setText(instinto);
            CC.txtMov1.setText(mov1);
            CC.txtMov2.setText(mov2);
            CC.txtMov3.setText(mov3);
            CC.txtCE1.setText(cua1);
            CC.txtCE2.setText(cua2);
            CC.txtCE3.setText(cua3);
            CC.txtPG.setText(String.valueOf(PG));
            CC.txtArm.setText(String.valueOf(armadura));
            
            CC.cbxTipoMonstruo.setSelectedIndex(tipoCriatura);
            
            //Si danioNulo es verdadero, se deshabilitan todas las opciones de CrearCriatura relacionadas al daño. Además, se colorean labels para denotarlo.
            //(funciona exactamente igual que ccbNuloActionPerformed en CrearCriatura)
            if(danioNulo==true){
                CC.ccbNulo.setSelected(true);
                CC.cbxModDmg.setEnabled(false);
                CC.lblD.setForeground(Color.gray); 
                CC.cbxTipoDado.setEnabled(false);
                CC.cbxModDado.setEnabled(false);
                CC.cbxDmgArm.setEnabled(false);
                CC.ccbToque.setEnabled(false);
                CC.ccbCerca.setEnabled(false);
                CC.ccbCortoA.setEnabled(false);
                CC.ccbMedioA.setEnabled(false);
                CC.ccbLargoA.setEnabled(false);
                CC.ccbContundente.setEnabled(false);
                CC.ccbEscabroso.setEnabled(false);
            }
            
            //Switchs que evalúan posibles respuestas y mandan datos en consecuencia.
            switch (danioMejorPeor) {
                case "Mejor":
                    CC.cbxModDmg.setSelectedIndex(2);
                    break;
                case "Peor":
                    CC.cbxModDmg.setSelectedIndex(1);
                    break;
                default:
                    CC.cbxModDmg.setSelectedIndex(0);
                    break;
            }

            switch(danioDado){
                case 4:
                    CC.cbxTipoDado.setSelectedIndex(0);
                    break;
                case 6:
                    CC.cbxTipoDado.setSelectedIndex(1);
                    break;
                case 8:
                    CC.cbxTipoDado.setSelectedIndex(2);
                    break;
                case 10:
                    CC.cbxTipoDado.setSelectedIndex(3);
                    break;
                case 12:
                    CC.cbxTipoDado.setSelectedIndex(4);
                    break;
                default:
                    CC.cbxTipoDado.setSelectedIndex(0);
            }
            
            switch(danioModDado){
                case "+0":
                    CC.cbxModDado.setSelectedIndex(0);
                    break;
                case "+1":
                    CC.cbxModDado.setSelectedIndex(1);
                    break;
                case "+2":
                    CC.cbxModDado.setSelectedIndex(2);
                    break;
                case "+3":
                    CC.cbxModDado.setSelectedIndex(3);
                    break;
                case "+4":
                    CC.cbxModDado.setSelectedIndex(4);
                    break;
                case "+5":
                    CC.cbxModDado.setSelectedIndex(5);
                    break;
                case "+6":
                    CC.cbxModDado.setSelectedIndex(6);
                    break;
                case "+7":
                    CC.cbxModDado.setSelectedIndex(7);
                    break;
                case "+8":
                    CC.cbxModDado.setSelectedIndex(8);
                    break;
                case "+9":
                    CC.cbxModDado.setSelectedIndex(9);
                    break;
                case "-1":
                    CC.cbxModDado.setSelectedIndex(10);
                    break; 
                case "-2":
                    CC.cbxModDado.setSelectedIndex(11);
                    break; 
                case "-3":
                    CC.cbxModDado.setSelectedIndex(12);
                    break; 
                case "-4":
                    CC.cbxModDado.setSelectedIndex(13);
                    break; 
                case "-5":
                    CC.cbxModDado.setSelectedIndex(14);
                    break;     
                default:
                    CC.cbxModDado.setSelectedIndex(0);    
            }
                        
            switch(danioArmadura){
                case "-":
                    CC.cbxDmgArm.setSelectedIndex(0);
                    break;
                case "Ignora armadura":
                    CC.cbxDmgArm.setSelectedIndex(1);
                    break;
                case "Penetrante 1":
                    CC.cbxDmgArm.setSelectedIndex(2);
                    break;  
                case "Penetrante 2":
                    CC.cbxDmgArm.setSelectedIndex(3);
                    break;  
                case "Penetrante 3":
                    CC.cbxDmgArm.setSelectedIndex(4);
                    break;  
                case "Penetrante 4":
                    CC.cbxDmgArm.setSelectedIndex(5);
                    break;     
                default:
                    CC.cbxDmgArm.setSelectedIndex(0);
            }
            
            //Ver método ifEtiquetaAtaque más abajo. La idea es que si la etiqueta es verdadera, se marca el combobox correspondiente en CrearCriatura.
            ifEtiquetaAtaque(distToque, CC.ccbToque);
            ifEtiquetaAtaque(distCerca, CC.ccbCerca);
            ifEtiquetaAtaque(distCorto, CC.ccbCortoA);
            ifEtiquetaAtaque(distMedio, CC.ccbMedioA);
            ifEtiquetaAtaque(distLargo, CC.ccbLargoA);
            ifEtiquetaAtaque(contundente, CC.ccbContundente);
            ifEtiquetaAtaque(escabroso, CC.ccbEscabroso);
            
            //Sentencias sql que laburan con etiquetasArray de ConexionDerby (ver ahí).
            sqlConsulta="SELECT etiqueta_id FROM relacionesetiquetas WHERE criatura_id="+id;
            
            CN.etiquetasArray (sqlConsulta, etiquetas);
            
            //Ver método ifEtiquetaCCB más abajo. La idea es que si el número está dentro de los guardados en etiquetas, se marca el combobox en CrearCriatura.
            ifEtiquetaCCB(etiquetas, CC.ccbAcaparador, 1);
            ifEtiquetaCCB(etiquetas, CC.ccbAmorfo, 2);
            ifEtiquetaCCB(etiquetas, CC.ccbCauto, 3);
            ifEtiquetaCCB(etiquetas, CC.ccbConstructo, 4);
            ifEtiquetaCCB(etiquetas, CC.ccbDivino, 5);
            ifEtiquetaCCB(etiquetas, CC.ccbInteligente, 6);
            ifEtiquetaCCB(etiquetas, CC.ccbMagico, 7);
            ifEtiquetaCCB(etiquetas, CC.ccbOrganizado, 8);
            ifEtiquetaCCB(etiquetas, CC.ccbPlanar, 9);
            ifEtiquetaCCB(etiquetas, CC.ccbSigiloso, 10);
            ifEtiquetaCCB(etiquetas, CC.ccbTaimado, 11);
            ifEtiquetaCCB(etiquetas, CC.ccbTerrorifico, 12);
            
            //Igual que ifEtiquetaCCB pero con radiobuttons.
            ifEtiquetaRBTN(etiquetas, CC.rbnHorda, 13);
            ifEtiquetaRBTN(etiquetas, CC.rbnGrupo, 14);
            ifEtiquetaRBTN(etiquetas, CC.rbnSolitario, 15);
            ifEtiquetaRBTN(etiquetas, CC.rbnDiminuto, 16);
            ifEtiquetaRBTN(etiquetas, CC.rbnPequeno, 17);
            ifEtiquetaRBTN(etiquetas, CC.rbnGrande, 18);
            ifEtiquetaRBTN(etiquetas, CC.rbnEnorme, 19);
            ifEtiquetaRBTN(etiquetas, CC.rbnHorda, 13);
            
            //Al final, cierra esta pantalla.
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(MostrarCriatura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnEditarActionPerformed
    
    //El btnVolver sirve para volver a la pantalla Resultado con todos los datos ya establecidos previamente o bien para volver al Bestiario.
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //Si el boolean resultado es verdadero, se instancia, centra, y bloquea Resultado.
        if(resultado==true){
            Resultado R = new Resultado();

            R.setVisible(true);
            R.setLocationRelativeTo(null);//para centrar la ventana
            R.setResizable(false);//Evita que se maximice la ventana
            
            //Se establecen los textos que vinieron de Resultado en la pantalla nueva.
            R.txtMision.setText(misionResultado);
            R.txtBicho.setText(bichosResultado);
            R.txtComp.setText(complicacionResultado);
            
            //Si tblEdit tiene datos, se borran.
            if(R.tblEdit!= null){
                while (R.tblEdit.getRowCount() > 0) {
                    ((DefaultTableModel) R.tblEdit.getModel()).removeRow(0);
                }
            }
            
            //Se usa el método llenarTabla de ConexionDerby para volver a traer a las criaturas.
            try {
                CN.llenarTabla(R.tblEdit, sqlResultado);
            } catch (Exception ex) {
                Logger.getLogger(GeneradorAventuras.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Se vuelve a establecer sqlResultado como tal. De otra manera, no podría volverse a esta instancia por segunda vez (o posteriores).
            R.setSqlResultado(sqlResultado);
        }
        
        //Si resultado es false, se vuelve a Bestiario.
        else if(resultado==false){
            try {
                Bestiario B = new Bestiario();
                
                B.setVisible(true);
                B.setVisible(true);
                B.setLocationRelativeTo(null);//para centrar la ventana
                B.setResizable(false);//Evita que se maximice la ventana
                
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(MostrarCriatura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Al final, se cierra esta ventana.
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
            java.util.logging.Logger.getLogger(MostrarCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarCriatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCE;
    public javax.swing.JLabel lblCEE;
    public javax.swing.JLabel lblDMG;
    public javax.swing.JLabel lblEtDMG;
    public javax.swing.JLabel lblEtiquetas;
    public javax.swing.JLabel lblMov1;
    public javax.swing.JLabel lblMov2;
    public javax.swing.JLabel lblMov3;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblPGyArm;
    public javax.swing.JTextArea txtDescIns;
    // End of variables declaration//GEN-END:variables
    
    //Se traen los booleans correspondientes a las etiquetas de ataque. Si son verdaderos, se marca el checkbox.
    private void ifEtiquetaAtaque(boolean etiqueta, JCheckBox checkbox){
        if(etiqueta){
            checkbox.setSelected(true);
        }
    }
    
    //Se trae el resto de las etiquetas a partir de la lista. Se itera con un for a través de toda la lista y, si contiene el int etiquetaId, se marca el checkbox.
    private void ifEtiquetaCCB(List lista, JCheckBox checkbox, int etiquetaId){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.contains(etiquetaId)){
                checkbox.setSelected(true);
            }
        }
    }
    
    //Ídem anterior pero con radiobuton en lugar de checkbox.
    private void ifEtiquetaRBTN(List lista, JRadioButton radiobutton, int etiquetaId){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.contains(etiquetaId)){
                radiobutton.setSelected(true);
            }
        }
    }
    
    //Setters necesarios para respetar el encapsulamiento.
    public void setId(int id) {
        this.id = id;
    }
    
    public void setSqlResultado(String sqlResultado) {
        this.sqlResultado = sqlResultado;
    }
    
    public void setMisionResultado(String misionResultado) {
        this.misionResultado = misionResultado;
    }

    public void setComplicacionResultado(String complicacionResultado) {
        this.complicacionResultado = complicacionResultado;
    }

    public void setBichosResultado(String bichosResultado) {
        this.bichosResultado = bichosResultado;
    }
    
    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }
    
    //Este Override permite meter img/DW.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/DW.png"));
        return retValue;
    }
}