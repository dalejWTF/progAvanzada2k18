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
public class Provinciales extends Llamada{
    private int franja;
    private int costo;

    public Provinciales(int franja, String nroOrigen, String nroDestino, double duracion) {
        super(nroOrigen, nroDestino, duracion);
        this.franja = franja;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    @Override
    public double CostoLlamada() {
        switch (getFranja()) {
            case 1:
                setCosto(20);
                return 20*getDuracion();
            case 2:
                setCosto(25);
                return 25*getDuracion();
            default:
                setCosto(30);
                return getCosto()*getDuracion();
        }
        
    }
    
    @Override
    public String toString(){
        
        return String.format("%s %10s %5s %10.2f", super.toString(),getCosto(),getFranja(),CostoLlamada());
    }
    
}
