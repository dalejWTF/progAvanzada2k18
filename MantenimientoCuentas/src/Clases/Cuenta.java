/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.*;

/**
 *
 * @author dalejwtf
 */
public class Cuenta {
    private int idCuenta;
    private String nroCta;
    private Date FechaApertura;
    private String tipoCta;
    private String estadoCta;
    private double Saldo;
    private ArrayList<Cliente>TitularCta;

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNroCta() {
        return nroCta;
    }

    public void setNroCta(String nroCta) {
        this.nroCta = nroCta;
    }

    public Date getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(Date FechaApertura) {
        this.FechaApertura = FechaApertura;
    }

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
    }

    public String getEstadoCta() {
        return estadoCta;
    }

    public void setEstadoCta(String estadoCta) {
        this.estadoCta = estadoCta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public ArrayList<Cliente> getTitularCta() {
        return TitularCta;
    }

    public void setTitularCta(ArrayList<Cliente> TitularCta) {
        this.TitularCta = TitularCta;
    }
    
    
    
}
