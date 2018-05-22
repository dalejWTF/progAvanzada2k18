/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7frame;

import javax.swing.JFrame;

/**
 *
 * @author dalejwtf
 */
public class Clase7Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v= new Ventana();
        v.setVisible(true);
        v.setSize(400,300);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
