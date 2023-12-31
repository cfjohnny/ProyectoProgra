/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import Clases.*;
import Modelo.DatosAnimales;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 *
 * @author Ariana
 */
public class RegistroAnimales extends javax.swing.JFrame {
  int dias;
    Calendar fecha = Calendar.getInstance();
    SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
    DatosAnimales datos = new DatosAnimales();
    ArrayList<Animal> animal = new ArrayList<>();

    public RegistroAnimales() {
        initComponents();
        fecha.set(2023, Calendar.NOVEMBER, 11);
        jdFecha.setDate(fecha.getTime());
        cargarDatos();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                Main.animales.setVisible(true);
            }
        });
    }

    public int validarFecha() {
        String fechaSeleccionada = ff.format(jdFecha.getDate().getTime());
        LocalDate fecha = LocalDate.parse(fechaSeleccionada);
         Period edad = Period.between(fecha, LocalDate.now());
        dias= edad.getDays();
        return dias;
    }

    public void cargarDatos() {
        animal = datos.todosAnimales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        txtPeso = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        txtHistoria = new javax.swing.JTextField();
        cbEstadoSalud = new javax.swing.JComboBox<>();
        cbApadrinado = new javax.swing.JComboBox<>();
        cbEspecie = new javax.swing.JComboBox<>();
        txtPadrino = new javax.swing.JTextField();
        txtAlimentacion1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1400, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caballos.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 766));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 51, 102));
        lbTitulo.setText("REGISTRA UN ANIMAL");
        jPanel2.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 410, 50));

        jdFecha.setBackground(new java.awt.Color(255, 255, 255));
        jdFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jdFecha.setDateFormatString("yyyy-MM-dd");
        jdFecha.setRequestFocusEnabled(false);
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jPanel2.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 410, -1));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 410, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 660, 169, 50));

        cbSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el sexo", "Macho", "Hembra" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        jPanel2.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 410, 53));

        txtHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHistoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistoriaActionPerformed(evt);
            }
        });
        jPanel2.add(txtHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 410, 70));

        cbEstadoSalud.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEstadoSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado de salud", "Saludable", "Herido", "Enfermo" }));
        cbEstadoSalud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de salud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.add(cbEstadoSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 410, 50));

        cbApadrinado.setEditable(true);
        cbApadrinado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbApadrinado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No apadrinado" }));
        cbApadrinado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de apadrinamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbApadrinado.setEnabled(false);
        cbApadrinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApadrinadoActionPerformed(evt);
            }
        });
        jPanel2.add(cbApadrinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 410, 50));

        cbEspecie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especie", "Caballos", "Vacas", "Ovejas", "Cabras", "Aves", "Conejos", "Cerdos", "Burros" }));
        cbEspecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspecieActionPerformed(evt);
            }
        });
        jPanel2.add(cbEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 410, 50));

        txtPadrino.setEditable(false);
        txtPadrino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPadrino.setText("N/A");
        txtPadrino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Padrino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtPadrino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadrinoActionPerformed(evt);
            }
        });
        txtPadrino.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPadrinoPropertyChange(evt);
            }
        });
        jPanel2.add(txtPadrino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 410, -1));

        txtAlimentacion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAlimentacion1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de alimentación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtAlimentacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlimentacion1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtAlimentacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 410, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 460, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean vacio() {
        boolean lleno;
        if (txtNombre.getText().isEmpty() || txtHistoria.getText().isEmpty()
                || txtPadrino.getText().isEmpty() || txtHistoria.getText().isEmpty() || txtPeso.getText().isEmpty()
                || cbEspecie.getSelectedIndex() == 0 || cbEstadoSalud.getSelectedIndex() == 0 || cbSexo.getSelectedIndex() == 0
                || "2023-11-11".equals(ff.format(jdFecha.getDate().getTime()))) {
            lleno = false;
        } else {
            lleno = true;
        }
        return lleno;
    }

    private void clear() {
        txtNombre.setText("");
        txtPadrino.setText("");
        txtHistoria.setText("");
        txtPeso.setText("");
        txtPeso.setText("");
        cbSexo.setSelectedIndex(0);
        cbApadrinado.setSelectedIndex(0);
        cbEstadoSalud.setSelectedIndex(0);
        cbEspecie.setSelectedIndex(0);
        jdFecha.setDate(fecha.getTime());
    }
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

    }//GEN-LAST:event_jdFechaPropertyChange

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            dias = validarFecha();
            cargarDatos();
            String metodo = "";
            boolean existe = false;
            if (vacio() == true) {
                Animal animal = new Animal(0, txtNombre.getText(), ff.format(jdFecha.getDate().getTime()),
                        cbEspecie.getSelectedItem().toString(), cbEstadoSalud.getSelectedItem().toString(),
                        Double.parseDouble(txtPeso.getText()), cbSexo.getSelectedItem().toString(), txtHistoria.getText(),
                        txtAlimentacion1.getText(), cbApadrinado.getSelectedItem().toString(), txtPadrino.getText());
//                for (int i = 0; i < Main.animal.size(); i++) {
//                    if (txtID.getText().equals(Main.animal.get(i).getIdAnimal())) {
//                        existe = true;
//                    }
//                }
                if (existe == false) {
                    if (dias < 0) {
                        throw new Exception("La fecha de nacimiento seleccionada no es válida");
                    }
                    datos.insertar(animal);
                    JOptionPane.showMessageDialog(null, "Animal registrado correctamente");
                    clear();
                    int opcion = JOptionPane.showConfirmDialog(null, "Desea registrar otro animal?", "Confirmar registro", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.NO_OPTION) {
                        Main.registroAnimales.dispose();
                        Main.animales.setVisible(true);
                    } else {
                        clear();
                    }
                } else {
                    throw new Exception("El animal ya ha sido registrado.");
                }

            } else {
                throw new Exception("ATENCIÓN. Todos los campos deben ser completados");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, el peso debe ser un número");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void txtHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHistoriaActionPerformed

    private void txtPadrinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadrinoActionPerformed

    }//GEN-LAST:event_txtPadrinoActionPerformed

    private void txtAlimentacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentacion1ActionPerformed

    private void cbApadrinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApadrinadoActionPerformed

    }//GEN-LAST:event_cbApadrinadoActionPerformed

    private void cbEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEspecieActionPerformed

    private void txtPadrinoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPadrinoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPadrinoPropertyChange

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
            java.util.logging.Logger.getLogger(RegistroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAnimales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAnimales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbApadrinado;
    private javax.swing.JComboBox<String> cbEspecie;
    private javax.swing.JComboBox<String> cbEstadoSalud;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtAlimentacion1;
    private javax.swing.JTextField txtHistoria;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPadrino;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
