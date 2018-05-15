/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcarchivos;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
        
/**
 *
 * @author dalejwtf
 */
public class escribirArchivo {
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;
    
    public void AbrirArchivo(){
        try {
            salida= new ObjectOutputStream(new FileOutputStream("Empleado.ser"));
        } catch (IOException e) {
            System.err.println("Error al abrir");
        }
    }
    
    public void Agregar(ArrayList<Empleado> emp){
        try {
            for (Empleado emp1 : emp) {
                salida.writeUnshared(emp1);
            }
            
        } catch (IOException e) {
            System.err.println("Error al agregar");
        }
    }
    
    public void CerrarArchivo(){
        try {
            salida.close();
        } catch (Exception e) {
            System.err.println("Error al cerrar");
        }
    }
    
}
