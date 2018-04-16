/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cllase2;

/**
 *
 * @author dalejwtf
 */
public class Factura {
    private int nroFactura;
    private Cliente datos;
    private String fecha;
    private Pedido productos;
    private String tipoPago;

    public Factura(int nroFactura, Cliente datos, String fecha, Pedido productos, String tipoPago) {
        this.nroFactura = nroFactura;
        this.datos = datos;
        this.fecha = fecha;
        this.productos = productos;
        this.tipoPago = tipoPago;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Cliente getDatos() {
        return datos;
    }

    public void setDatos(Cliente datos) {
        this.datos = datos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pedido getProductos() {
        return productos;
    }

    public void setProductos(Pedido productos) {
        this.productos = productos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    public void SumatoriaTotal(){
        
    }
    
    public void ImprimirFactura(){
        
    }
    
}
