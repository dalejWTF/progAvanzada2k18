/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner k = new Scanner(System.in).useDelimiter("\n");

        String exit = "";
        int opcion, elegir;
        SistemaDeCompras sdc = new SistemaDeCompras();

        do {
            sdc.MenuPrincipal();
            elegir = k.nextInt();
            if (elegir == 1) {
                do {
                    sdc.MenuRegistro();
                    opcion = k.nextInt();

                    if (opcion == 1) 
                        sdc.Agregar();
                     else if (opcion == 2) 
                        sdc.Buscar();
                     else if (opcion == 3) 
                        sdc.Editar();
                    

                } while (opcion > 0 && opcion < 4);

            }else if (elegir == 2) 
                sdc.Comprar();
                else if (elegir == 3) 
                     sdc.Facturar();

                System.out.println("Desea salir del programa(s/n)?:");
                exit = k.next();
            }
            while (exit.equalsIgnoreCase("n"));

        }


    }
