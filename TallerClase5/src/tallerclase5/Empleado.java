/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerclase5;

/**
 *
 * @author dalejwtf
 */
public abstract class Empleado implements Comision{
    private String nombre;
    private String apellido;
    private int identificacion;

    public Empleado(String nombre, String apellido, int identificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString(){
        return String.format("%10s %10s %10d", this.getNombre(),this.getApellido(),this.getIdentificacion());
    }
}
