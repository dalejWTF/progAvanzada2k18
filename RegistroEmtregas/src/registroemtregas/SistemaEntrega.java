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
public class SistemaEntrega {
    private String nombre;
    private Persona personas[];

    public SistemaEntrega(String nombre, Persona[] personas) {
        this.nombre = nombre;
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    
    public int getCliente(int id){
        int pos=-1;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] instanceof Cliente) {
                Cliente c= (Cliente) personas[i];
                if (id== c.getPaquete().getId()) {
                    pos=i;
                }
            }
        }
        return pos;
    }
    
    public String printClientes(){
        String cadena="";
        for (Persona persona : personas) {
            if (persona instanceof Cliente) {
                Cliente c = (Cliente) persona;
                cadena= c.toString();
            }
        }
        return String.format("%s",cadena);
    }
}
