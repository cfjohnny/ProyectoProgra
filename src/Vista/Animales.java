/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import Clases.Main;

/**
 *
 * @author fallaa8
 */
public class Animales extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuarios
     */
    public Animales() {
        initComponents();
        setDefaultCloseOperation(MenuPrincipal.HIDE_ON_CLOSE);

    }

    public void VentanaPrincipal() {

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                abrirNuevaVentana();
            }
        });
    }

    private void abrirNuevaVentana() {
        Main.menu.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBtnEliminarUsuario = new javax.swing.JButton();
        jtxtNombre = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jtxtNumUsuario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxtCargo = new javax.swing.JLabel();
        jBtnCerrarSesion2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnApadrinar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jtxtCedula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaquero.png"))); // NOI18N
        jLabel2.setAlignmentX(0.6F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 70));

        jBtnEliminarUsuario.setText("Eliminar Usuario");
        jBtnEliminarUsuario.setAlignmentX(0.6F);
        jBtnEliminarUsuario.setOpaque(true);
        jBtnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 120, 30));

        jtxtNombre.setBackground(new java.awt.Color(232, 232, 232));
        jtxtNombre.setAlignmentX(0.6F);
        jtxtNombre.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtNombre.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtNombre.setOpaque(true);
        jtxtNombre.setPreferredSize(new java.awt.Dimension(150, 40));
        jtxtNombre.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtxtNombrePropertyChange(evt);
            }
        });
        getContentPane().add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        btnReportes.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("REPORTES");
        btnReportes.setMaximumSize(new java.awt.Dimension(132, 32));
        btnReportes.setMinimumSize(new java.awt.Dimension(132, 32));
        btnReportes.setPreferredSize(new java.awt.Dimension(132, 32));
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 140, 40));

        jtxtNumUsuario.setBackground(new java.awt.Color(232, 232, 232));
        jtxtNumUsuario.setAlignmentX(0.6F);
        jtxtNumUsuario.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setOpaque(true);
        jtxtNumUsuario.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtNumUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
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

        btnEliminar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(132, 32));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, 140, 40));

        btnApadrinar.setBackground(new java.awt.Color(0, 153, 153));
        btnApadrinar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnApadrinar.setForeground(new java.awt.Color(255, 255, 255));
        btnApadrinar.setText("APADRINAR");
        btnApadrinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApadrinarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApadrinar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 440, 40));

        btnRegistrar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setPreferredSize(new java.awt.Dimension(132, 32));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 140, 40));

        btnModificar.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 140, 40));

        jtxtCedula.setBackground(new java.awt.Color(232, 232, 232));
        jtxtCedula.setAlignmentX(0.6F);
        jtxtCedula.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setOpaque(true);
        jtxtCedula.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Menú Animales");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 880, 140));

        jLabel9.setBackground(new java.awt.Color(252, 252, 252));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 180, 200));

        jLabel13.setBackground(new java.awt.Color(252, 252, 252));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 180, 200));

        jLabel14.setBackground(new java.awt.Color(252, 252, 252));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte-de-negocios.png"))); // NOI18N
        jLabel14.setToolTipText("");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setOpaque(true);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 180, 200));

        jLabel15.setBackground(new java.awt.Color(252, 252, 252));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro-en-linea.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel15.setOpaque(true);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 180, 200));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 880, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       Main.registroAnimales.setVisible(true);
       Main.registroAnimales.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnApadrinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApadrinarActionPerformed
        Main.animalesDisponibles.setVisible(true);
        Main.animalesDisponibles.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnApadrinarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Main.eliminarAnimal.setVisible(true);
        Main.eliminarAnimal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void jBtnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnEliminarUsuarioActionPerformed

    private void jBtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCerrarSesion2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Main.modificarAnimal.setVisible(true);
        Main.modificarAnimal.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jtxtNombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtxtNombrePropertyChange
  jtxtNombre.setText("Usuario: "+Main.usuarioLogueado);        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombrePropertyChange

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
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApadrinar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton jBtnCerrarSesion2;
    private javax.swing.JButton jBtnEliminarUsuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jtxtCargo;
    private javax.swing.JLabel jtxtCedula;
    private javax.swing.JLabel jtxtNombre;
    private javax.swing.JLabel jtxtNumUsuario;
    // End of variables declaration//GEN-END:variables
}
