/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICuentas;

import Clases.Cliente;
import LNCuentas.ManejadorCliente;
import com.toedter.calendar.JDateChooser;
import java.awt.Button;
import java.io.File;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.MouseEvent;
import org.omg.PortableInterceptor.ACTIVE;
/**
 *
 * @author dalejwtf
 */
public class frmCliente extends javax.swing.JFrame {
    MouseEvent e;
    /**
     * Creates new form GestionCliente
     */
    public frmCliente() {
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

        jpnContenedor = new javax.swing.JPanel();
        lblDatosGenerales = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        jpnResidencia = new javax.swing.JPanel();
        lblProvinciaR = new javax.swing.JLabel();
        lblCalleR = new javax.swing.JLabel();
        lblCantonR = new javax.swing.JLabel();
        cmbProvinciaR = new javax.swing.JComboBox<>();
        txtCalleR = new javax.swing.JTextField();
        cmbCantonR = new javax.swing.JComboBox<>();
        jpnBotones = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JToggleButton();
        btnModificar = new javax.swing.JToggleButton();
        btnSalir = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jpnResidencia1 = new javax.swing.JPanel();
        lblProvinciaT = new javax.swing.JLabel();
        lblCalleT = new javax.swing.JLabel();
        lblCantonT = new javax.swing.JLabel();
        cmbProvinciaT = new javax.swing.JComboBox<>();
        txtCalleT = new javax.swing.JTextField();
        cmbCantonT = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jdNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDatosGenerales.setFont(new java.awt.Font("Noto Mono", 1, 18)); // NOI18N
        lblDatosGenerales.setText("Datos Personales");

        lblCedula.setText("Cédula:");

        lblApellidos.setText("Apellidos:");

        lblNombres.setText("Nombres:");

        jpnResidencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Residencia"));

        lblProvinciaR.setText("Provincia: ");

        lblCalleR.setText("Calle:");

        lblCantonR.setText("Cantón:");

        cmbProvinciaR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbProvinciaRMouseClicked(evt);
            }
        });
        cmbProvinciaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaRActionPerformed(evt);
            }
        });

        txtCalleR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnResidenciaLayout = new javax.swing.GroupLayout(jpnResidencia);
        jpnResidencia.setLayout(jpnResidenciaLayout);
        jpnResidenciaLayout.setHorizontalGroup(
            jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResidenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvinciaR)
                    .addComponent(lblCantonR)
                    .addComponent(lblCalleR))
                .addGap(88, 88, 88)
                .addGroup(jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCalleR)
                    .addComponent(cmbProvinciaR, 0, 151, Short.MAX_VALUE)
                    .addComponent(cmbCantonR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jpnResidenciaLayout.setVerticalGroup(
            jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResidenciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvinciaR)
                    .addComponent(cmbProvinciaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantonR)
                    .addComponent(cmbCantonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnResidenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalleR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalleR))
                .addGap(37, 37, 37))
        );

        jpnBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout jpnBotonesLayout = new javax.swing.GroupLayout(jpnBotones);
        jpnBotones.setLayout(jpnBotonesLayout);
        jpnBotonesLayout.setHorizontalGroup(
            jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotonesLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jpnBotonesLayout.setVerticalGroup(
            jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBotonesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpnBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        jpnResidencia1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Trabajo"));

        lblProvinciaT.setText("Provincia: ");

        lblCalleT.setText("Calle:");

        lblCantonT.setText("Cantón:");

        cmbProvinciaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProvinciaTActionPerformed(evt);
            }
        });

        txtCalleT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalleTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnResidencia1Layout = new javax.swing.GroupLayout(jpnResidencia1);
        jpnResidencia1.setLayout(jpnResidencia1Layout);
        jpnResidencia1Layout.setHorizontalGroup(
            jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResidencia1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvinciaT)
                    .addComponent(lblCantonT)
                    .addComponent(lblCalleT))
                .addGap(88, 88, 88)
                .addGroup(jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCalleT)
                    .addComponent(cmbProvinciaT, 0, 151, Short.MAX_VALUE)
                    .addComponent(cmbCantonT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jpnResidencia1Layout.setVerticalGroup(
            jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResidencia1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvinciaT)
                    .addComponent(cmbProvinciaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantonT)
                    .addComponent(cmbCantonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnResidencia1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalleT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalleT))
                .addGap(37, 37, 37))
        );

        btnBuscar.setText("Buscar");

        jLabel1.setText("Fecha Nacimiento");

        javax.swing.GroupLayout jpnContenedorLayout = new javax.swing.GroupLayout(jpnContenedor);
        jpnContenedor.setLayout(jpnContenedorLayout);
        jpnContenedorLayout.setHorizontalGroup(
            jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContenedorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnContenedorLayout.createSequentialGroup()
                        .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDatosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnContenedorLayout.createSequentialGroup()
                                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblApellidos)
                                        .addComponent(lblCedula))
                                    .addComponent(lblNombres)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                        .addComponent(txtNombres))
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnContenedorLayout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnContenedorLayout.createSequentialGroup()
                        .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpnBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpnContenedorLayout.createSequentialGroup()
                                .addComponent(jpnResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jpnResidencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))))
        );
        jpnContenedorLayout.setVerticalGroup(
            jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDatosGenerales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCedula)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)))
                .addGap(17, 17, 17)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jdNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jpnContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnResidencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbProvinciaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaRActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbProvinciaRActionPerformed

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cmbProvinciaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProvinciaTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProvinciaTActionPerformed

    private void txtCalleTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleTActionPerformed

    private void txtCalleRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalleRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalleRActionPerformed

    private void cmbProvinciaRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProvinciaRMouseClicked

    }//GEN-LAST:event_cmbProvinciaRMouseClicked
    public MouseEvent getMouseEvent(){
        return e;
    }
    
    public JToggleButton getbtnBuscar(){
        return this.btnBuscar;
    }
    public JToggleButton getbtnEliminar(){
        return this.btnEliminar;
    }
    public JToggleButton getbtnModificar(){
        return this.btnModificar;
    }
    public JToggleButton getbtnNuevo(){
        return this.btnNuevo;
    }
    public JToggleButton getbtnSalir(){
        return this.btnSalir;
    }

    
    
    
    
    
    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public JTextField getTxtCalleR() {
        return txtCalleR;
    }

    public JTextField getTxtCalleT() {
        return txtCalleT;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public JDateChooser getJdNacimiento() {
        return jdNacimiento;
    }

    public JTextField getTxtNombres() {
        return txtNombres;
    }

    public JComboBox<String> getCmbCantonR() {
        return cmbCantonR;
    }

    public JComboBox<String> getCmbCantonT() {
        return cmbCantonT;
    }

    public JComboBox<String> getCmbProvinciaR() {
        return cmbProvinciaR;
    }

    public JComboBox<String> getCmbProvinciaT() {
        return cmbProvinciaT;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JToggleButton btnNuevo;
    private javax.swing.JToggleButton btnSalir;
    private javax.swing.JComboBox<String> cmbCantonR;
    private javax.swing.JComboBox<String> cmbCantonT;
    private javax.swing.JComboBox<String> cmbProvinciaR;
    private javax.swing.JComboBox<String> cmbProvinciaT;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jdNacimiento;
    private javax.swing.JPanel jpnBotones;
    private javax.swing.JPanel jpnContenedor;
    private javax.swing.JPanel jpnResidencia;
    private javax.swing.JPanel jpnResidencia1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCalleR;
    private javax.swing.JLabel lblCalleT;
    private javax.swing.JLabel lblCantonR;
    private javax.swing.JLabel lblCantonT;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDatosGenerales;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblProvinciaR;
    private javax.swing.JLabel lblProvinciaT;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCalleR;
    private javax.swing.JTextField txtCalleT;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}