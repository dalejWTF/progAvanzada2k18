/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Pedido {
    private int NumeroOrden;
    private String fecha;
    private Cliente clientes;

    public Pedido(int NumeroOrden, String fecha, Cliente clientes) {
        this.NumeroOrden = NumeroOrden;
        this.fecha = fecha;
        this.clientes = clientes;
    }

    public int getNumeroOrden() {
        return NumeroOrden;
    }

    public void setNumeroOrden(int NumeroOrden) {
        this.NumeroOrden = NumeroOrden;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    
    public int BuscarPedido(int nroPedido){
        if (this.getNumeroOrden()==nroPedido) {
            return 1;
        }else
            return 0;
    }
    
    public void EliminarPedido(int nroPedido){
        
        if (this.getNumeroOrden()==nroPedido) {
            this.setClientes(null);
            this.setFecha(null);
            this.setNumeroOrden(0);
        }
    }
    
    @Override
    public String toString(){
        if (this.getClientes()!=null) {
            return String.format("El cliente %s %s tiene un pedido, Nro de pedido: %d", getClientes().getNombre(), getClientes().getApellido(), getNumeroOrden());
        }else
        return String.format("no hay pedidos!");
    }
}
