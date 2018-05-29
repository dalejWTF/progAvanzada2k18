/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
