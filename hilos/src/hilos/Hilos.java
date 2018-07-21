/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author dalejwtf
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Contador hilo1= new Contador(1, 10, "hilo 1");
//        Contador hilo2= new Contador(10, 20, "hilo 2");
//        System.out.println("inicio multitarea");
//        hilo1.start();
//        hilo2.start();

        ContadorR tmpH1= new ContadorR(10, 20, "Runneable 1");
        ContadorR tmpH2= new ContadorR(10, 20, "Runneable 2");
        Thread Hilo1= new Thread(tmpH1);
        Thread Hilo2= new Thread(tmpH2);
        
        Hilo1.start();
        Hilo2.start();
    }
    
}
