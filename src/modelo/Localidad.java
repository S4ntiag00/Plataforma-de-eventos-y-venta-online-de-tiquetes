package modelo;

/**
 *
 * @author ediso
 */
public class Localidad {

    private int idLocalidad;
    private int idEvento;
    private String tipoLocalidad;
    private Float precio;
    private int espaciosDisponibles;

    public Localidad() {
    }

    public Localidad(int idLocalidad, int idEvento, String tipoLocalidad, Float precio, int espaciosDisponibles) {
        this.idLocalidad = idLocalidad;
        this.idEvento = idEvento;
        this.tipoLocalidad = tipoLocalidad;
        this.precio = precio;
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public Localidad(int idLocalidad, String tipoLocalidad, float precio, int espaciosDisponibles) {
        this.idLocalidad = idLocalidad;
        this.tipoLocalidad = tipoLocalidad;
        this.precio = precio;
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipoLocalidad() {
        return tipoLocalidad;
    }

    public void setTipoLocalidad(String tipoLocalidad) {
        this.tipoLocalidad = tipoLocalidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }
    
    
    @Override
    public String toString() {
        return tipoLocalidad + " - $" + precio + " - Disponibles: " + espaciosDisponibles;
    }

}
