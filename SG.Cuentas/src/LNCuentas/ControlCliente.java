/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LNCuentas;

import Clases.Cliente;
import Clases.Direccion;
import GUICuentas.frmCliente;
import static java.awt.SystemColor.window;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author dalejwtf
 */
public class ControlCliente implements ActionListener {

    private MouseEvent event;
    private Cliente cliente;
    private Direccion direccionR;
    private Direccion direccionT;
    private ManejadorCliente manejadorCliente;
    private frmCliente fCliente;
    ArrayList<Cliente> dbClientes = new ArrayList<>();
    String[] p;
    ArrayList<Direccion> AllCantones;
    ArrayList<Direccion> CantonXProvinciasRes;
    ArrayList<Direccion> CantonXProvinciasTra;
    private int indiceProvRes = 1, indiceProvTra = 1;

    public ControlCliente(Cliente cliente, ManejadorCliente manejadorCliente, frmCliente fProducto) {
        this.cliente = cliente;
        this.manejadorCliente = manejadorCliente;
        this.fCliente = fProducto;
        this.fCliente.btnBuscar.addActionListener(this);
        this.fCliente.getbtnEliminar().addActionListener(this);
        this.fCliente.getbtnModificar().addActionListener(this);
        this.fCliente.getbtnNuevo().addActionListener(this);
        this.fCliente.getbtnSalir().addActionListener(this);
        event = fCliente.getMouseEvent();
        EnlistarProvincias();
        EnlistarCantonesRes();
        EnlistarCantonesTra();
        this.fCliente.getCmbProvinciaR().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                indiceProvRes = fCliente.getCmbProvinciaR().getSelectedIndex() + 1;
                EnlistarCantonesRes();

            }
        });
        this.fCliente.getCmbProvinciaT().addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                indiceProvTra = fCliente.getCmbProvinciaT().getSelectedIndex() + 1;
                EnlistarCantonesTra();

            }
        });

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ManejadorCliente getManejadorCliente() {
        return manejadorCliente;
    }

    public void setManejadorCliente(ManejadorCliente manejadorCliente) {
        this.manejadorCliente = manejadorCliente;
    }

    public frmCliente getfCliente() {
        return fCliente;
    }

    public void setfCliente(frmCliente fCliente) {
        this.fCliente = fCliente;
    }

    public ArrayList<Cliente> getDbClientes() {
        return dbClientes;
    }

    public void setDbClientes(ArrayList<Cliente> dbClientes) {
        this.dbClientes = dbClientes;
    }

    public void Iniciar() {
        this.fCliente.setTitle("Gestion de Productos");
        this.fCliente.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //NUEVO!!
        if (e.getSource() == this.fCliente.getbtnNuevo()) {
            this.cliente.setCedula(this.fCliente.getTxtCedula().getText());
            this.cliente.setApellidos(this.fCliente.getTxtApellidos().getText());
            this.cliente.setNombres(this.fCliente.getTxtNombres().getText());
            this.cliente.setFechaNacimiento(this.fCliente.getJdNacimiento().getDate());
            this.cliente.setSqlDate(cliente.getFechaNacimiento());
            String s1 = this.fCliente.getCmbProvinciaR().getSelectedItem().toString();
            String s2 = this.fCliente.getCmbCantonR().getSelectedItem().toString();
            String s3 = this.fCliente.getTxtCalleR().getText();
            Direccion dir1 = new Direccion(s1, s2, s3);
            this.cliente.setDirResidencia(dir1);
            s1 = this.fCliente.getCmbProvinciaT().getSelectedItem().toString();
            s2 = this.fCliente.getCmbCantonT().getSelectedItem().toString();
            s3 = this.fCliente.getTxtCalleT().getText();
            Direccion dir2 = new Direccion(s1, s2, s3);
            this.cliente.setDirTrabajo(dir2);

            int idRes = getIdCantonRes();
            int idTra = getIdCantonTra();
            this.cliente.getDirResidencia().setId_provincia(indiceProvRes);
            this.cliente.getDirTrabajo().setId_provincia(indiceProvTra);
            this.cliente.getDirResidencia().setId_canton(idRes);
            this.cliente.getDirTrabajo().setId_canton(idTra);

            System.out.println("ProvR: " + indiceProvRes);
            System.out.println("CanR: " + idRes);
            System.out.println("ProvT: " + indiceProvTra);
            System.out.println("CanR: " + idTra);
            try {
                if (this.manejadorCliente.NuevoCliente(cliente)) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado!");
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar el producto!");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //BUSCAR!!
        //1307777738
        if (e.getSource() == this.fCliente.btnBuscar) {
            try {
                cliente = manejadorCliente.getCliente(fCliente.getTxtCedula().getText());

                if (cliente.getNombres() != null) {
                    Limpiar();

                    JOptionPane.showMessageDialog(null, "Cliente encontrado!!");
                    fCliente.getTxtCedula().setText(cliente.getCedula());
                    fCliente.getTxtApellidos().setText(cliente.getApellidos());
                    fCliente.getTxtNombres().setText(cliente.getNombres());
                    fCliente.getTxtCalleR().setText(cliente.getDirResidencia().getCalle());
                    fCliente.getTxtCalleT().setText(cliente.getDirTrabajo().getCalle());
                    fCliente.getJdNacimiento().setDate(cliente.getFechaNacimiento());
                    fCliente.getCmbProvinciaR().setSelectedItem(cliente.getDirResidencia().getProvincia());
                    fCliente.getCmbProvinciaT().setSelectedItem(cliente.getDirTrabajo().getProvincia());
                    fCliente.getCmbCantonR().setSelectedItem(cliente.getDirResidencia().getCanton());
                    fCliente.getCmbCantonT().setSelectedItem(cliente.getDirTrabajo().getCanton());
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no Encontrado!");
                    Limpiar();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

//        //MODIFICAR!!
        //1307777738
        if (e.getSource() == this.fCliente.getbtnModificar()) {

            try {
                this.cliente.setCedula(this.fCliente.getTxtCedula().getText());
                this.cliente.setApellidos(this.fCliente.getTxtApellidos().getText());
                this.cliente.setNombres(this.fCliente.getTxtNombres().getText());
                this.cliente.setSqlDate(this.fCliente.getJdNacimiento().getDate());
                this.cliente.getDirResidencia().setCalle(this.fCliente.getTxtCalleR().getText());
                this.cliente.getDirTrabajo().setCalle(this.fCliente.getTxtCalleT().getText());
                int idCRes = getIdCantonRes();
                int idCTra = getIdCantonTra();
                this.cliente.getDirResidencia().setId_canton(idCRes);
                this.cliente.getDirResidencia().setId_provincia(indiceProvRes);
                this.cliente.getDirTrabajo().setId_canton(idCTra);
                this.cliente.getDirTrabajo().setId_provincia(indiceProvTra);
                if (this.manejadorCliente.EditarCliente(cliente)) {

                    JOptionPane.showMessageDialog(null, "Registro Modificado!");
                    Limpiar();

                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el cliente!");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        //ELIMINAR!!
        if (e.getSource() == this.fCliente.getbtnEliminar()) {

            try {

                int result = JOptionPane.showConfirmDialog(null,
                        "¿Desea eliminar el cliente seleccionado?",
                        "Confirm Quit", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    if (this.manejadorCliente.EliminarCliente(this.fCliente.getTxtCedula().getText())) {
                        JOptionPane.showMessageDialog(null, "Registro Eliminado!");
                        Limpiar();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo Eliminar el Cliente!");
                    }

                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //SALIR
        if (e.getSource() == this.fCliente.getbtnSalir()) {
            int result = JOptionPane.showConfirmDialog(null,
                    "¿Estas seguro de querer salir?",
                    "Confirm Quit", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }

    }

    public void Limpiar() {
        this.fCliente.getTxtCedula().setText(null);
        this.fCliente.getTxtApellidos().setText(null);
        this.fCliente.getTxtNombres().setText(null);
        this.fCliente.getJdNacimiento().setDate(null);
        this.fCliente.getTxtCalleR().setText(null);
        this.fCliente.getTxtCalleT().setText(null);
        indiceProvRes = 1;
        indiceProvTra = 1;
        EnlistarProvincias();
        EnlistarCantonesRes();
        EnlistarCantonesTra();
    }

    public void EnlistarProvincias() {
        try {
            p = manejadorCliente.getAllProvincias();
            fCliente.getCmbProvinciaR().setModel(new DefaultComboBoxModel(p));
            fCliente.getCmbProvinciaT().setModel(new DefaultComboBoxModel(p));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EnlistarCantonesRes() {
        try {
            AllCantones = manejadorCliente.getAllCantones();
            CantonXProvinciasRes = new ArrayList<>();

            for (int i = 0; i < AllCantones.size(); i++) {
                if (AllCantones.get(i).getId_provincia() == indiceProvRes) {
                    CantonXProvinciasRes.add(AllCantones.get(i));
                }
            }
            String[] ca = new String[CantonXProvinciasRes.size()];

            for (int i = 0; i < ca.length; i++) {
                ca[i] = CantonXProvinciasRes.get(i).getCanton();
            }
            fCliente.getCmbCantonR().setModel(new DefaultComboBoxModel(ca));
            fCliente.getCmbCantonT().setModel(new DefaultComboBoxModel(ca));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void EnlistarCantonesTra() {
        try {
            AllCantones = manejadorCliente.getAllCantones();
            CantonXProvinciasTra = new ArrayList<>();

            for (int i = 0; i < AllCantones.size(); i++) {
                if (AllCantones.get(i).getId_provincia() == indiceProvTra) {
                    CantonXProvinciasTra.add(AllCantones.get(i));
                }
            }
            String[] ca = new String[CantonXProvinciasTra.size()];

            for (int i = 0; i < ca.length; i++) {
                ca[i] = CantonXProvinciasTra.get(i).getCanton();
            }
            fCliente.getCmbCantonT().setModel(new DefaultComboBoxModel(ca));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControlCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getIdCantonRes() {
        int id = 0;
        for (int i = 0; i < CantonXProvinciasRes.size(); i++) {
            if (fCliente.getCmbCantonR().getSelectedItem() == CantonXProvinciasRes.get(i).getCanton()) {
                id = CantonXProvinciasRes.get(i).getId_canton();
            }
        }
        return id;
    }

    public int getIdCantonTra() {
        int id = 0;
        for (int i = 0; i < CantonXProvinciasTra.size(); i++) {
            if (fCliente.getCmbCantonT().getSelectedItem() == CantonXProvinciasTra.get(i).getCanton()) {
                id = CantonXProvinciasTra.get(i).getId_canton();
                System.out.println(id);
            }
        }
        return id;
    }

}
