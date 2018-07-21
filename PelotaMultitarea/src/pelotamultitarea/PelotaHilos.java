/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelotamultitarea;

import java.awt.Component;

/**
 *
 * @author dalejwtf
 */
public class PelotaHilos implements  Runnable{
    private Pelota pelota;
    private Component componente;

    public PelotaHilos(Pelota pelota, Component componente) {
        this.pelota = pelota;
        this.componente = componente;
    }
    
    @Override
    public void run(){
        for (int i = 0; i <=3000; i++) {
            pelota.muevePelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4);
            } catch (Exception e) {
            }
        }
    }
}
