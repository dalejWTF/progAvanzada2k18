/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcarchivos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

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
//        ArrayList<Empleado>em= new ArrayList<>();
//        ArrayList<Empleado>escribir= new ArrayList<>();
//        escribir.add(new Empleado("Carlos",25,1800));
//        escribir.add(new Empleado("Andres",20,1700));
//        escribir.add(new Empleado("Daniel",18,1600));
//        escribir.add(new Empleado("Alejandro",30,1500));
//        escribir.add(new Empleado("José",35,1400));
//
//        escribirArchivo g= new escribirArchivo();
//        LecturaArchivo l= new LecturaArchivo();
//        g.AbrirArchivo();
//        g.Agregar(escribir);
//        g.CerrarArchivo();
//        l.AbrirArchivo();
//        em=l.leerArchivo();
//        l.CerrarArchivo();
//        
//        for (Iterator<Empleado> it = em.iterator(); it.hasNext();) {
//            Empleado em1 = it.next();
//            System.out.println(em1);
//        }

        //Collections
        
        String[]nombres={"Pedro","Ana","Luis","Juan"};
        List <String> listado1= new ArrayList<String>();
        for (String nombre : nombres) {
            listado1.add(nombre);
        }
        System.out.println("Inicial");
        for (int i = 0; i < listado1.size(); i++) {
            System.out.println(listado1.get(i));
        }
        List <String> listado2= new ArrayList<>();
        listado2.add("Ximena");
        listado2.add("ana");
        
        Collection<String>cl= listado1;
        
        Collection<String>cl2= listado2;
        Iterator<String> i1= cl.iterator();
        
        while(i1.hasNext()){
            if (cl.contains(i1.hasNext())) {
                i1.remove();
            }
        }
        System.out.println("Remove");
        for (String n: listado1) {
            System.out.println(n);
        }
        
        List <String> listado3= new ArrayList<>();
        listado2.add("Pepe");
        listado2.add("Andres");
        
        listado1.addAll(listado3);
        System.out.println("addAll");
        for (String n: listado1) {
            System.out.println(n);
        }

        //Generica
//           Generica <String> nombre= new Generica<>();
//           nombre.setDato("Daniel");
//           System.out.println(nombre.getDato());
//           Generica <Empleado> obje= new Generica<>();
//           obje.setDato(new Empleado("Daniel",21,1234));
//           System.out.println(obje.getDato());
    }
    
}
