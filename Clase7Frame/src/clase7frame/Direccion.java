/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7frame;

/**
 *
 * @author dalejwtf
 */
public class Direccion {
    private String provincia;
    private String canton;
    private String calle;
    private String numeroDomicilio;

    public Direccion(String provincia, String canton, String calle, String numero) {
        this.provincia = provincia;
        this.canton = canton;
        this.calle = calle;
        this.numeroDomicilio = numero;
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

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numeroDomicilio;
    }

    public void setNumero(String numero) {
        this.numeroDomicilio = numero;
    }
    
}
