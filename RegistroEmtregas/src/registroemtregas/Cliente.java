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
public class Cliente extends Persona{
    private String direccion;
    private String correo;
    private Paquete paquete;
    

    public Cliente(String direccion, String correo, Paquete paquete, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.direccion = direccion;
        this.correo = correo;
        this.paquete = paquete;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    
    
    @Override
    public String toString(){
        return String.format("%10d %15s %15s %10s %10s %17s %23s %14s \t%s"
                , getPaquete().getId(),getPaquete().getFechaRegistro(),getPaquete().getFechaEntrega(),getNombre(),getApellido(),getPaquete().getNombre(),getDireccion(),getPaquete().getEstado(),getPaquete().getObservacion());
    }
    
}
