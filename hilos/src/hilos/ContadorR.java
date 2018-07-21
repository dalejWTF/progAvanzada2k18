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
public class ContadorR implements Runnable{
    private int inicio;
    private int fin;
    private String nombre;

    public ContadorR(int inicio, int fin, String nombre) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }
    
    
    @Override
    public void run(){
        System.out.println(nombre+"Empieza");
        for (int i = inicio; i < fin; i++) {
            System.out.println(nombre+"-- act: "+i);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }
        }
        System.out.println("fin --"+nombre);
    }
}
