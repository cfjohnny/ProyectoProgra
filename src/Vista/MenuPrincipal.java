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
public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnEmpleado = new javax.swing.JButton();
        jBtnAnimales = new javax.swing.JButton();
        jBtnPadrinos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JLabel();
        jtxtCedula = new javax.swing.JLabel();
        jtxtCargo = new javax.swing.JLabel();
        jtxtNumUsuario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnCerrarSesion2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 1024));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnEmpleado.setBackground(new java.awt.Color(255, 153, 102));
        jBtnEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnEmpleado.setText("Ingresar");
        jBtnEmpleado.setAlignmentX(0.6F);
        jBtnEmpleado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnEmpleado.setPreferredSize(new java.awt.Dimension(116, 23));
        jBtnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 393, -1, 40));

        jBtnAnimales.setBackground(new java.awt.Color(153, 204, 255));
        jBtnAnimales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnAnimales.setText("Ingresar");
        jBtnAnimales.setAlignmentX(0.6F);
        jBtnAnimales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnAnimales.setPreferredSize(new java.awt.Dimension(116, 23));
        jBtnAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnimalesActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, -1, 40));

        jBtnPadrinos.setBackground(new java.awt.Color(0, 153, 153));
        jBtnPadrinos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnPadrinos.setText("Ingresar");
        jBtnPadrinos.setAlignmentX(0.6F);
        jBtnPadrinos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnPadrinos.setPreferredSize(new java.awt.Dimension(116, 23));
        jBtnPadrinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPadrinosActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnPadrinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 393, -1, 40));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Padrinos");
        jLabel11.setAlignmentX(0.6F);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Empleados");
        jLabel12.setAlignmentX(0.6F);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaquero.png"))); // NOI18N
        jLabel2.setAlignmentX(0.6F);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 70));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Animales");
        jLabel4.setAlignmentX(0.6F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

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

        jtxtCedula.setBackground(new java.awt.Color(232, 232, 232));
        jtxtCedula.setAlignmentX(0.6F);
        jtxtCedula.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtCedula.setOpaque(true);
        jtxtCedula.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jtxtCargo.setBackground(new java.awt.Color(232, 232, 232));
        jtxtCargo.setAlignmentX(0.6F);
        jtxtCargo.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtCargo.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtCargo.setOpaque(true);
        jtxtCargo.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jtxtNumUsuario.setBackground(new java.awt.Color(232, 232, 232));
        jtxtNumUsuario.setAlignmentX(0.6F);
        jtxtNumUsuario.setMaximumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setMinimumSize(new java.awt.Dimension(80, 20));
        jtxtNumUsuario.setOpaque(true);
        jtxtNumUsuario.setPreferredSize(new java.awt.Dimension(150, 40));
        getContentPane().add(jtxtNumUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Menú Principal");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 880, 140));

        jLabel7.setBackground(new java.awt.Color(252, 252, 252));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-david-mcbee-730547.jpg"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 150, 260));

        jLabel9.setBackground(new java.awt.Color(252, 252, 252));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-kat-smith-593899 (1).jpg"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 150, 260));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("LIBRES Y AMADOS");
        jLabel10.setAlignmentX(0.6F);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pexels-los-muertos-crew-10041309.jpg"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 150, 260));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 880, 580));

        jBtnCerrarSesion2.setText("Cerrar Sesión");
        jBtnCerrarSesion2.setAlignmentX(0.6F);
        jBtnCerrarSesion2.setPreferredSize(new java.awt.Dimension(90, 20));
        jBtnCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCerrarSesion2ActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCerrarSesion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 120, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Animales");
        jLabel8.setAlignmentX(0.6F);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("Empleados");
        jLabel14.setAlignmentX(0.6F);
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jBtnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEmpleadoActionPerformed
        Main.empleado.setVisible(true);
        Main.empleado.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnEmpleadoActionPerformed

    private void jBtnAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnimalesActionPerformed
        Main.animales.setVisible(true);
        Main.animales.setLocationRelativeTo(null);
        Main.menu.setVisible(false);
    }//GEN-LAST:event_jBtnAnimalesActionPerformed

    private void jBtnPadrinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPadrinosActionPerformed
        Main.menu.setVisible(false);
        Main.padrino.setVisible(true);
        Main.padrino.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnPadrinosActionPerformed

    private void jBtnCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCerrarSesion2ActionPerformed
        Main.menu.setVisible(false);
        Main.iniciar.setVisible(true);
        Main.menu.setLocationRelativeTo(null);
    }//GEN-LAST:event_jBtnCerrarSesion2ActionPerformed

    private void jtxtNombrePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtxtNombrePropertyChange
        jtxtNombre.setText("Usuario: "+Main.usuarioLogueado);
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAnimales;
    private javax.swing.JButton jBtnCerrarSesion2;
    private javax.swing.JButton jBtnEmpleado;
    private javax.swing.JButton jBtnPadrinos;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jtxtCargo;
    private javax.swing.JLabel jtxtCedula;
    private javax.swing.JLabel jtxtNombre;
    private javax.swing.JLabel jtxtNumUsuario;
    // End of variables declaration//GEN-END:variables
}
