package Clases;

/**
 * @author Usuario
 */
public class Canton {
    private int id_canton;
    private int id_provincia;
    private String Canton;

    public Canton(int id_canton, int id_provincia, String Canton) {
        this.id_canton = id_canton;
        this.id_provincia = id_provincia;
        this.Canton = Canton;
    }

    public int getId_canton() {
        return id_canton;
    }

    public void setId_canton(int id_canton) {
        this.id_canton = id_canton;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getCanton() {
        return Canton;
    }

    public void setCanton(String Canton) {
        this.Canton = Canton;
    }
    
    @Override
    public String toString(){
        return getCanton();
    }
}
