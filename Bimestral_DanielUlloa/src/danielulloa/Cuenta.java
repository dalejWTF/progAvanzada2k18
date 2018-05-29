/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielulloa;

import java.io.Serializable;

/**
 *
 * @author dalejwtf
 */
public class Cuenta implements Serializable{
    private String nroCuenta;
    private Fecha fechaApertura;
    private String tipoCuenta;
    private String titular;
    private double saldo;

    public Cuenta(String nroCuenta, Fecha fechaApertura, String tipoCuenta, String titular, double saldo) {
        this.nroCuenta = nroCuenta;
        this.fechaApertura = fechaApertura;
        this.tipoCuenta = tipoCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Fecha fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double saldo) {
        this.saldo += saldo;
    }
    
    public void retiro(double dineroRetiro){
        if (getTipoCuenta().equalsIgnoreCase("ahorro"))
            if (getSaldo()>dineroRetiro) 
                this.saldo-= dineroRetiro;
            else
                System.out.println("Saldo Insuficiente");
        else
            System.err.println("Solo se puede retirar de cuentas de ahorro!");
    }
    
    public void InteresMensual(Fecha fechaActual){
        int mesApertura= this.getFechaApertura().getMes();
        int mesActual= fechaActual.getMes();
        
        int anioApertura= this.getFechaApertura().getAnio();
        int anioActual= fechaActual.getAnio();
        
        int tmpmeses=mesActual-mesApertura;
        int tmpanios= anioActual-anioApertura;
        int mesesTotales=(tmpanios*12)+tmpmeses;
        double interes=0;
        if (mesesTotales>12) {
            double a= ((mesesTotales*0.05)/12.0);
            interes=a*getSaldo();
            setDeposito(getSaldo()+interes);
            
        }else{
            double a= ((mesesTotales*0.05)/12.0);
            interes=a*getSaldo();
            setDeposito(getSaldo()+interes);
        }
        
        
    }
    
    @Override
    public String toString(){
        return String.format("%10s %10s %10s %10s %10.2f",getFechaApertura().getFecha(),getNroCuenta(),getTitular(),getTipoCuenta(),getSaldo() );
    }
}
