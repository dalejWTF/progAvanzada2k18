/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerclase5;

/**
 *
 * @author dalejwtf
 */
public class Ventanilla extends Empleado {
    private String cargo;
    private double valorRecaudado;
    private double porcentajeComisionVentas;

    public Ventanilla(String cargo, double valorRecaudado, double porcentajeComisionVentas, String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
        this.cargo = cargo;
        this.valorRecaudado = valorRecaudado;
        this.porcentajeComisionVentas = porcentajeComisionVentas;
        calcularComision();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorRecaudado() {
        return valorRecaudado;
    }

    public void setValorRecaudado(double valorRecaudado) {
        this.valorRecaudado = valorRecaudado;
    }

    public double getPorcentajeComisionVentas() {
        return porcentajeComisionVentas;
    }

    public void setPorcentajeComisionVentas(double porcentajeComisionVentas) {
        this.porcentajeComisionVentas = porcentajeComisionVentas;
    }

    @Override
    public double calcularComision() {
        return (this.getPorcentajeComisionVentas()*this.getValorRecaudado())/100;
    }
    
    @Override
    public String toString(){
        return String.format("%10s %10s %10s %10s %10s %10s %10s\n"
                + "%s %10s %10.2f %10.2f %10.2f","Nombre","Apellido","ID","Cargo","Valor Rec","Porcentaje C","Comision"
                ,super.toString(), this.getCargo(), this.getValorRecaudado(), this.getPorcentajeComisionVentas(), this.calcularComision());
    }
    
}
