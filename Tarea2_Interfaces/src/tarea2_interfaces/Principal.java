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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=20;
        Multiplicar multiplicar= new Multiplicar();
        Diferencia diferencia= new Diferencia();
        XOR xor = new XOR();
        
        Encriptador encriptador= new Encriptador(num, xor); 
        System.out.println("numero a encriptar: "+num);
        System.out.println("numero encriptado: "+encriptador.encriptar());
        System.out.println("numero desencriptado: "+encriptador.desencriptar());
    }
    
}
