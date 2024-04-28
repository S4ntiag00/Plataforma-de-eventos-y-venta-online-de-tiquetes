package modelo;

/**
 *
 * @author ediso
 */
public class Locacion {

    //Atributos
    private int idLocaciones;
    private String nombreLocaciones;
    private int capacidadLocalidad;
    private String direccionLocalidad;

    public Locacion() {
    }

    public Locacion(int idLocaciones, String nombreLocaciones, int capacidadLocalidad, String direccionLocalidad) {
        this.idLocaciones = idLocaciones;
        this.nombreLocaciones = nombreLocaciones;
        this.capacidadLocalidad = capacidadLocalidad;
        this.direccionLocalidad = direccionLocalidad;
    }

    public int getIdLocaciones() {
        return idLocaciones;
    }

    public void setIdLocaciones(int idLocaciones) {
        this.idLocaciones = idLocaciones;
    }

    public String getNombreLocaciones() {
        return nombreLocaciones;
    }

    public void setNombreLocaciones(String nombreLocaciones) {
        this.nombreLocaciones = nombreLocaciones;
    }

    public int getCapacidadLocalidad() {
        return capacidadLocalidad;
    }

    public void setCapacidadLocalidad(int capacidadLocalidad) {
        this.capacidadLocalidad = capacidadLocalidad;
    }

    public String getDireccionLocalidad() {
        return direccionLocalidad;
    }

    public void setDireccionLocalidad(String direccionLocalidad) {
        this.direccionLocalidad = direccionLocalidad;
    }
    

   
}
