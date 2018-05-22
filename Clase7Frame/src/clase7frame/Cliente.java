/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7frame;

/**
 *
 * @author dalejwtf
 */
public class Cliente {
    private String cedula;
    private String apellido;
    private String nombre;
    private Direccion lugarResidencia;
    private Direccion lugarTrabajo;

    public Cliente(String cedula, String apellido, String nombre, Direccion lugarResidencia, Direccion lugarTrabajo) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.lugarResidencia = lugarResidencia;
        this.lugarTrabajo = lugarTrabajo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(Direccion lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public Direccion getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(Direccion lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }
    
}
