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
public class Pedido {
    private Producto cantidad[];
    private String fechaEmision;

    public Pedido(Producto[] cantidad, String fechaEmision) {
        this.cantidad = cantidad;
        this.fechaEmision = fechaEmision;
    }

    public Producto[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(Producto[] cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    
}
