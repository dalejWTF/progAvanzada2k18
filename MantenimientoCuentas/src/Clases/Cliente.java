package Clases;

import java.sql.Date;

/**
 * @author jbromero
 */
public class Cliente {
    private String Cedula;
    private String Apellidos;
    private String Nombres;
    private Date FechaNacimiento;
    private Direccion DirResidencia;
    private Direccion DirTrabajo;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public Direccion getDirResidencia() {
        return DirResidencia;
    }

    public void setDirResidencia(Direccion DirResidencia) {
        this.DirResidencia = DirResidencia;
    }

    public Direccion getDirTrabajo() {
        return DirTrabajo;
    }

    public void setDirTrabajo(Direccion DirTrabajo) {
        this.DirTrabajo = DirTrabajo;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %d", this.getApellidos(), this.getNombres(),this.getCedula(),this.getId());
    }
}
