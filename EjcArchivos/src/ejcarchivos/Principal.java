/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcarchivos;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Empleado>em= new ArrayList<>();
        ArrayList<Empleado>escribir= new ArrayList<>();
        escribir.add(new Empleado("Carlos",25,1800));
        escribir.add(new Empleado("Andres",20,1700));
        escribir.add(new Empleado("Daniel",18,1600));
        escribir.add(new Empleado("Alejandro",30,1500));
        escribir.add(new Empleado("José",35,1400));

        escribirArchivo g= new escribirArchivo();
        LecturaArchivo l= new LecturaArchivo();
        g.AbrirArchivo();
        g.Agregar(escribir);
        g.CerrarArchivo();
        l.AbrirArchivo();
        em=l.leerArchivo();
        l.CerrarArchivo();
        
        for (Iterator<Empleado> it = em.iterator(); it.hasNext();) {
            Empleado em1 = it.next();
            System.out.println(em1);
        }
    }
    
}
