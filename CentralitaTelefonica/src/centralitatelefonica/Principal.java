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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Llamada> llamadas= new ArrayList<>();
        
        llamadas.add(new Locales("123456789","987456123",5.5));
        llamadas.add(new Locales("123456789","987456123",22.5));
        llamadas.add(new Locales("123456789","987456123",19.5));
        llamadas.add(new Provinciales(1,"123456789","987456123",15.5));
        llamadas.add(new Provinciales(2,"123456789","987456123",10.5));
        llamadas.add(new Provinciales(3,"123456789","987456123",20.5));
        
        Centralita c= new Centralita(llamadas);
        System.out.printf("%s %s %10s %10s %3s %15s \n","Nro Origen","Nro Destino","Duracion","Precio","Tipo","Total a Pagar");
        System.out.println(c);
    }
    
}
