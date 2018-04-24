/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1clase4;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Ejercicio1Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Direccion>direccion= new ArrayList<>();
        
        direccion.add(new Direccion("Loja","Loja","Argentina","Uruguay","1234"));
        direccion.add(new Direccion("Loja","Loja","Mercadillo","Sucre","4567"));
        direccion.add(new Direccion("Loja","Loja","Bernado Valdivieso","Azuay","7890"));
        direccion.add(new Direccion("Loja","Loja","10 de Agosto","Bolivar","1470"));
        direccion.add(new Direccion("Loja","Loja","Quito","24 de Mayo","2580"));
        
        
        Fecha f= new Fecha(1996,9,8);
        Persona p= new Persona("Daniel","Ulloa",1234,f,direccion);
        
        System.out.println(p);
        System.out.println("==========================================================");
        direccion.add(new Direccion("Loja","Loja","Quito","24 de Mayo","2580"));
        p.setDireccionEnvio(direccion);
        System.out.println(p);
        
        
    }
    
}
