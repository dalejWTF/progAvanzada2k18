/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2clase3;

/**
 *
 * @author dalejwtf
 */
public class Ejercicio2Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto p1= new Punto(2,3);
        Punto p2= new Punto(4,6);
        Punto p3= new Punto(6,4);
        
        Triangulo t= new Triangulo(p1,p2,p3);
        
        Circulo c= new Circulo(3.26,p1);
        
        System.out.println("Area del Triangulo: "+t.CalcularArea());
        System.out.println("Perimetro del Triangulo: "+t.CalcularPerimetro());
        System.out.println("Area del Circulo: "+c.CalcularArea());
        System.out.println("Perimetro del Circulo: "+c.CalcularPerimetro());
        
    }
    
}
