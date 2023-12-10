/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Animal;
import Clases.Empleado;
import Clases.Main;
import Clases.Padrino;
import Modelo.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariana
 */
public class Vacas extends javax.swing.JFrame {

    DatosPadrinos datos = new DatosPadrinos();
    ArrayList<Padrino> padrinos = new ArrayList<>();
    DatosAnimales datosAnimales = new DatosAnimales();
    ArrayList<Animal> animales = new ArrayList<>();

    public Vacas() {
        initComponents();
        cargarDatos();

    }

    public void cargarDatosPadrinos() {
        padrinos = datos.todosPadrinos();
    }

    public void cargarDatos() {
        DefaultTableModel model = (DefaultTableModel) jtAnimales.getModel();
        model.setNumRows(0);

        if (txtBuscar.getText().contentEquals("")) {
            animales = datosAnimales.listaAnimalesPorEspecie("Vacas");
        } else {
            animales = datosAnimales.BuscarAnimal(txtBuscar.getText()); //busca los articulos por descripcion
        }
        String lista[] = new String[11]; //siempre hacer 
        int i = 0;
        for (Animal animal : animales) {
            lista[0] = String.valueOf(animales.get(i).getIdAnimal());
            lista[1] = animales.get(i).getNombre();
            lista[2] = animales.get(i).getFechaNacimiento();
            lista[3] = animales.get(i).getEspecie();
            lista[4] = animales.get(i).getEstadoSalud();
            lista[5] = String.valueOf(animales.get(i).getPeso());
            lista[6] = animales.get(i).getGenero();
            lista[7] = animales.get(i).getApadrinado();
            lista[8] = String.valueOf(animales.get(i).getPadrino());
            lista[9] = String.valueOf(animales.get(i).getHistoria());
            lista[10] = String.valueOf(animales.get(i).getTipoAlimentacion());
            i++;
            model.addRow(lista);
        }
        jtAnimales.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtAnimales = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JLabel();
        jtxtNumUsuario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtCargo = new javax.swing.JLabel();
        jBtnCerrarSesion2 = new javax.swing.JButton();
        jbtModificar = new javax.swing.JButton();
        jtxtCedula = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNombrePadrino = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMontoDonar = new javax.swing.JTextField();
        btnApadrinar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Animal", "Nombre", "Fecha de Nacimiento", "Especie", "Estado de Salud", "Peso", "Genero", "Estado de Apadrinamiento", "Padrino", "Historia", "Tipo de Alimentación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAnimalesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAnimales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 810, 240));

        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 420, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaquero.png"))); // NOI18N
        jLabel2.setAlignmentX(0.6F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 70));

        jtxtNombre.setBackground(new java.awt.Color(232, 232, 232));
        jtxtNombre.setAlignmentX(0.6F);
        jtxtNombre.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtNombre.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtNombre.setOpaque(true);
        jtxtNombre.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jtxtNumUsuario.setBackground(new java.awt.Color(232, 232, 232));
        jtxtNumUsuario.setAlignmentX(0.6F);
        jtxtNumUsuario.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setOpaque(true);
        jtxtNumUsuario.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtNumUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("LIBRES Y AMADOS");
        jLabel10.setAlignmentX(0.6F);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 220, -1));

        jtxtCargo.setBackground(new java.awt.Color(232, 232, 232));
        jtxtCargo.setAlignmentX(0.6F);
        jtxtCargo.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtCargo.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtCargo.setOpaque(true);
        jtxtCargo.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jBtnCerrarSesion2.setText("Cerrar Sesión");
        jBtnCerrarSesion2.setAlignmentX(0.6F);
        jBtnCerrarSesion2.setPreferredSize(new java.awt.Dimension(90, 20));
        jBtnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesion2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCerrarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 120, 30));

        jbtModificar.setBackground(new java.awt.Color(204, 153, 0));
        jbtModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbtModificar.setForeground(new java.awt.Color(255, 255, 255));
        jbtModificar.setText("BUSCAR");
        jbtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 140, 40));

        jtxtCedula.setBackground(new java.awt.Color(232, 232, 232));
        jtxtCedula.setAlignmentX(0.6F);
        jtxtCedula.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setOpaque(true);
        jtxtCedula.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el ID del Animal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 170, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DEL ANIMAL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de Nacimiento");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Género");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtID.setEditable(false);
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtFecha.setEditable(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtGenero.setEditable(false);
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 390, 220));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACIÓN DEL PADRINO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Digite la cédula");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnConsultar.setBackground(new java.awt.Color(0, 153, 51));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 0, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtNombrePadrino.setEditable(false);
        txtNombrePadrino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePadrinoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Monto a Donar");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtMontoDonar.setEditable(false);

        btnApadrinar.setBackground(new java.awt.Color(0, 51, 102));
        btnApadrinar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApadrinar.setForeground(new java.awt.Color(255, 255, 255));
        btnApadrinar.setText("APADRINAR");
        btnApadrinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApadrinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnApadrinar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombrePadrino, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMontoDonar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombrePadrino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtMontoDonar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApadrinar, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 400, 220));

        jLabel5.setBackground(new java.awt.Color(89, 86, 45));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("APADRINAR UNA VACA");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 880, 140));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 880, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesion2ActionPerformed
        Main.iniciar.setVisible(true);
        Main.iniciar.setLocationRelativeTo(null);
        Main.padrino.setVisible(false);
    }//GEN-LAST:event_jBtnCerrarSesion2ActionPerformed

    private void jbtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModificarActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jbtModificarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtNombrePadrinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePadrinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePadrinoActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void jtAnimalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAnimalesMouseClicked
        int fila;
        try {
            fila = jtAnimales.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "NO SE HA SELECCIONADO NINGUNA FILA");
            } else {
                if (!"Apadrinado".equals(jtAnimales.getValueAt(fila, 7).toString())) {
                    String id = (String) jtAnimales.getValueAt(fila, 0);
                    String nombre = (String) jtAnimales.getValueAt(fila, 1);
                    String fechaNacimiento = (String) jtAnimales.getValueAt(fila, 2);
                    String genero = (String) jtAnimales.getValueAt(fila, 6);

                    //se llenan los campos
                    txtID.setText(id);
                    txtNombre.setText(nombre);
                    txtFecha.setText(fechaNacimiento);
                    txtGenero.setText(genero);
                } else {
                    JOptionPane.showMessageDialog(null, "El animal seleccionado ya ha sido apadrinado");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jtAnimalesMouseClicked

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            cargarDatosPadrinos();
            boolean existe = false;
            int indice = 0;
            if (padrinos.isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "No hay ningún padrino registrado.");
            } else {
                for (int i = 0; i < padrinos.size(); i++) {
                    if (txtCedula.getText().equals(padrinos.get(i).getCedula())) {
                        existe = true;
                        indice = i;
                    }
                }
                if (existe == true) {
                    txtCedula.setEnabled(false);
                    txtNombrePadrino.setText(padrinos.get(indice).getNombre());
                    txtMontoDonar.setText(String.valueOf(padrinos.get(indice).getMontoDonado()));
                } else {
                    throw new Exception("El padrino buscado no existe.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCedula.setEnabled(true);
        txtMontoDonar.setText("");
        txtNombrePadrino.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void btnApadrinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApadrinarActionPerformed

    datosAnimales.modificarApadrinado(Integer.parseInt(txtID.getText()), "Apadrinado", txtCedula.getText());
    JOptionPane.showMessageDialog(null, "Felicitaciones, has apadrinado un animal :)");
    txtID.setText(null);
    txtNombre.setText(null);
    txtFecha.setText(null);
    txtGenero.setText(null);
    txtCedula.setText(null);
    txtNombrePadrino.setText(null);
    txtMontoDonar.setText(null);
    }//GEN-LAST:event_btnApadrinarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vacas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vacas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApadrinar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jBtnCerrarSesion2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtModificar;
    private javax.swing.JTable jtAnimales;
    private javax.swing.JLabel jtxtCargo;
    private javax.swing.JLabel jtxtCedula;
    private javax.swing.JLabel jtxtNombre;
    private javax.swing.JLabel jtxtNumUsuario;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMontoDonar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombrePadrino;
    // End of variables declaration//GEN-END:variables
}
