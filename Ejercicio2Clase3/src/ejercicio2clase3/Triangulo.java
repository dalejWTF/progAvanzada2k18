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
public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP3() {
        return p3;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }
    
    public double CalcularArea(){
        double a=getP1().CalcularDistanciaDesde(getP2());
        double b=getP2().CalcularDistanciaDesde(getP3());
        return ((a/(b/2))*(a/2))/2;
    }
    
    public double CalcularPerimetro(){
        double a=getP1().CalcularDistanciaDesde(getP2());
        double b=getP2().CalcularDistanciaDesde(getP3());
        double c=getP1().CalcularDistanciaDesde(getP3());
        return a+b+c;
    }
    
    
}
