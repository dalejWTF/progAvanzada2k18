/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroemtregas;

/**
 *
 * @author dalejwtf
 */
public class Paquete {
    private String nombre;
    private int id;
    private String fechaRegistro;
    private String fechaEntrega;
    private String estado;
    private String observacion;

    public Paquete(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.fechaRegistro = "14/04/2017";
        this.fechaEntrega="s/n";
        this.estado = "Por Entregar";
        this.observacion = "s/n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
    @Override
    public String toString(){
        return String.format("%s %16d", getNombre(),getId());
        
    }
}
