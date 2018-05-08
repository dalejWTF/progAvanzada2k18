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
public class Agentes extends Empleado{
    private double valorFacturado;
    private int zona;
    private double porcentajeComisionZ1;
    private double porcentajeComisionZ2;
    private double porcentajeComisionZ3;

    public Agentes(double valorFacturado, int zona, String nombre, String apellido, int identificacion) {
        super(nombre, apellido, identificacion);
        this.valorFacturado = valorFacturado;
        this.zona = zona;
        this.porcentajeComisionZ1 = 5;
        this.porcentajeComisionZ2 = 7;
        this.porcentajeComisionZ3 = 9;
        calcularComision();
    }

    public double getValorFacturado() {
        return valorFacturado;
    }

    public void setValorFacturado(double valorFacturado) {
        this.valorFacturado = valorFacturado;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double getPorcentajeComisionZ1() {
        return porcentajeComisionZ1;
    }

    public void setPorcentajeComisionZ1(double porcentajeComisionZ1) {
        this.porcentajeComisionZ1 = porcentajeComisionZ1;
    }

    public double getPorcentajeComisionZ2() {
        return porcentajeComisionZ2;
    }

    public void setPorcentajeComisionZ2(double porcentajeComisionZ2) {
        this.porcentajeComisionZ2 = porcentajeComisionZ2;
    }

    public double getPorcentajeComisionZ3() {
        return porcentajeComisionZ3;
    }

    public void setPorcentajeComisionZ3(double porcentajeComisionZ3) {
        this.porcentajeComisionZ3 = porcentajeComisionZ3;
    }    

    @Override
    public double calcularComision() {
        switch (zona) {
            case 1:
                return (this.getPorcentajeComisionZ1()*this.getValorFacturado());
            case 2:
                return (this.getPorcentajeComisionZ2()*this.getValorFacturado());
            default:
                return (this.getPorcentajeComisionZ3()*this.getValorFacturado());
        }
    }
    
    @Override
    public String toString(){
        return String.format("%10s %10s %10s %10s %10s %10s\n"
                + "%s %10.2f %10d %10.2f","Nombre","Apellido","ID","Valor Fact","Zona","Comision", super.toString(), this.getValorFacturado(),this.getZona(), this.calcularComision());
    }
}
