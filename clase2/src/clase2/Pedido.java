/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> cantidad;
    private String fechaEmision;

    public Pedido(){}

    public Pedido(Cliente cliente, ArrayList<Producto> cantidad, String fechaEmision) {
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.fechaEmision = fechaEmision;
    }
   

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getCantidad() {
        return cantidad;
    }

    public void setCantidad(ArrayList<Producto> cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    
}
