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
public class Locales extends Llamada{
    private int costo;

    public Locales(String nroOrigen, String nroDestino, double duracion) {
        super(nroOrigen, nroDestino, duracion);
        this.costo = 15;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    @Override
    public double CostoLlamada() {
        return getCosto()*getDuracion();
    }

    @Override
    public String toString(){
        return String.format("%s %10d %5s %10.2f",super.toString(), getCosto(),"***",CostoLlamada());
    }
}
