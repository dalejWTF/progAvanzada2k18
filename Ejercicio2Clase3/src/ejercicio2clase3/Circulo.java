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
public class Circulo {
    private double radio;
    private Punto p1;

    public Circulo(double radio, Punto p1) {
        this.radio = radio;
        this.p1 = p1;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    
    public double CalcularArea(){
        return Math.PI*Math.pow(getRadio(), 2);
    }
    
    public double CalcularPerimetro(){
        return 2*(Math.PI)*getRadio();
    }
}
