package Clases;

/**
 * @author jbromero
 */
public class Direccion {
    private String Provincia;
    private String Canton;
    private String Calle;
    private int id_provincia;
    private int id_canton;

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

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public int getId_canton() {
        return id_canton;
    }

    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }
    
    
}
