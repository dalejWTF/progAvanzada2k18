/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel_ulloa_parcial1;

import java.util.ArrayList;

/**
 *
 * @author dalejwtf
 */
public class Receta {

    private int cantidad;
    private String prescripcion;
    private ArrayList<Medicamento> medicamentos;

    public Receta(int cantidad, String prescripcion, ArrayList<Medicamento> medicamentos) {
        this.cantidad = cantidad;
        this.prescripcion = prescripcion;
        this.medicamentos = medicamentos;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (Medicamento medicamento : medicamentos) {
            cadena += medicamento.toString() + "\n";
        }
        return String.format("%s %.0f veces al dia:\n"
                + "%s", getPrescripcion(), getCantidad(), cadena);
    }
}
