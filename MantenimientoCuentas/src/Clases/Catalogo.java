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
public class Catalogo {
    private int idCatalogo;
    private String recurso;

    public Catalogo(int idCatalogo, String recurso) {
        this.idCatalogo = idCatalogo;
        this.recurso = recurso;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }
    
    public String toString(){
        return getRecurso();
    }
}
