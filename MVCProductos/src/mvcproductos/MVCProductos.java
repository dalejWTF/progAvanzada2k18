/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcproductos;

import Controlador.ControlProducto;
import Modelo.ManejadorProducto;
import Modelo.Producto;
import Vista.frmProducto;

/**
 *
 * @author dalejwtf
 */
public class MVCProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto= new Producto();
        ManejadorProducto manejadorProducto= new ManejadorProducto();
        frmProducto fProducto= new frmProducto();
        fProducto.setTitle("Ventana de Ventas");
        ControlProducto controlProducto= new ControlProducto(producto, manejadorProducto, fProducto);
        fProducto.setVisible(true);
    }
    
}
