package Clases;

/**
 * @author Usuario
 */
public class Provincia {
    private int id_provincia;
    private String Nombre;
    //Tenias que llamar a los 2 atributos no solo al ID
    public Provincia(int id_provincia, String Nombre) {
        this.id_provincia = id_provincia;
        this.Nombre = Nombre;
    }

    public int getId_provincia() {
        return id_provincia;
    }

    public void setId_provincia(int id_provincia) {
        this.id_provincia = id_provincia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString(){
        return getNombre();
    }
}
