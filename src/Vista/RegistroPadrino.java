/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Clases.Main;
import Clases.Padrino;
import Modelo.DatosPadrinos;

/**
 *
 * @author Ariana
 */
public class RegistroPadrino extends javax.swing.JFrame {

    boolean lleno = false;
//    public static final ArrayList<Padrino> padrinos = new ArrayList<>();
    Calendar fecha = Calendar.getInstance();
    SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
    DatosPadrinos datos = new DatosPadrinos();
    ArrayList<Padrino> padrinos = new ArrayList<>();

    public RegistroPadrino() {
        initComponents();
        fecha.set(2023, Calendar.NOVEMBER, 11);
        jdFecha.setDate(fecha.getTime());
        setDefaultCloseOperation(Padrinos.HIDE_ON_CLOSE);
    }

    public void cargarDatos() {
        padrinos = datos.todosPadrinos();
    }

    public boolean vacio() {

        if (txtNombre.getText().isEmpty() || txtCedula.getText().isEmpty() || txtTelefono.getText().isEmpty()
                || txtDireccion.getText().isEmpty() || txtOcupacion.getText().isEmpty() || txtMontoDonar.getText().isEmpty()
                || (rbEfectivo.isSelected() == false && rbSINPE.isSelected() == false && rbTarjeta.isSelected() == false) || txtCedula.getText().isEmpty()
                || "2023-11-11".equals(ff.format(jdFecha.getDate().getTime()))) {
            lleno = false;
        } else {
            lleno = true;
        }
        return lleno;
    }

    public void clear() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtMontoDonar.setText("");
        txtOcupacion.setText("");
        txtTelefono.setText("");
        cbSexo.setSelectedIndex(0);
        rbEfectivo.setSelected(false);
        rbSINPE.setSelected(false);
        rbTarjeta.setSelected(false);
        jdFecha.setDate(fecha.getTime());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        txtOcupacion = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        txtMontoDonar = new javax.swing.JTextField();
        jpRadioButtons = new javax.swing.JPanel();
        rbEfectivo = new javax.swing.JRadioButton();
        rbSINPE = new javax.swing.JRadioButton();
        rbTarjeta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1400, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-anastasia-shuraeva-7673835.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 502, 766));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 766));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 51, 102));
        lbTitulo.setText("REGISTRA UN PADRINO");
        jPanel2.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 26, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setToolTipText("");
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNombre.setHighlighter(null);
        txtNombre.setName(""); // NOI18N
        txtNombre.setOpaque(true);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 86, 416, -1));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDireccion.setToolTipText("");
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 144, 416, 53));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefono.setToolTipText("");
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número de Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 209, 416, -1));

        jdFecha.setBackground(new java.awt.Color(255, 255, 255));
        jdFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jdFecha.setDateFormatString("yyyy/MM/dd");
        jdFecha.setRequestFocusEnabled(false);
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jPanel2.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 267, 416, -1));

        txtOcupacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtOcupacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ocupación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });
        jPanel2.add(txtOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 439, 416, -1));

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCedula.setToolTipText("");
        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cédula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 322, 416, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 635, 169, 50));

        cbSexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el sexo", "Hombre", "Mujer" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        jPanel2.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 380, 416, 53));

        txtMontoDonar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMontoDonar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto a donar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtMontoDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoDonarActionPerformed(evt);
            }
        });
        jPanel2.add(txtMontoDonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 497, 416, -1));

        jpRadioButtons.setBackground(new java.awt.Color(255, 255, 255));
        jpRadioButtons.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Método de pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btGroup.add(rbEfectivo);
        rbEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbEfectivo.setText("Efectivo");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });

        btGroup.add(rbSINPE);
        rbSINPE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbSINPE.setText("SINPE Móvil");
        rbSINPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSINPEActionPerformed(evt);
            }
        });

        btGroup.add(rbTarjeta);
        rbTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbTarjeta.setText("Tarjeta de Débito/Crédito");
        rbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRadioButtonsLayout = new javax.swing.GroupLayout(jpRadioButtons);
        jpRadioButtons.setLayout(jpRadioButtonsLayout);
        jpRadioButtonsLayout.setHorizontalGroup(
            jpRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRadioButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSINPE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpRadioButtonsLayout.setVerticalGroup(
            jpRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRadioButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRadioButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTarjeta)
                    .addComponent(rbSINPE)
                    .addComponent(rbEfectivo))
                .addContainerGap())
        );

        jPanel2.add(jpRadioButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 555, 416, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 480, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

    }//GEN-LAST:event_jdFechaPropertyChange

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupacionActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            cargarDatos();
            String metodo = "";
            boolean existe = false;
            if (vacio() == true) {
                if (rbEfectivo.isSelected() == true) {
                    metodo = rbEfectivo.getText();
                } else if (rbSINPE.isSelected() == true) {
                    metodo = rbSINPE.getText();
                } else if (rbTarjeta.isSelected() == true) {
                    metodo = rbTarjeta.getText();
                }
                Padrino padrino = new Padrino(txtNombre.getText(), ff.format(jdFecha.getDate().getTime()),
                        txtCedula.getText(), txtDireccion.getText(), txtTelefono.getText(), cbSexo.getSelectedItem().toString(),
                        metodo, Double.parseDouble(txtMontoDonar.getText()), txtOcupacion.getText());
                for (int i = 0; i < padrinos.size(); i++) {
                    if (txtCedula.getText().equals(padrinos.get(i).getCedula())) {
                        existe = true;
                    }
                }
                if (existe == false) {
                    datos.insertar(padrino);
                    JOptionPane.showMessageDialog(null, "El(la) padrino/madrina ha sido registrado(a) satisfactoriamente");
                    clear();
                    int opcion = JOptionPane.showConfirmDialog(null, "Desea registrar otro padrino?", "Confirmar registro", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.NO_OPTION) {
                        Main.registroPadrino.dispose();
                        Main.padrino.setVisible(true);
                    }
                } else {
                    throw new Exception("Lo sentimos, el(la) padrino/madrina ha sido registrado(a).");
                }

            } else {
                throw new Exception("ATENCIÓN. Todos los campos deben ser completados");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el monto a donar debe ser un dato numérico");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void rbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTarjetaActionPerformed

    private void rbSINPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSINPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSINPEActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void txtMontoDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoDonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoDonarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPadrino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JPanel jpRadioButtons;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbSINPE;
    private javax.swing.JRadioButton rbTarjeta;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMontoDonar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
