/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.util.Scanner;

/**
 *
 * @author dalejwtf
 */
public class Cliente {
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String fecha;
    private String genero;
    private String usuario;
    private String contrasena;
    
    public Cliente(){}

    public Cliente(String nombres, String apellidos, String identificacion, String fecha, String genero, String usuario, String contrasena) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.fecha = fecha;
        this.genero = genero;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    
    public boolean validarUsuarioContra(String usuario, String contra){
        boolean validar= false;
        if (usuario.equalsIgnoreCase(getUsuario()) || contra.equalsIgnoreCase(getContrasena())) {
            System.err.println("usuario o contraseña ya en uso. Ingrese nuevamente");
            validar= true;
            
        }
        return validar;
    }
    
    public int buscar(String usuario){
        int bandera;
        if (usuario.equalsIgnoreCase(getUsuario())) {
            System.out.println("Usuario Encontrado");
            
            bandera=1;
        }
        else{
            bandera=0;
        }
        return bandera;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s", getNombres(),getApellidos(),getUsuario());
    }
}
