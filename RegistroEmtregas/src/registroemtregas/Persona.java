/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroemtregas;

/**
 *
 * @author dalejwtf
 */
public class Persona {
    private String nombre, apellido;
    private int cedula;

    public Persona(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int id) {
        this.cedula = id;
    }

    @Override
    public String toString(){
        return String.format("%s %s con id: %d",getNombre(),getApellido(),getCedula());
    }
    
}
