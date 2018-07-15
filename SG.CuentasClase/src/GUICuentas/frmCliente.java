/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUICuentas;

import Clases.Canton;
import Clases.Cliente;
import Clases.Direccion;
import Clases.Provincia;
import LNCuentas.ManejadorCliente;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.event.ObjectChangeListener;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmCliente extends javax.swing.JFrame {

    Cliente c;

    /**
     * Creates new form frmCliente
     */
    public frmCliente() {
        initComponents();
        CargarProvinciasRes();
        CargarProvinciasTra();
        ManejadorCliente objCli = new ManejadorCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxProvinciares = new javax.swing.JComboBox<>();
        cbxCantonres = new javax.swing.JComboBox<>();
        txtCalleres = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxProvinciatra = new javax.swing.JComboBox<>();
        cbxCantontra = new javax.swing.JComboBox<>();
        txtCalletra = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cedula");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombres");

        jLabel4.setText("Fecha de Nacimiento");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de Residencia"));

        jLabel5.setText("Provincia");

        jLabel6.setText("Canton");

        jLabel7.setText("Calle");

        cbxProvinciares.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProvinciaresItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addComponent(cbxProvinciares, 0, 139, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(txtCalleres))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35)
                        .addComponent(cbxCantonres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxProvinciares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxCantonres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCalleres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lugar de Trabajo"));
        jPanel3.setPreferredSize(new java.awt.Dimension(245, 145));

        jLabel8.setText("Provincia");

        jLabel9.setText("Canton");

        jLabel10.setText("Calle");

        cbxProvinciatra.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProvinciatraItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxCantontra, 0, 131, Short.MAX_VALUE)
                    .addComponent(txtCalletra)
                    .addComponent(cbxProvinciatra, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxProvinciatra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxCantontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCalletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtapellido)
                            .addComponent(txtNombres))
                        .addGap(158, 158, 158))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblMensaje))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo)
                        .addComponent(btnModificar))
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        Cliente busqCliente = new Cliente();
        try {
            busqCliente = manejadorCliente.getCliente(txtCedula.getText());
            txtCedula.setText(busqCliente.getCedula());
            txtapellido.setText(busqCliente.getApellidos());
            txtNombres.setText(busqCliente.getNombres());
            String s = new SimpleDateFormat("yyyy-MM-dd").format(busqCliente.getFechaNacimiento());
            txtFechaNacimiento.setText(s);
            txtCalleres.setText(busqCliente.getDirResidencia().getCalle());
            txtCalletra.setText(busqCliente.getDirTrabajo().getCalle());
            cbxProvinciares.setSelectedItem(busqCliente.getDirResidencia().getProvincia());
            CargarProvinciasRes();
            CargarProvinciasTra();

            int i = SeleccionProvinciaTra(busqCliente.getDirTrabajo().getProvincia());
            cbxProvinciatra.setSelectedIndex(i);

            int j = SeleccionProvinciaRes(busqCliente.getDirResidencia().getProvincia());
            cbxProvinciares.setSelectedIndex(j);

            int k = SeleccionCantonRes(busqCliente.getDirResidencia().getCanton());
            cbxCantonres.setSelectedIndex(k);

            int l = SeleccionCantonTra(busqCliente.getDirTrabajo().getCanton());
            cbxCantontra.setSelectedIndex(l);
            c = busqCliente;
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        Cliente cliente = new Cliente();

        try {
            cliente.setApellidos(txtapellido.getText());
            cliente.setCedula(txtCedula.getText());
            cliente.setNombres(txtNombres.getText());
            // 130777778
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = sdf.parse(txtFechaNacimiento.getText());
            java.sql.Date sql = new java.sql.Date(fecha.getTime());
            cliente.setFechaNacimiento(sql);
            cliente.setId(c.getId());
            Canton cantonRes = (Canton) cbxCantonres.getSelectedItem();
            Canton cantonTra = (Canton) cbxCantontra.getSelectedItem();

            Direccion direccionRes = new Direccion(cbxProvinciares.getSelectedItem().toString(), cbxCantonres.getSelectedItem().toString(), txtCalleres.getText());
            Direccion direccionTra = new Direccion(cbxProvinciatra.getSelectedItem().toString(), cbxCantontra.getSelectedItem().toString(), txtCalletra.getText());
            cliente.setDirResidencia(direccionRes);
            cliente.setDirTrabajo(direccionTra);

            if (manejadorCliente.ActualizarCliente(cliente, cantonRes, cantonTra)) {
                JOptionPane.showMessageDialog(null, "Información Actualizada!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        } catch (ParseException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnModificarMouseClicked

    private void cbxProvinciaresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProvinciaresItemStateChanged
        // TODO add your handling code here:
        Provincia provincia = (Provincia) cbxProvinciares.getSelectedItem();
        SeleccionCantonRes(provincia.getNombre());
    }//GEN-LAST:event_cbxProvinciaresItemStateChanged

    private void cbxProvinciatraItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProvinciatraItemStateChanged
        // TODO add your handling code here:
        Provincia provincia = (Provincia) cbxProvinciatra.getSelectedItem();
        SeleccionCantonTra(provincia.getNombre());
    }//GEN-LAST:event_cbxProvinciatraItemStateChanged

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked
        // TODO add your handling code here:
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        Cliente cliente = new Cliente();

        try {
            cliente.setApellidos(txtapellido.getText());
            cliente.setCedula(txtCedula.getText());
            cliente.setNombres(txtNombres.getText());
            // 130777778
            String f = txtFechaNacimiento.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

            Date fecha = sdf.parse(f);

            java.sql.Date sql = new java.sql.Date(fecha.getTime());

            cliente.setFechaNacimiento(sql);

            Canton cantonRes = (Canton) cbxCantonres.getSelectedItem();
            Canton cantonTra = (Canton) cbxCantontra.getSelectedItem();

            Direccion direccionRes = new Direccion(cbxProvinciares.getSelectedItem().toString(), cbxCantonres.getSelectedItem().toString(), txtCalleres.getText());
            Direccion direccionTra = new Direccion(cbxProvinciatra.getSelectedItem().toString(), cbxCantontra.getSelectedItem().toString(), txtCalletra.getText());
            cliente.setDirResidencia(direccionRes);
            cliente.setDirTrabajo(direccionTra);

            if (manejadorCliente.NuevoCliente(cliente, cantonRes, cantonTra)) {
                JOptionPane.showMessageDialog(null, "Cliente Agregado!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Crear Cliente");
            }
        } catch (ParseException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int result = JOptionPane.showConfirmDialog(null,
                "¿Estas seguro de querer salir?",
                "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        ManejadorCliente manejadorCliente= new ManejadorCliente();
        try {
            if (manejadorCliente.EliminarCliente(txtCedula.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado!");
            }else
                JOptionPane.showMessageDialog(null, "Error al Eliminar!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    public void CargarProvinciasRes() {
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ArrayList<Provincia> provincias = new ArrayList<>();
        try {

            provincias = manejadorCliente.ObtenerProvincia();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (Provincia p : provincias) {
            dcbm.addElement(p);
        }
        cbxProvinciares.setModel(dcbm);

    }

    public void CargarProvinciasTra() {
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ArrayList<Provincia> provincias = new ArrayList<>();
        try {

            provincias = manejadorCliente.ObtenerProvincia();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (Provincia p : provincias) {
            dcbm.addElement(p);
        }
        cbxProvinciatra.setModel(dcbm);
    }

    public int SeleccionProvinciaRes(String provincia) {
        int j = 0;
        ComboBoxModel cbm = cbxProvinciares.getModel();
        for (int i = 0; i < cbm.getSize(); i++) {
            Provincia p = (Provincia) cbm.getElementAt(i);
            if (p.getNombre().equals(provincia)) {
                j = i;
            }
        }
        return j;
    }

    public int SeleccionProvinciaTra(String provincia) {
        int j = 0;
        ComboBoxModel cbm = cbxProvinciares.getModel();
        for (int i = 0; i < cbm.getSize(); i++) {
            Provincia p = (Provincia) cbm.getElementAt(i);
            if (p.getNombre().equals(provincia)) {
                j = i;
            }
        }
        return j;
    }

    public void CargarCantonRes(Provincia provincia) {
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ArrayList<Canton> cantones = new ArrayList<>();
        try {
            cantones = manejadorCliente.ObtenerCanton(provincia.getId_provincia());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (Canton p : cantones) {
            dcbm.addElement(p);
        }
        cbxCantonres.setModel(dcbm);

    }

    public void CargarCantonTra(Provincia provincia) {
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ArrayList<Canton> cantones = new ArrayList<>();
        try {
            cantones = manejadorCliente.ObtenerCanton(provincia.getId_provincia());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        for (Canton p : cantones) {
            dcbm.addElement(p);
        }
        cbxCantontra.setModel(dcbm);

    }

    public int SeleccionCantonRes(String canton) {
        CargarCantonRes((Provincia) cbxProvinciares.getSelectedItem());
        ComboBoxModel cbm1 = cbxCantonres.getModel();
        int k = -1;
        for (int i = 0; i < cbm1.getSize(); i++) {
            Canton c = (Canton) cbm1.getElementAt(i);
            if (c.getNombre().equals(canton)) {
                k = i;
            }
        }
        return k;
    }

    public int SeleccionCantonTra(String canton) {
        CargarCantonTra((Provincia) cbxProvinciatra.getSelectedItem());
        ComboBoxModel cbm1 = cbxCantontra.getModel();
        int k = -1;
        for (int i = 0; i < cbm1.getSize(); i++) {
            Canton c = (Canton) cbm1.getElementAt(i);
            if (c.getNombre().equals(canton)) {
                k = i;
            }
        }
        return k;
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCantonres;
    private javax.swing.JComboBox<String> cbxCantontra;
    private javax.swing.JComboBox<String> cbxProvinciares;
    private javax.swing.JComboBox<String> cbxProvinciatra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtCalleres;
    private javax.swing.JTextField txtCalletra;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtapellido;
    // End of variables declaration//GEN-END:variables
}
