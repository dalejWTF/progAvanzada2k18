/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel_ulloa_parcial1;

/**
 *
 * @author dalejwtf
 */
public class Medicamento {
    private int codigo;
    private String nombre;
    private String dosisRecomendada;

    public Medicamento(int codigo, String nombre, String dosisRecomendada) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dosisRecomendada = dosisRecomendada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDosisRecomendada() {
        return dosisRecomendada;
    }

    public void setDosisRecomendada(String dosisRecomendada) {
        this.dosisRecomendada = dosisRecomendada;
    }
    
    @Override
    public String toString(){
        return String.format("beber %s de %s", getDosisRecomendada(),getNombre());
    }
}