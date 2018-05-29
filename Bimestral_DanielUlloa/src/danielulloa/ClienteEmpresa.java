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
public class ClienteEmpresa extends Cliente{
    private String ruc;
    private String razonSocial;
    private ClientePersona representanteLegal;
    private Residencia lugarResidencia;

    public ClienteEmpresa(String ruc, String razonSocial, ClientePersona representanteLegal, Residencia lugarResidencia, String nombre, String apellido, String edad) {
        super(nombre, apellido, edad);
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.representanteLegal = representanteLegal;
        this.lugarResidencia = lugarResidencia;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ClientePersona getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(ClientePersona representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public Residencia getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(Residencia lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }
    
    
}
