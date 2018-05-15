/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejcarchivos;

/**
 *
 * @author dalejwtf
 */
public class Generica<T> {
    private T dato;

    public Generica() {
        this.dato = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
}
