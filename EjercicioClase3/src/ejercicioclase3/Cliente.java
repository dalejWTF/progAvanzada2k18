/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase3;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String identificacion;
    private String genero;
    private String usuario;
    private String contrasena;
    private String direccion;

    public Cliente(String nombre, String apellido, String identificacion, String genero, String usuario, String contrasena, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.genero = genero;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int BuscarCliente(String nombre){
        if (getNombre().equalsIgnoreCase(nombre)) {
            return 1;
        }else
           return 0; 
    }
    
    public void ModificarCliente(int opcion, String arg){
        if (opcion==1)
            this.setNombre(arg);
        else if(opcion==2)
            this.setApellido(arg);
            
    }
}
