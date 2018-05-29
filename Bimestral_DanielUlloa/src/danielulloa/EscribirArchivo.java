/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielulloa;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
        
/**
 *
 * @author dalejwtf
 */
public class EscribirArchivo {
    private ObjectOutputStream salida;
    private ObjectInputStream entrada;
    
    public void AbrirArchivo(){
        try {
            salida= new ObjectOutputStream(new FileOutputStream("Cuentas.ser"));
        } catch (IOException e) {
            System.err.println("Error al abrir");
        }
    }
    
    public ArrayList<Cuenta> leerArchivo(){
        ArrayList<Cuenta>emp= new ArrayList<>();
        Cuenta em;
        
        try {
            
            entrada = new ObjectInputStream(new FileInputStream("Cuentas.ser"));
            while(true){
                emp.add((Cuenta)entrada.readObject());
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Clase no Encontrada");
        }catch( FileNotFoundException f){
            System.err.println("Archivo no encontrado");
        }catch(IOException io){
            System.err.checkError();
            
        }
        return emp;
    }
    
    public void Agregar(ArrayList<Cuenta> cuentas){
        try {
            for (Cuenta cuenta : cuentas) {
                salida.writeUnshared(cuenta);
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
