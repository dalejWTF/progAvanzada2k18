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
public class VentasCorporativas implements Comision{
    private String numFactura;
    private double valorFactura;
    private double porcentajeComision;

    public VentasCorporativas(String numFactura, double valorFactura, double porcentajeComision) {
        this.numFactura = numFactura;
        this.valorFactura = valorFactura;
        this.porcentajeComision = porcentajeComision;
        calcularComision();
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularComision() {
       return (this.getPorcentajeComision()*this.getValorFactura());
    }
    
    @Override
    public String toString(){
        return String.format("%10s %10s %10s %10s\n"
                + "%10s %10.2f %10.2f %10.2f","Num Factura","Valor Fact","Porcentaje","Comision",this.getNumFactura(),this.getValorFactura(),this.getPorcentajeComision(), this.calcularComision());
    }
    
}
