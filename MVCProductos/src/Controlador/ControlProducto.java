/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ManejadorProducto;
import Modelo.Producto;
import Vista.frmProducto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author dalejwtf
 */
public class ControlProducto implements ActionListener {
    
    private Producto producto;
    private ManejadorProducto manejadorProducto;
    private frmProducto fProducto;
    ArrayList<Producto> dbProductos= new ArrayList<>();
    DefaultTableModel model;
    public ControlProducto(Producto pro, ManejadorProducto manejadorProducto, frmProducto fProducto) {
        this.producto = pro;
        this.manejadorProducto = manejadorProducto;
        this.fProducto = fProducto;

        this.fProducto.btnGuardar.addActionListener(this);
        this.fProducto.btnBuscar.addActionListener(this);
        this.fProducto.btnEliminar.addActionListener(this);
        this.fProducto.btnModificar.addActionListener(this);
        
        DefaultTableModel model = (DefaultTableModel) fProducto.jtableDBProductos.getModel();

        presentarProductos();

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto pro) {
        this.producto = pro;
    }

    public ManejadorProducto getManejadorProducto() {
        return manejadorProducto;
    }

    public void setManejadorProducto(ManejadorProducto manejadorProducto) {
        this.manejadorProducto = manejadorProducto;
    }

    public frmProducto getfProducto() {
        return fProducto;
    }

    public void setfProducto(frmProducto fProducto) {
        this.fProducto = fProducto;
    }

    public void Iniciar() {
        this.fProducto.setTitle("Gestion de Productos");
        this.fProducto.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        presentarProductos();
        //GUARDAR!!
        
        if (e.getSource() == this.fProducto.btnGuardar) {
            this.producto.setCodigo(this.fProducto.txtCodigo.getText());
            this.producto.setNombre(this.fProducto.txtNombre.getText());
            this.producto.setPrecio(Double.parseDouble(this.fProducto.txtPrecio.getText()));
            this.producto.setCantidad(Integer.parseInt(this.fProducto.txtCantidad.getText()));
            this.producto.setDate(this.fProducto.jdcFechaRegistro.getDate());
            this.producto.setSqlDate(this.producto.getDate());
            
            if (this.manejadorProducto.Guardar(producto)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado!");
                Limpiar();
                presentarProductos();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el producto!");
            }
        }
        
        //BUSCAR!!
        
        if (e.getSource() == this.fProducto.btnBuscar) {
            producto = manejadorProducto.Buscar(fProducto.txtCodigo.getText());
            presentarProductos();
            if (producto != null) {
                Limpiar();
                JOptionPane.showMessageDialog(null, "Producto encontrado!!");
                fProducto.txtCodigo.setText(producto.getCodigo());
                fProducto.txtNombre.setText(producto.getNombre());
                fProducto.txtPrecio.setText(Double.toString(producto.getPrecio()));
                fProducto.txtCantidad.setText(Integer.toString(producto.getCantidad()));
                fProducto.jdcFechaRegistro.setDate(producto.getDate());
                
            } else {
                JOptionPane.showMessageDialog(null, "Producto no Encontrado!");
                Limpiar();
            }

        }
        
        //MODIFICAR!!
        
        if (e.getSource() == this.fProducto.btnModificar) {
            dbProductos=manejadorProducto.getAllProductos();
            java.awt.event.MouseEvent event = fProducto.getEvent();
            this.producto.setCodigo(this.fProducto.txtCodigo.getText());
            this.producto.setNombre(this.fProducto.txtNombre.getText());
            this.producto.setPrecio(Double.parseDouble(this.fProducto.txtPrecio.getText()));
            this.producto.setCantidad(Integer.parseInt(this.fProducto.txtCantidad.getText()));
            this.producto.setId(dbProductos.get(this.fProducto.jtableDBProductos.rowAtPoint(event.getPoint())).getId());

            this.producto.setDate(this.fProducto.jdcFechaRegistro.getDate());
            this.producto.setSqlDate(this.producto.getDate());
            if(this.manejadorProducto.Editar(producto)){
                
                JOptionPane.showMessageDialog(null, "Registro Modificado!");
                Limpiar();
                presentarProductos();
            }else
                JOptionPane.showMessageDialog(null, "No se pudo modificar el producto!");
        }
        
        //ELIMINAR!!
        
        if (e.getSource()== this.fProducto.btnEliminar) {
            
            if (this.manejadorProducto.Eliminar(this.producto.getId())) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado!");
                Limpiar();
                presentarProductos();
            }else
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar el producto!");
        }

    }
    
    public void Limpiar() {
        this.fProducto.txtCodigo.setText(null);
        this.fProducto.txtNombre.setText(null);
        this.fProducto.txtPrecio.setText(null);
        this.fProducto.txtCantidad.setText(null);
        this.fProducto.jdcFechaRegistro.setDate(null);
    }
    
    public void presentarProductos(){
        ArrayList<Producto> dbProductos= manejadorProducto.getAllProductos();
        DefaultTableModel model = (DefaultTableModel) fProducto.jtableDBProductos.getModel();
        model.setRowCount(0);
        fProducto.jtableDBProductos = new JTable( model );
        Object rowData[] = new Object[5];
        for (int i = 0; i < dbProductos.size(); i++) {
            rowData[0]=dbProductos.get(i).getCodigo();
            rowData[1]=dbProductos.get(i).getNombre();
            rowData[2]=dbProductos.get(i).getPrecio();
            rowData[3]=dbProductos.get(i).getCantidad();
            rowData[4]=dbProductos.get(i).getDate();
            model.addRow(rowData);
            
        }
    }
}
