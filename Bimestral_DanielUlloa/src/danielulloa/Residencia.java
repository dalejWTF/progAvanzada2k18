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
public class Residencia implements Serializable{
    private String provincia;
    private String canton;
    private String callePrincipal;

    public Residencia(String provincia, String canton, String callePrincipal) {
        this.provincia = provincia;
        this.canton = canton;
        this.callePrincipal = callePrincipal;
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
    
}
