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
public class InicioGestionCliente {
    public static void main(String[] args) {
        GestionCliente gc= new GestionCliente();
        gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gc.setVisible(true);
    }
}
