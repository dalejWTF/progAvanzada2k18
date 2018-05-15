/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcarchivos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class LecturaArchivo {

    private ObjectInputStream entrada;

    public void AbrirArchivo() {
        try {
            entrada = new ObjectInputStream(new FileInputStream("Empleado.ser"));
        } catch (IOException e) {
            System.err.println("Error al abrir");
        }
    }

    public ArrayList<Empleado> leerArchivo(){
        ArrayList<Empleado>emp= new ArrayList<>();
        Empleado em;
        
        try {
            
            entrada = new ObjectInputStream(new FileInputStream("Empleado.ser"));
            while(true){
                emp.add((Empleado)entrada.readObject());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no Encontrada");
        }catch( FileNotFoundException f){
            System.out.println("Archivo no encontrado");
        }catch(IOException io){
            
            
        }
        return emp;
    }

    public void CerrarArchivo() {
        try {
            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al cerrar");
        }
    }
}
