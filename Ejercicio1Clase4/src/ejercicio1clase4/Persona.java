/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1clase4;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int cedula;
    private Fecha fechaNacimiento;
    private ArrayList<Direccion> direccionEnvio;

    public Persona(String nombre, String apellido, int cedula, Fecha fechaNacimiento, ArrayList<Direccion> direccionEnvio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionEnvio = direccionEnvio;
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

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Direccion> getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(ArrayList<Direccion> direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    @Override
    public String toString() {
        String cadena = "Lugar de entrega\n";
        int i = 1;
        for (Direccion direccionEnvio1 : getDireccionEnvio()) {
            cadena += String.format("%d)\n"
                    + "%s\n", i, direccionEnvio1.toString());
            i++;
        }
        return String.format("%s %s %d %s\n"
                + "%s", getNombre(), getApellido(), getCedula(), getFechaNacimiento().toString(), cadena);
    }

}
