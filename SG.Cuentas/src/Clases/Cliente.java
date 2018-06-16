/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author dalejwtf
 */
public class Cliente {
    private String cedula;
    private int id;
    private String apellidos;
    private String nombres;
    private Direccion dirResidencia;
    private Direccion dirTrabajo;
    private java.sql.Date sqlDate;
    private java.util.Date Date;
    public Cliente(){}
    public Cliente(String cedula, String apellidos, String nombres, Direccion dirResidencia, Direccion dirTrabajo) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dirResidencia = dirResidencia;
        this.dirTrabajo = dirTrabajo;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public java.util.Date getFechaNacimiento() {
        return Date;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.Date = FechaNacimiento;
    }

    public Direccion getDirResidencia() {
        return dirResidencia;
    }

    public void setDirResidencia(Direccion dirResidencia) {
        this.dirResidencia = dirResidencia;
    }

    public Direccion getDirTrabajo() {
        return dirTrabajo;
    }

    public void setDirTrabajo(Direccion dirTrabajo) {
        this.dirTrabajo = dirTrabajo;
    }
    
        public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = new java.sql.Date(sqlDate.getTime());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
