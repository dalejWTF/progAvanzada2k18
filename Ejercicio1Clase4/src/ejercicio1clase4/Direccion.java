/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1clase4;

/**
 *
 * @author dalejwtf
 */
public class Direccion {
    private String provincia;
    private String canton;
    private String callePrincipal;
    private String calleSecundaria;
    private String numero;

    public Direccion(String provincia, String canton, String callePrincipal, String calleSecundaria, String numero) {
        this.provincia = provincia;
        this.canton = canton;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return String.format("Provincia: %s\n"
                + "Canton: %s\n"
                + "Calles: %s y %s\n"
                + "Numero: %s\n", getProvincia(),getCanton(),getCallePrincipal(),getCalleSecundaria(),getNumero());
    }
}
