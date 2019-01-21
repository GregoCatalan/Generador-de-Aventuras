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
import javax.swing.JOptionPane;
import principal.GeneradorAventuras;
import principal.Principal;

public class CrearCriatura extends javax.swing.JFrame {
    
    //Los nombres de los atributos son específicos y respetan el encapsulamiento. 
    //Algunos están separados a pesar de ser del mismo tipo para denotar que corresponden a cosas distintas
    private int etGrupo, etTamano, etAcaparador, etAmorfo, etCauto, etConstructo, etDivino, etInteligente, etMagico, etOrganizado, etPlanar, 
            etSigiloso, etTaimado, etTerrorifico;
    private List <Integer> etiquetasCriatura = new ArrayList<>();
    private String nombre, descripcion, instinto, formaAtaque, mov1, mov2, mov3, cua1, cua2, cua3, danioMejorPeor, danioArmadura, danioModDado;
    private String sqlInsertar, sqlActualizar, sqlEtiquetas;
    private int id, PG, armadura, tipoCriatura, danioDado, aux;
    private int resp= -1;
    private int resp2= -1;
    private boolean pgyarm, pgnull, armnull, desc, ins, descIns, cualidades, move1, move2, moves, distAtaque, condiciones;
    private boolean danioNulo, distToque, distCerca, distCorto, distMedio, distLargo, contundente, escabroso, edit;
    private String regex, regex2;
    
    //Se instancian GeneradorAventuras y ConexionDerby para traer métodos y atributos
    private GeneradorAventuras GA = new GeneradorAventuras();
    private ConexionDerby C = new ConexionDerby();
    private Principal P = new Principal ();
    
    public CrearCriatura() throws Exception {
        initComponents();
        //Permite que txtDescripción rompa la línea cuando es demasiado larga (LineWrap) y que lo haga con palabras completas (WrapStyleWord)
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        
        //Se usa la misma lista que usa GA.criatura para el cbxTipoMonstruo. Con el For se trae elemento por elemento, salvo que sea "Dos enemigos".
        for(int i = 0; i < GA.getCriatura().size(); i++) {
            if(!GA.getCriatura().get(i).equals("Dos enemigos")){
                cbxTipoMonstruo.addItem(GA.getCriatura().get(i));
            }
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpOrganizacion = new javax.swing.ButtonGroup();
        bgpTamano = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtPG = new javax.swing.JTextField();
        txtArm = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblDmgArm = new javax.swing.JLabel();
        cbxTipoDado = new javax.swing.JComboBox<>();
        cbxModDmg = new javax.swing.JComboBox<>();
        lblD = new javax.swing.JLabel();
        cbxModDado = new javax.swing.JComboBox<>();
        ccbNulo = new javax.swing.JCheckBox();
        cbxDmgArm = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        ccbToque = new javax.swing.JCheckBox();
        ccbCerca = new javax.swing.JCheckBox();
        ccbCortoA = new javax.swing.JCheckBox();
        ccbLargoA = new javax.swing.JCheckBox();
        ccbMedioA = new javax.swing.JCheckBox();
        lblDistAtaque = new javax.swing.JLabel();
        ccbEscabroso = new javax.swing.JCheckBox();
        ccbContundente = new javax.swing.JCheckBox();
        lblParticularidad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ccbAcaparador = new javax.swing.JCheckBox();
        ccbDivino = new javax.swing.JCheckBox();
        ccbAmorfo = new javax.swing.JCheckBox();
        ccbCauto = new javax.swing.JCheckBox();
        ccbConstructo = new javax.swing.JCheckBox();
        ccbInteligente = new javax.swing.JCheckBox();
        ccbMagico = new javax.swing.JCheckBox();
        ccbOrganizado = new javax.swing.JCheckBox();
        ccbPlanar = new javax.swing.JCheckBox();
        ccbTerrorifico = new javax.swing.JCheckBox();
        ccbTaimado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ccbSigiloso = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        rbnHorda = new javax.swing.JRadioButton();
        rbnGrupo = new javax.swing.JRadioButton();
        rbnSolitario = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rbnDiminuto = new javax.swing.JRadioButton();
        rbnPequeno = new javax.swing.JRadioButton();
        rbnGrande = new javax.swing.JRadioButton();
        rbnEnorme = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        txtInstinto = new javax.swing.JTextField();
        lblFormaAtaque = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFormaAtaque = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        txtMov1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMov2 = new javax.swing.JTextField();
        txtMov3 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txtCE1 = new javax.swing.JTextField();
        txtCE2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCE3 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cbxTipoMonstruo = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador rolero");
        setIconImage(getIconImage());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Etiquetas");

        jLabel18.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel18.setText("Nota: Si la criatura es de tamaño humanoide");

        jLabel19.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        jLabel19.setText("no es necesario establecer el tamaño.");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Puntos de Golpe");

        txtPG.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPG.setPreferredSize(new java.awt.Dimension(100, 25));

        txtArm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtArm.setPreferredSize(new java.awt.Dimension(100, 25));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Armadura");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(txtPG, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(txtArm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(txtPG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(450, 86));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Daño");

        lblDmgArm.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDmgArm.setText("¿Cómo se comporta frente a la armadura?");

        cbxTipoDado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTipoDado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "6", "8", "10", "12" }));

        cbxModDmg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxModDmg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Peor", "Mejor" }));

        lblD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblD.setText("d");

        cbxModDado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxModDado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+0", "+1", "+2", "+3", "+4", "+5", "+6", "+7", "+8", "+9", "-1", "-2", "-3", "-4", "-5" }));

        ccbNulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbNulo.setText("Daño nulo");
        ccbNulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccbNuloActionPerformed(evt);
            }
        });

        cbxDmgArm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxDmgArm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Ignora armadura", "Penetrante 1", "Penetrante 2", "Penetrante 3", "Penetrante 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(cbxModDmg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblD, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cbxTipoDado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(cbxModDado, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(ccbNulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDmgArm)
                        .addGap(4, 4, 4)
                        .addComponent(cbxDmgArm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ccbNulo)
                    .addComponent(cbxModDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTipoDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblD)
                    .addComponent(cbxModDmg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbxDmgArm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDmgArm))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 205));

        ccbToque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbToque.setText("Toque");

        ccbCerca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbCerca.setText("Cerca");

        ccbCortoA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbCortoA.setText("Corto alcance");

        ccbLargoA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbLargoA.setText("Largo alcance");

        ccbMedioA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbMedioA.setText("Medio alcance");

        lblDistAtaque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDistAtaque.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDistAtaque.setText("Distancia del ataque:");

        ccbEscabroso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbEscabroso.setText("Escabroso");

        ccbContundente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbContundente.setText("Contundente");

        lblParticularidad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblParticularidad.setText("¿Su ataque tiene alguna particularidad?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(ccbEscabroso))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblParticularidad)
                        .addGap(6, 6, 6)
                        .addComponent(ccbContundente))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblDistAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ccbToque, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccbLargoA)
                            .addComponent(ccbCerca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccbCortoA, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ccbMedioA))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ccbToque)
                    .addComponent(lblDistAtaque))
                .addGap(3, 3, 3)
                .addComponent(ccbCerca)
                .addGap(3, 3, 3)
                .addComponent(ccbCortoA)
                .addGap(3, 3, 3)
                .addComponent(ccbMedioA)
                .addGap(3, 3, 3)
                .addComponent(ccbLargoA)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblParticularidad))
                    .addComponent(ccbContundente))
                .addGap(3, 3, 3)
                .addComponent(ccbEscabroso)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        ccbAcaparador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbAcaparador.setText("Acaparador");
        ccbAcaparador.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbDivino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbDivino.setText("Divino");
        ccbDivino.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbAmorfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbAmorfo.setText("Amorfo");
        ccbAmorfo.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbCauto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbCauto.setText("Cauto");
        ccbCauto.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbConstructo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbConstructo.setText("Constructo");
        ccbConstructo.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbInteligente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbInteligente.setText("Inteligente");
        ccbInteligente.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbMagico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbMagico.setText("Mágico");
        ccbMagico.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbOrganizado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbOrganizado.setText("Organizado");
        ccbOrganizado.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbPlanar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbPlanar.setText("Planar");
        ccbPlanar.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbTerrorifico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbTerrorifico.setText("Terrorífico");
        ccbTerrorifico.setPreferredSize(new java.awt.Dimension(100, 23));

        ccbTaimado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbTaimado.setText("Taimado");
        ccbTaimado.setPreferredSize(new java.awt.Dimension(100, 23));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Generales:");

        ccbSigiloso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ccbSigiloso.setText("Sigiloso");
        ccbSigiloso.setPreferredSize(new java.awt.Dimension(100, 23));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ccbTerrorifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbAmorfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbAcaparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbCauto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbConstructo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbDivino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbInteligente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbMagico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbOrganizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbPlanar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbSigiloso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ccbTaimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccbAcaparador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addComponent(ccbAmorfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(ccbCauto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbConstructo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbDivino, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbInteligente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbMagico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbOrganizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbPlanar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbSigiloso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbTaimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(ccbTerrorifico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("De organización:");

        bgpOrganizacion.add(rbnHorda);
        rbnHorda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnHorda.setText("Horda");

        bgpOrganizacion.add(rbnGrupo);
        rbnGrupo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnGrupo.setText("Grupo");

        bgpOrganizacion.add(rbnSolitario);
        rbnSolitario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnSolitario.setText("Solitario");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbnSolitario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnHorda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(rbnHorda))
                .addGap(3, 3, 3)
                .addComponent(rbnGrupo)
                .addGap(3, 3, 3)
                .addComponent(rbnSolitario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("De tamaño:");

        bgpTamano.add(rbnDiminuto);
        rbnDiminuto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnDiminuto.setText("Diminuto");

        bgpTamano.add(rbnPequeno);
        rbnPequeno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnPequeno.setText("Pequeño");

        bgpTamano.add(rbnGrande);
        rbnGrande.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnGrande.setText("Grande");

        bgpTamano.add(rbnEnorme);
        rbnEnorme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbnEnorme.setText("Enorme");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbnPequeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnDiminuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnGrande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbnEnorme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(rbnDiminuto))
                .addGap(3, 3, 3)
                .addComponent(rbnPequeno)
                .addGap(3, 3, 3)
                .addComponent(rbnGrande)
                .addGap(3, 3, 3)
                .addComponent(rbnEnorme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 48));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 25));

        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(59, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setPreferredSize(new java.awt.Dimension(300, 201));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Descripción");
        jLabel13.setPreferredSize(new java.awt.Dimension(104, 25));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(300, 100));

        txtInstinto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInstinto.setPreferredSize(new java.awt.Dimension(59, 25));

        lblFormaAtaque.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFormaAtaque.setText("Forma de ataque");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Instinto");

        txtFormaAtaque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormaAtaque.setPreferredSize(new java.awt.Dimension(63, 25));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormaAtaque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFormaAtaque)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtInstinto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblFormaAtaque)
                .addGap(3, 3, 3)
                .addComponent(txtFormaAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(txtInstinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel10.setPreferredSize(new java.awt.Dimension(300, 500));

        txtMov1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMov1.setPreferredSize(new java.awt.Dimension(59, 25));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Movimientos");

        txtMov2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMov2.setPreferredSize(new java.awt.Dimension(59, 25));

        txtMov3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMov3.setPreferredSize(new java.awt.Dimension(59, 25));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMov1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMov2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMov3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addComponent(txtMov1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtMov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtMov3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel11.setPreferredSize(new java.awt.Dimension(300, 500));

        txtCE1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCE1.setPreferredSize(new java.awt.Dimension(59, 25));

        txtCE2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCE2.setPreferredSize(new java.awt.Dimension(59, 25));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Cualidades especiales");

        txtCE3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCE3.setPreferredSize(new java.awt.Dimension(59, 25));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 184, Short.MAX_VALUE))
                    .addComponent(txtCE3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCE1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Tipo de criatura");

        cbxTipoMonstruo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbxTipoMonstruo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoMonstruo, 0, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoMonstruo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setPreferredSize(new java.awt.Dimension(115, 35));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(115, 35));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel5))
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel18)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel19))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Si se tilda Daño Nulo, se deshabilitan todas las opciones relacionadas al daño. Si se destilda, se vuelven a habilitar.
    //Además, se colorean labels para denotarlo.
    private void ccbNuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccbNuloActionPerformed
        if(ccbNulo.isSelected()){
            cbxModDmg.setEnabled(false);
            lblD.setForeground(Color.gray); 
            cbxTipoDado.setEnabled(false);
            cbxModDado.setEnabled(false);
            cbxDmgArm.setEnabled(false);
            ccbToque.setEnabled(false);
            ccbCerca.setEnabled(false);
            ccbCortoA.setEnabled(false);
            ccbMedioA.setEnabled(false);
            ccbLargoA.setEnabled(false);
            ccbContundente.setEnabled(false);
            ccbEscabroso.setEnabled(false);
            lblFormaAtaque.setForeground(Color.gray);
            txtFormaAtaque.setEnabled(false);
            lblDmgArm.setForeground(Color.gray);
            lblDistAtaque.setForeground(Color.gray);
            lblParticularidad.setForeground(Color.gray);   
        }else{
            cbxModDmg.setEnabled(true);
            lblD.setForeground(Color.black); 
            cbxTipoDado.setEnabled(true);
            cbxModDado.setEnabled(true);
            cbxDmgArm.setEnabled(true);
            ccbToque.setEnabled(true);
            ccbCerca.setEnabled(true);
            ccbCortoA.setEnabled(true);
            ccbMedioA.setEnabled(true);
            ccbLargoA.setEnabled(true);
            ccbContundente.setEnabled(true);
            ccbEscabroso.setEnabled(true);
            lblFormaAtaque.setForeground(Color.black);
            txtFormaAtaque.setEnabled(false);
            lblDmgArm.setForeground(Color.black);
            lblDistAtaque.setForeground(Color.black);
            lblParticularidad.setForeground(Color.black); 
        }       
    }//GEN-LAST:event_ccbNuloActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //nombre, formaAtaque y tipoCriatura se toman dependiendo de lo que está marcado en el JFrame.        
        nombre = txtNombre.getText();
        formaAtaque = txtFormaAtaque.getText();       
        tipoCriatura = cbxTipoMonstruo.getSelectedIndex();
        
        //NOTA DEL REGEX: CON EL \\d SOLO EVALUA 1 CCE. LO DE AL LADO ESTABLECE LÍMITES ENTRE 1 Y 2.
        //Los regex sirven para evaluar si hay cierto tipo de cce en txtPG y txtArm. Específicamente, si están vacíos o si tienen alguna letra.
        regex="[\\d]{1,2}";
        regex2="[\\s]{0,100}";
        
        pgyarm = txtPG.getText().matches(regex) && txtArm.getText().matches(regex);
        pgnull = txtPG.getText().matches(regex2); 
        armnull = txtArm.getText().matches(regex2);
        
        //Si txtPG está vacío, se despliega un JOptionPane de confirmación. Lo mismo pasa con txtArm.
        //Si ambos tienen valores válidos, se guardan.
        //Si alguno de los dos no tiene valores válidos, se despliega un JOptionPane de aviso.
        if(pgnull){
            resp = JOptionPane.showConfirmDialog(null, "No está poniéndole puntos de vida a la criatura. ¿Desea continuar?", "¡Cuidado!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if(resp==0){
                    PG=0;
                }
        }else if(armnull){
            resp2 = JOptionPane.showConfirmDialog(null, "No está poniéndole puntos de armadura a la criatura. ¿Desea continuar?", "¡Cuidado!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
                if(resp2==0){
                    armadura=0;
            }
        }else if(pgyarm){
            PG=Integer.valueOf(txtPG.getText());
            armadura=Integer.valueOf(txtArm.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Los valores de Puntos de Golpe y Armadura deben expresarse en cifras", "Error", JOptionPane.WARNING_MESSAGE);
        }     
        
        //Según bgpOrganizacion hay un radiobutton a pulsarse. Según cuál sea, se establece que etGrupo tiene un valor igual al que tiene de id en la base.
        if(rbnHorda.isSelected()){
            etGrupo=13;
        }else if(rbnGrupo.isSelected()){
            etGrupo=14;
        }else if(rbnSolitario.isSelected()){
            etGrupo=15;
        }else{
            etGrupo=0;
        }  
        
        //Ídem pero con bgpTamano
        if(rbnDiminuto.isSelected()){
            etTamano=16;
        }else if(rbnPequeno.isSelected()){
            etTamano=17;
        }else if(rbnGrande.isSelected()){
            etTamano=18;
        }else if(rbnEnorme.isSelected()){
            etTamano=19;
        }else{
            etTamano=0;
        }
        
        //Usa el método manejarEtiqueta (ver abajo) para asignarle valores a cada int de tipo etiqueta. Después se agregan los valores a la List etiquetasCriatura.
        etAcaparador=manejarEtiqueta(ccbAcaparador, 1);
        etAmorfo=manejarEtiqueta(ccbAmorfo, 2);
        etCauto=manejarEtiqueta(ccbCauto, 3);
        etConstructo=manejarEtiqueta(ccbConstructo, 4);
        etDivino=manejarEtiqueta(ccbDivino, 5);
        etInteligente=manejarEtiqueta(ccbInteligente, 6);
        etMagico=manejarEtiqueta(ccbMagico, 7);
        etOrganizado=manejarEtiqueta(ccbOrganizado, 8);
        etPlanar=manejarEtiqueta(ccbPlanar, 9);
        etSigiloso=manejarEtiqueta(ccbSigiloso, 10);
        etTaimado=manejarEtiqueta(ccbTaimado, 11);
        etTerrorifico=manejarEtiqueta(ccbTerrorifico, 12);
          
        etiquetasCriatura.add(etGrupo);
        etiquetasCriatura.add(etTamano);
        etiquetasCriatura.add(etAcaparador);
        etiquetasCriatura.add(etAmorfo);
        etiquetasCriatura.add(etCauto);
        etiquetasCriatura.add(etConstructo);
        etiquetasCriatura.add(etDivino);
        etiquetasCriatura.add(etInteligente);
        etiquetasCriatura.add(etMagico);
        etiquetasCriatura.add(etOrganizado);
        etiquetasCriatura.add(etPlanar);
        etiquetasCriatura.add(etSigiloso);
        etiquetasCriatura.add(etTaimado);
        etiquetasCriatura.add(etTerrorifico);                   
        
        //Si txtDescripcion está vacío, desc es verdadero. Ídem con txtInstinto e ins. Si ambos son falsos, descIns es verdadero y se usa más adelante.
        desc = txtDescripcion.getText().equals("");
        ins = txtInstinto.getText().equals("");
        descIns = desc==false && ins==false;
        
        //Sí desc es falso, se despliega un JOptionPane para avisar.
        if(desc){
            JOptionPane.showMessageDialog(null, "Por favor, escriba una Descripción", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            descripcion = txtDescripcion.getText();
        }
        
        //Ídem anterior, pero con ins.
        if(ins){
            JOptionPane.showMessageDialog(null, "Por favor, escriba un Instinto", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            instinto = txtInstinto.getText();
        }
   
        //El boolean cualidades revisa si se escribió la tercera cualidad sin haber escrito la segunda y/o primera, o la segunda sin haber escrito la primera.
        cualidades=(txtCE1.getText().equals("") && (!txtCE2.getText().equals("") || !txtCE3.getText().equals(""))) || (txtCE2.getText().equals("") 
                && !txtCE3.getText().equals(""));
        
        //Si cualidades es true, se despliega JOptionPane para que el usuario use los espacios en orden.
        //En caso de que sea así, se guardan las tres cualidades.
        if(cualidades){
            JOptionPane.showMessageDialog(null, "Por favor, utilice los espacios de Cualidades Especiales en orden", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            cua1 = txtCE1.getText();
            cua2 = txtCE2.getText();
            cua3 = txtCE3.getText();
        }
        
        //Mismo criterio que con las cualidades es move2. move1 revisa si todos los movimientos están vacíos.
        //moves determina si ambas condiciones son falsas, lo cual va a usarse más adelante.
        move1= txtMov1.getText().equals("") && txtMov2.getText().equals("") && txtMov3.getText().equals("");
        move2=(txtMov1.getText().equals("") && (!txtMov2.getText().equals("") || !txtMov3.getText().equals(""))) || (txtMov2.getText().equals("") 
                && !txtMov3.getText().equals(""));
        moves= move1==false && move2==false;
        
        //Si move1 es true, se despliega JOptionPane obligando a escribir al menos un Movimiento.
        //Con move2 es ídem que con cualidades.
        //Si todo está correcto se guardan los tres movimientos.
        if(move1){
            JOptionPane.showMessageDialog(null, "Por favor, escriba al menos un Movimiento", "Error", JOptionPane.WARNING_MESSAGE);
        }else if(move2){
            JOptionPane.showMessageDialog(null, "Por favor, utilice los espacios de Movimientos en orden", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            mov1 = txtMov1.getText();
            mov2 = txtMov2.getText();
            mov3 = txtMov3.getText();
        }
        
        //danioNulo usa el método ifEtiquetaDanio (ver abajo) para establecer true o false a partir de si está seleccionado.
        danioNulo=ifEtiquetaDanio(ccbNulo, danioNulo);
        
        //Se pasa el valor de los combobox a String/int según corresponda.
        danioMejorPeor = cbxModDmg.getSelectedItem().toString();       
        danioDado = Integer.valueOf(cbxTipoDado.getSelectedItem().toString());
        danioModDado = cbxModDado.getSelectedItem().toString();
        danioArmadura = cbxDmgArm.getSelectedItem().toString();
        
        //Ídem que con danioNulo
        distToque=ifEtiquetaDanio(ccbToque, distToque);
        distCerca=ifEtiquetaDanio(ccbCerca, distCerca);
        distCorto=ifEtiquetaDanio(ccbCortoA, distCorto);
        distMedio=ifEtiquetaDanio(ccbMedioA, distMedio);
        distLargo=ifEtiquetaDanio(ccbLargoA, distLargo);
        contundente=ifEtiquetaDanio(ccbContundente, contundente);
        escabroso=ifEtiquetaDanio(ccbEscabroso, escabroso);
        
        //Si danioModDado es igual a +0, pasa a ser vacío. Lo mismo pasa si danioArmadura es igual a -
        if(danioModDado.equals("+0")){
            danioModDado="";
        }
        
        if(danioArmadura.equals("-")){
            danioArmadura="";
        }
        
        //Si danioNulo es true se establece que los valores referentes al daño son nulos, 0 o false.
        if(danioNulo){
            formaAtaque="";
            danioMejorPeor="-";
            danioDado=0;
            danioModDado="";
            danioArmadura="";
            distToque=false;
            distCerca=false;
            distMedio=false;
            distLargo=false;
            contundente=false;
            escabroso=false;
        }
        
        //Impide error al guardar monstruo sin tipo
        if(cbxTipoMonstruo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Por favor, elija de qué tipo de monstruo se trata", "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        distAtaque=false;
        
        //Si se marca daño pero no distancia, se impide el guardado y se pide la distancia.
        if(!danioNulo && !distToque && !distCerca && !distCorto && !distMedio && !distLargo){
            distAtaque=true;
            JOptionPane.showMessageDialog(null, "Por favor, indique a qué distancia se realiza el ataque \n(o indique que la criatura no ataca marcando la casilla de Daño Nulo)", 
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        //String para insertar datos en la tabla criaturas. Los ? se establecen en el método datosSQL de ConexionDerby.
        sqlInsertar="INSERT INTO criaturas (nombre, pg, armadura, daniomejorpeor, daniodado, daniomoddado, danionulo, danioarmadura, "
                + "formaataque, disttoque, distcerca, distcorto, distmedio, distlargo, contundente, escabroso, descripcion, mov1, mov2, mov3, cua1, "
                + "cua2, cua3, tcriatura_id, instinto) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        //String para actualizar los datos de la tabla criaturas a partir del id de la misma que viene de MostrarCriatura (ver más abajo el setter).
        sqlActualizar="UPDATE criaturas SET nombre=?, pg=?, armadura=?, daniomejorpeor=?, daniodado=?, daniomoddado=?, danionulo=?, danioarmadura=?, "
                + "formaataque=?, disttoque=?, distcerca=?, distcorto=?, distmedio=?, distlargo=?, contundente=?, escabroso=?, descripcion=?, "
                + "mov1=?, mov2=?, mov3=?, cua1=?, cua2=?, cua3=?, tcriatura_id=?, instinto=? WHERE tcriatura_id="+id;
        
        //String para introducir etiquetas
        sqlEtiquetas="INSERT INTO relacionesetiquetas (etiqueta_id, criatura_id) VALUES (?, ?)";
        
        //Condiciones para poder Guardar
        condiciones=((pgyarm || resp==0) && cualidades==false && descIns && moves && !distAtaque) && cbxTipoMonstruo.getSelectedIndex()!=0;
        
        //Si el boolean edit es false (se establece que es false si viene para crear criatura y que es true si viene para editar, que además viene con los datos)
        //se usa el método datosSQL de ConexionDerby junto con sqlInsertar. Después se usa un ciclo For para traer todos los valores de etiquetasCriatura que 
        //no sean 0 para introducirlos en la tabla de relacionesetiquetas con el método insertarEtiquetas de ConexionDerby que pide el valor de cada elemento
        //de etiquetasCriatura y el id que trae con el método traerIdCriatura también de ConexionDerby que viene a partir del nombre.
        //Al final se cierra y envía a Principal.
        if(edit==false && condiciones){
            try {
                C.datosSQL(nombre, PG, armadura, danioMejorPeor, danioDado, danioModDado, danioNulo, danioArmadura, formaAtaque, distToque, distCerca, distCorto, 
                        distMedio, distLargo, contundente, escabroso, descripcion, mov1, mov2, mov3, cua1, cua2, cua3, tipoCriatura, instinto, sqlInsertar);
            } catch (Exception ex) {
                Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for (int i = 0; i < etiquetasCriatura.size(); i++) {
                try {            
                    id=C.traerInt("criatura_id", "nombre='"+nombre+"'");
                    if(etiquetasCriatura.get(i)>0){
                        C.insertarEtiquetas(etiquetasCriatura.get(i), id, sqlEtiquetas);
                    }
                    
                }catch (Exception ex) {
                        Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            
            P.setVisible(true);
            P.setLocationRelativeTo(null);//para centrar la ventana
            P.setResizable(false);//Evita que se maximice la ventana
            this.dispose();
        }
        
        //Ídem el anterior pero usando sqlActualizar si edit es true. La diferencia más grande es que elimina las etiquetas anteriores de relacionesetiquetas
        //usando el método eliminarEtiquetas de ConexionDerby antes de reinsertar otras. Además, como ya existe un valor de id no hace falta traerlo a partir
        //del nombre y el método traerIdCriatura.        
        if(edit==true && condiciones){
            try {
                C.datosSQL(nombre, PG, armadura, danioMejorPeor, danioDado, danioModDado, danioNulo, danioArmadura, formaAtaque, distToque, distCerca, distCorto, 
                        distMedio, distLargo, contundente, escabroso, descripcion, mov1, mov2, mov3, cua1, cua2, cua3, tipoCriatura, instinto, sqlActualizar);
            } catch (Exception ex) {
                Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                C.eliminarEtiquetas("DELETE FROM relacionesetiquetas WHERE criatura_id="+id);
            } catch (Exception ex) {
                Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for (int i = 0; i < etiquetasCriatura.size(); i++) {
                try {
                    if(etiquetasCriatura.get(i)>0){
                        C.insertarEtiquetas(etiquetasCriatura.get(i), id, sqlEtiquetas);
                    }                    
                }catch (Exception ex) {
                        Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Editado con éxito");
             
            P.setVisible(true);
            P.setLocationRelativeTo(null);//para centrar la ventana
            P.setResizable(false);//Evita que se maximice la ventana
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
        
    //El botón Cancelar lleva de nuevo a Principal.
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        P.setVisible(true);
        P.setLocationRelativeTo(null);//para centrar la ventana
        P.setResizable(false);//Evita que se maximice la ventana
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCriatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CrearCriatura().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CrearCriatura.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpOrganizacion;
    private javax.swing.ButtonGroup bgpTamano;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> cbxDmgArm;
    public javax.swing.JComboBox<String> cbxModDado;
    public javax.swing.JComboBox<String> cbxModDmg;
    public javax.swing.JComboBox<String> cbxTipoDado;
    public javax.swing.JComboBox<String> cbxTipoMonstruo;
    public javax.swing.JCheckBox ccbAcaparador;
    public javax.swing.JCheckBox ccbAmorfo;
    public javax.swing.JCheckBox ccbCauto;
    public javax.swing.JCheckBox ccbCerca;
    public javax.swing.JCheckBox ccbConstructo;
    public javax.swing.JCheckBox ccbContundente;
    public javax.swing.JCheckBox ccbCortoA;
    public javax.swing.JCheckBox ccbDivino;
    public javax.swing.JCheckBox ccbEscabroso;
    public javax.swing.JCheckBox ccbInteligente;
    public javax.swing.JCheckBox ccbLargoA;
    public javax.swing.JCheckBox ccbMagico;
    public javax.swing.JCheckBox ccbMedioA;
    public javax.swing.JCheckBox ccbNulo;
    public javax.swing.JCheckBox ccbOrganizado;
    public javax.swing.JCheckBox ccbPlanar;
    public javax.swing.JCheckBox ccbSigiloso;
    public javax.swing.JCheckBox ccbTaimado;
    public javax.swing.JCheckBox ccbTerrorifico;
    public javax.swing.JCheckBox ccbToque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDistAtaque;
    private javax.swing.JLabel lblDmgArm;
    private javax.swing.JLabel lblFormaAtaque;
    private javax.swing.JLabel lblParticularidad;
    public javax.swing.JRadioButton rbnDiminuto;
    public javax.swing.JRadioButton rbnEnorme;
    public javax.swing.JRadioButton rbnGrande;
    public javax.swing.JRadioButton rbnGrupo;
    public javax.swing.JRadioButton rbnHorda;
    public javax.swing.JRadioButton rbnPequeno;
    public javax.swing.JRadioButton rbnSolitario;
    public javax.swing.JTextField txtArm;
    public javax.swing.JTextField txtCE1;
    public javax.swing.JTextField txtCE2;
    public javax.swing.JTextField txtCE3;
    public javax.swing.JTextArea txtDescripcion;
    public javax.swing.JTextField txtFormaAtaque;
    public javax.swing.JTextField txtInstinto;
    public javax.swing.JTextField txtMov1;
    public javax.swing.JTextField txtMov2;
    public javax.swing.JTextField txtMov3;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPG;
    // End of variables declaration//GEN-END:variables
    
    //El método manejarEtiqueta trae el JCheckBox y un número. Si el JCheckBox está seleccionado, el int aux que devuelve toma el valor del número (que se corresponde en la
    //tabla con el id de la etiqueta). Si no, devuelve 0. La utilidad de esto se explica arriba.
    private int manejarEtiqueta (JCheckBox etiqueta, int num){
       
        if(etiqueta.isSelected()){
            aux=num;
        }else{
            aux=0;
        }
        return aux;
    }
    
    //El método ifEtiquetaDanio trae el JCheckBox y un boolean. Funciona igual que el anterior pero devuelve true o false.
    private boolean ifEtiquetaDanio (JCheckBox etiquetaDanio, boolean booleano){       
        if(etiquetaDanio.isSelected()){
            booleano=true;
        }else{
            booleano=false;
        }
        
        return booleano;
    }
    
    //Setters de id y edit para que puedan establecerse desde afuera respetando el encapsulamiento.
    public void setId(int id) {
        this.id = id;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }
    
    //Este Override permite meter img/DW.png como logo. Además, hay que ir a la parte gráfica, 
    //botón derecho a iconImage en Propiedades, seleccionar Propiedad y elegir iconImage.
    //También hay que escribir el título en Propiedades/title
    @Override public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/DW.png"));
        return retValue;
    }
}