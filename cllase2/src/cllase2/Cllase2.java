/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cllase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Cllase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente agg = new Cliente();

        Scanner k = new Scanner(System.in).useDelimiter("\n");
        String nombres, identificacion, fecha, genero, usuario, contrasena;
        String continuar = "";
        int opcion;
        do {
            System.out.println("Sistema de registro");
            System.out.println("[1]Registrar Usuario\n"
                    + "[2]Buscar Usuario\n"
                    + "[3]Editar Usuario");
            opcion = k.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.print("Ingrese nombre: ");
                        nombres = k.next();
                        System.out.print("Ingrese identificacion: ");
                        identificacion = k.next();
                        System.out.print("Ingrese fecha nacimiento: ");
                        fecha = k.next();
                        System.out.print("Ingrese genero: ");
                        genero = k.next();

                        System.out.print("Ingrese usuario: ");
                        usuario = k.next();
                        System.out.print("Ingrese contraseña: ");
                        contrasena = k.next();

                        if (clientes.isEmpty()) {
                            agg = new Cliente(nombres, identificacion, fecha, genero, usuario, contrasena);
                            clientes.add(agg);
                        } else {
                            for (Cliente cliente : clientes) {
                                while(cliente.getUsuario().equalsIgnoreCase(usuario) || cliente.getContrasena().equalsIgnoreCase(contrasena)) {
                                    cliente.validarUsuarioContra(usuario, contrasena);
                                    System.out.print("Ingrese usuario: ");
                                    usuario = k.next();
                                    System.out.print("Ingrese contraseña: ");
                                    contrasena = k.next();
                                }
                            }
                            agg = new Cliente(nombres, identificacion, fecha, genero, usuario, contrasena);
                            clientes.add(agg);
                        }

                        System.out.println("Desea crear otro usuario?: ");
                        continuar = k.next();
                    } while (continuar.equalsIgnoreCase("s"));
                case 2:
                    System.out.println("Ingrese el usuario a buscar: ");
                    String user= k.next();
            
            }

        } while (opcion > 0 && opcion < 4);

    }

}
