/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dalejwtf
 */
public class Canton {
    private int id_canton;
    private int id_provincia;
    private String nombre;

    public Canton(int id_canton, int id_provincia, String nombre) {
        this.id_canton = id_canton;
        this.id_provincia = id_provincia;
        this.nombre = nombre;
    }

    
    public int getId_canton() {
        return id_canton;
    }

    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return nombre;
    }
}
