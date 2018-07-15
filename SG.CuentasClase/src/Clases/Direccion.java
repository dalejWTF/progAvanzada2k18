package Clases;

/**
 * @author jbromero
 */
public class Direccion {
    private String Provincia;
    private String Canton;
    private String Calle;

    public Direccion(String Provincia, String Canton, String Calle) {
        this.Provincia = Provincia;
        this.Canton = Canton;
        this.Calle = Calle;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    
}
