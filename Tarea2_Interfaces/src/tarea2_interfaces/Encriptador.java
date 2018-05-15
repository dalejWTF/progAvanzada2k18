/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_interfaces;

/**
 *
 * @author dalejwtf
 */
public class Encriptador {
    private int numero;
    private Algoritmo algoritmo;
    
    public Encriptador(int numero,Algoritmo algoritmo) {
        this.numero = numero;
        this.algoritmo=algoritmo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Algoritmo getAlgoritmo() {
        return algoritmo;
    }

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }
    
    public int encriptar(){
        if (getAlgoritmo() instanceof Multiplicar) {
            Multiplicar m=(Multiplicar) getAlgoritmo();
            m=new Multiplicar(getNumero());
            return (int) m.encriptar();
            
        }else if (getAlgoritmo() instanceof Diferencia){
            Diferencia d=(Diferencia) getAlgoritmo();
            d=new Diferencia(getNumero());
            return (int) d.encriptar();
            
        }else{
            XOR x=(XOR) getAlgoritmo();
            x=new XOR(getNumero());
            return (int) x.encriptar();
        }
           
    }
    
    public int desencriptar(){
     
        if (getAlgoritmo() instanceof Multiplicar) {
            Multiplicar m=(Multiplicar) getAlgoritmo();
            m=new Multiplicar(getNumero());
            return (int) m.desencriptar();
            
        }else if (getAlgoritmo() instanceof Diferencia){
            Diferencia d=(Diferencia) getAlgoritmo();
            d=new Diferencia(getNumero());
            return (int) d.desencriptar();
            
        }else{
            XOR x=(XOR) getAlgoritmo();
            x=new XOR(getNumero());
            return (int) x.desencriptar();
        }
    }
    
}
