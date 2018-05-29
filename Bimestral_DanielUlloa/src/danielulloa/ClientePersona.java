/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danielulloa;

/**
 *
 * @author dalejwtf
 */
public class ClientePersona extends Cliente {
    private String cedula;
    private Residencia lugarResidencia;

    public ClientePersona(String cedula, Residencia lugarResidencia, String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
        this.cedula = cedula;
        this.lugarResidencia = lugarResidencia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Residencia getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(Residencia lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }
    
    
}
