/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author dalejwtf
 */
public class Producto {
    private int id;
    private String nombre;
    private double costo;
    private int stock;

    public Producto(int id, String nombre, double costo, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public double obtenerPrecio(){
        return this.costo*this.getStock();
    }
    @Override
    public String toString(){
        return String.format("%3d %20s %10d %10.2f",getId(),getNombre(),getStock(),getCosto());
    }
    
}
