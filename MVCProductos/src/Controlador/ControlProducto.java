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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dalejwtf
 */
public class ControlProducto implements ActionListener {

    private Producto producto;
    private ManejadorProducto manejadorProducto;
    private frmProducto fProducto;

    public ControlProducto(Producto pro, ManejadorProducto manejadorProducto, frmProducto fProducto) {
        this.producto = pro;
        this.manejadorProducto = manejadorProducto;
        this.fProducto = fProducto;

        this.fProducto.btnGuardar.addActionListener(this);
        this.fProducto.btnBuscar.addActionListener(this);
        this.fProducto.btnEliminar.addActionListener(this);
        this.fProducto.btnModificar.addActionListener(this);
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
        if (e.getSource() == this.fProducto.btnGuardar) {
            this.producto.setCodigo(this.fProducto.txtCodigo.getText());
            this.producto.setNombre(this.fProducto.txtNombre.getText());
            this.producto.setPrecio(Double.parseDouble(this.fProducto.txtPrecio.getText()));
            this.producto.setCantidad(Integer.parseInt(this.fProducto.txtCantidad.getText()));
            if (this.manejadorProducto.Guardar(producto)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado!");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el producto!");
            }
        }

        if (e.getSource() == this.fProducto.btnBuscar) {
            producto = manejadorProducto.Buscar(fProducto.txtCodigo.getText());

            if (producto != null) {
                Limpiar();
                JOptionPane.showMessageDialog(null, "Producto encontrado!!");
                fProducto.txtCodigo.setText(producto.getCodigo());
                fProducto.txtNombre.setText(producto.getNombre());
                fProducto.txtPrecio.setText(Double.toString(producto.getPrecio()));
                fProducto.txtCantidad.setText(Integer.toString(producto.getCantidad()));
                fProducto.txtId.setText(Integer.toString(producto.getId()));
            } else {
                JOptionPane.showMessageDialog(null, "Producto no Encontrado!");
                Limpiar();
            }

        }

        if (e.getSource() == this.fProducto.btnModificar) {
            this.producto.setCodigo(this.fProducto.txtCodigo.getText());
            this.producto.setNombre(this.fProducto.txtNombre.getText());
            this.producto.setPrecio(Double.parseDouble(this.fProducto.txtPrecio.getText()));
            this.producto.setCantidad(Integer.parseInt(this.fProducto.txtCantidad.getText()));
            this.producto.setId(Integer.parseInt(fProducto.txtId.getText()));
            if(this.manejadorProducto.Editar(producto)){
                JOptionPane.showMessageDialog(null, "Registro Modificado!");
                Limpiar();
            }else
                JOptionPane.showMessageDialog(null, "No se pudo modificar el producto!");
        }
        
        if (e.getSource()== this.fProducto.btnEliminar) {
            if (this.manejadorProducto.Eliminar(this.producto.getId())) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado!");
                Limpiar();
            }else
                JOptionPane.showMessageDialog(null, "No se pudo Eliminar el producto!");
        }

    }

    public void Limpiar() {
        this.fProducto.txtCodigo.setText(null);
        this.fProducto.txtNombre.setText(null);
        this.fProducto.txtPrecio.setText(null);
        this.fProducto.txtCantidad.setText(null);
        this.fProducto.txtId.setText(null);
    }
}
