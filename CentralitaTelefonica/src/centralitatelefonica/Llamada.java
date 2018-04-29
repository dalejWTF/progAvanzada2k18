/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitatelefonica;

/**
 *
 * @author dalejwtf
 */
public abstract class Llamada {
    private String nroOrigen;
    private String nroDestino;
    private double duracion;

    public Llamada(String nroOrigen, String nroDestino, double duracion) {
        this.nroOrigen = nroOrigen;
        this.nroDestino = nroDestino;
        this.duracion = duracion;
    }

    public String getNroOrigen() {
        return nroOrigen;
    }

    public void setNroOrigen(String nroOrigen) {
        this.nroOrigen = nroOrigen;
    }

    public String getNroDestino() {
        return nroDestino;
    }

    public void setNroDestino(String nroDestino) {
        this.nroDestino = nroDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    abstract public double CostoLlamada();
    
    @Override
    public String toString(){
        return String.format("%10s %10s %8.2fsec",getNroOrigen(),getNroDestino(),getDuracion());
    }
}
