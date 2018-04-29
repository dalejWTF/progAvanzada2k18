/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitatelefonica;

import java.util.ArrayList;



/**
 *
 * @author dalejwtf
 */
public class Centralita {
    private ArrayList <Llamada> llamadas;
    private double costoTotal;

    public Centralita(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
        setCostoTotal();
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal() {
        this.costoTotal = costoLocalTotal()+costoProvincialTotal();
    }
    
    public double costoLocalTotal(){
        double total=0;
        for (Llamada llamada : getLlamadas()) {
            if (llamada instanceof Locales ) {
                Locales l= (Locales) llamada;
                total+= l.CostoLlamada();
            }
        }
        return total;
    }
    
    public double costoProvincialTotal(){
        double total=0;
        for (Llamada llamada : getLlamadas()) {
            if (llamada instanceof Provinciales ) {
                Provinciales l= (Provinciales) llamada;
                total+= l.CostoLlamada();
            }
        }
        return total;
    }
    
    @Override
    public String toString(){
        String cadena="";
        for (Llamada llamada : getLlamadas()) {
            cadena+= String.format("%s\n", llamada.toString());
        }
        return String.format("%s\n"
                + "Total Costo: %.2f",cadena,getCostoTotal());
    }
}
