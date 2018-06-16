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
public class Direccion {
    private String provincia;
    private String canton;
    private String calle;
    private int id_provincia;
    private int id_canton;
    
    public Direccion(){}
    
    public Direccion(String canton, int id_provincia, int id_canton) {
        this.canton = canton;
        this.id_provincia = id_provincia;
        this.id_canton = id_canton;
    }
    
    public Direccion(String provincia, String canton, String calle) {
        this.provincia = provincia;
        this.canton = canton;
        this.calle = calle;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }
    
    public int getId_canton() {
        return id_canton;
    }
    
    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }
}
