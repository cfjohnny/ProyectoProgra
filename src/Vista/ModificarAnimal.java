/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import Clases.Animal;
import Clases.Empleado;
import Clases.Main;
import Clases.Padrino;
import Modelo.DatosAnimales;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author Ariana
 */
public class ModificarAnimal extends javax.swing.JFrame {
    int dias;
    RegistroPadrino padrino = new RegistroPadrino();
    Calendar fecha = Calendar.getInstance();
    SimpleDateFormat ff = new SimpleDateFormat("yyyy-MM-dd");
    DatosAnimales datos = new DatosAnimales();
    ArrayList<Animal> animal = new ArrayList<>();

    public ModificarAnimal() {
        initComponents();
        cargarDatos();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                Main.animales.setVisible(true);
            }
        });
    }

    public void cargarDatos() {
        animal = datos.todosAnimales();
    }
    public int validarFecha() {
        String fechaSeleccionada = ff.format(jdFecha.getDate().getTime());
        LocalDate fecha = LocalDate.parse(fechaSeleccionada);
         Period edad = Period.between(fecha, LocalDate.now());
        dias= edad.getDays();
        return dias;
    }

    private void clear() {
        txtID.setText("");
        txtNombre.setText("");
        txtPadrino.setText("");
        txtHistoria.setText("");
        txtPeso.setText("");
        cbSexo.setSelectedIndex(0);
        cbApadrinado.setSelectedIndex(0);
        cbEstadoSalud.setSelectedIndex(0);
        cbEspecie.setSelectedIndex(0);
        jdFecha.setDate(fecha.getTime());
        txtAlimentacion1.setText("");
    }

    private void habilitar(boolean si) {
        txtNombre.setEnabled(si);
        txtPadrino.setEnabled(si);
        txtHistoria.setEnabled(si);
        txtPeso.setEnabled(si);
        cbSexo.setEnabled(si);
        cbApadrinado.setEnabled(si);
        cbEstadoSalud.setEnabled(si);
        cbEspecie.setEnabled(si);
        jdFecha.setEnabled(si);
        txtAlimentacion1.setEnabled(si);
    }

    private boolean vacio() {
        boolean lleno;
        if (txtNombre.getText().isEmpty() || txtID.getText().isEmpty() || txtHistoria.getText().isEmpty()
                || txtPadrino.getText().isEmpty() || txtHistoria.getText().isEmpty() || txtPeso.getText().isEmpty()
                || cbApadrinado.getSelectedIndex() == 0 || cbEspecie.getSelectedIndex() == 0 || cbEstadoSalud.getSelectedIndex() == 0 || cbSexo.getSelectedIndex() == 0
                || "2023-11-11".equals(ff.format(jdFecha.getDate().getTime()))) {
            lleno = false;
        } else {
            lleno = true;
        }
        return lleno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jdFecha = new com.toedter.calendar.JDateChooser();
        cbEstadoSalud = new javax.swing.JComboBox<>();
        cbEspecie = new javax.swing.JComboBox<>();
        cbSexo = new javax.swing.JComboBox<>();
        txtPeso = new javax.swing.JTextField();
        cbApadrinado = new javax.swing.JComboBox<>();
        txtPadrino = new javax.swing.JTextField();
        txtHistoria = new javax.swing.JTextField();
        txtAlimentacion1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1400, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-vivian-venhasque-19096301.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 510, 740));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(204, 153, 0));
        lbTitulo.setText("MODIFICAR ANIMAL");
        jPanel3.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 8, 384, -1));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtID.setToolTipText("");
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese el ID del animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtID.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtID.setHighlighter(null);
        txtID.setName(""); // NOI18N
        txtID.setOpaque(true);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 416, 50));

        btnLimpiar.setBackground(new java.awt.Color(153, 0, 51));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        btnModificar.setBackground(new java.awt.Color(204, 153, 0));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel3.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 159, 42));

        btnBuscar.setBackground(new java.awt.Color(0, 51, 102));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 100, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setToolTipText("");
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNombre.setEnabled(false);
        txtNombre.setHighlighter(null);
        txtNombre.setName(""); // NOI18N
        txtNombre.setOpaque(true);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 410, 50));

        jdFecha.setBackground(new java.awt.Color(255, 255, 255));
        jdFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jdFecha.setDateFormatString("yyyy-MM-dd");
        jdFecha.setEnabled(false);
        jdFecha.setRequestFocusEnabled(false);
        jdFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFechaPropertyChange(evt);
            }
        });
        jPanel3.add(jdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 410, -1));

        cbEstadoSalud.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEstadoSalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el estado de salud", "Saludable", "Herido", "Enfermo" }));
        cbEstadoSalud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de salud", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbEstadoSalud.setEnabled(false);
        jPanel3.add(cbEstadoSalud, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 410, 50));

        cbEspecie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especie", "Caballos", "Vacas", "Oveja", "Cabras", "Aves", "Conejos", "Cerdos" }));
        cbEspecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbEspecie.setEnabled(false);
        jPanel3.add(cbEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 410, 50));

        cbSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige el sexo", "Macho", "Hembra" }));
        cbSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbSexo.setEnabled(false);
        cbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoActionPerformed(evt);
            }
        });
        jPanel3.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 410, 53));

        txtPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPeso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Peso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtPeso.setEnabled(false);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        jPanel3.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 410, -1));

        cbApadrinado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbApadrinado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Apadrinado", "No apadrinado" }));
        cbApadrinado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de apadrinamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        cbApadrinado.setEnabled(false);
        cbApadrinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbApadrinadoActionPerformed(evt);
            }
        });
        jPanel3.add(cbApadrinado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 410, 50));

        txtPadrino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPadrino.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Padrino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtPadrino.setEnabled(false);
        txtPadrino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPadrinoActionPerformed(evt);
            }
        });
        jPanel3.add(txtPadrino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 410, -1));

        txtHistoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHistoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtHistoria.setEnabled(false);
        txtHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHistoriaActionPerformed(evt);
            }
        });
        jPanel3.add(txtHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 410, -1));

        txtAlimentacion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAlimentacion1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de alimentación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtAlimentacion1.setEnabled(false);
        txtAlimentacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlimentacion1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtAlimentacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 410, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 0, 490, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed

    }//GEN-LAST:event_txtIDActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        try {
            txtID.setEnabled(true);
            txtID.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        dias=validarFecha();
        try {
            cargarDatos();
            String metodo = "";
            boolean habilitado = false;
            int indice = 0;
            for (int i = 0; i < animal.size(); i++) {
                if (txtID.getText().equals(animal.get(i).getIdAnimal())) {
                    indice = i;
                }
            }
            if (vacio() == true) {
                if(dias<0){
                    throw new Exception("La fecha de nacimiento seleccionada no es válida");
                }
                datos.modificar(Integer.parseInt(txtID.getText()), txtNombre.getText(), ff.format(jdFecha.getDate().getTime()),
                        cbEspecie.getSelectedItem().toString(), cbEstadoSalud.getSelectedItem().toString(),
                        Double.parseDouble(txtPeso.getText()), cbSexo.getSelectedItem().toString(), txtHistoria.getText(),
                        txtAlimentacion1.getText(), cbApadrinado.getSelectedItem().toString(), txtPadrino.getText());

                JOptionPane.showMessageDialog(null, "El animal ha sido modificado satisfactoriamente");
                habilitar(habilitado);
                txtID.setText("");
                clear();
            } else {
                throw new Exception("ATENCIÓN. Todos los campos deben ser completados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            cargarDatos();
            boolean habilitado = true;
            boolean existe = false;
            int indice = 0;
            if (animal.isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "No hay ningún animal registrado.");
            } else {
                for (int i = 0; i < animal.size(); i++) {
                    if (Integer.parseInt(txtID.getText()) == animal.get(i).getIdAnimal()) {
                        existe = true;
                        indice = i;
                    }
                }
                if (existe == true) {
                    habilitar(habilitado);
                    txtID.setEnabled(true);
                    txtNombre.setText(animal.get(indice).getNombre());
                    txtPeso.setText(String.valueOf(animal.get(indice).getPeso()));
                    txtAlimentacion1.setText(animal.get(indice).getTipoAlimentacion());
                    txtPadrino.setText(animal.get(indice).getPadrino());
                    txtHistoria.setText(animal.get(indice).getHistoria());
                    Date date = new Date();
                    date = ff.parse(animal.get(indice).getFechaNacimiento());
                    jdFecha.setDate(date);
                    cbApadrinado.setSelectedItem(animal.get(indice).getApadrinado());
                    cbSexo.setSelectedItem(animal.get(indice).getGenero());
                    cbEspecie.setSelectedItem(animal.get(indice).getEspecie());
                    cbEstadoSalud.setSelectedItem(animal.get(indice).getEstadoSalud());
                } else {
                    throw new Exception("El animal buscado no existe.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void jdFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFechaPropertyChange

    }//GEN-LAST:event_jdFechaPropertyChange

    private void cbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtPadrinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPadrinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPadrinoActionPerformed

    private void txtHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHistoriaActionPerformed

    private void txtAlimentacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlimentacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlimentacion1ActionPerformed

    private void cbApadrinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbApadrinadoActionPerformed
        boolean existe=false;
        int indice = 0;
        for (int i = 0; i < animal.size(); i++) {
            if (Integer.parseInt(txtID.getText()) == animal.get(i).getIdAnimal()) {
                existe = true;
                indice = i;
            }
        }

        if (cbApadrinado.getSelectedIndex() == 2) {
            txtPadrino.setText("N/A");
            txtPadrino.setEnabled(false);
        } else {
            txtPadrino.setText(animal.get(indice).getPadrino());
            txtPadrino.setEnabled(false);
        }
    }//GEN-LAST:event_cbApadrinadoActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPadrino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPadrino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbApadrinado;
    private javax.swing.JComboBox<String> cbEspecie;
    private javax.swing.JComboBox<String> cbEstadoSalud;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtAlimentacion1;
    private javax.swing.JTextField txtHistoria;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPadrino;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
