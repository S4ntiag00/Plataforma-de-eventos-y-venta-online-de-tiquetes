package modelo;

public class Localizacion {

    // Atributos de la clase Localizacion -> Tabla Localizacion en la base de datos
    int idLocalizacion;
    String nomreLocalizacion;
    String capacidad;
    String direccion;

    //contructor vacio  ->
    public Localizacion() {
    }

    //contructor con todos los atributos  -> de la CLase Localizacion
    public Localizacion(int idLocalizacion, String nomreLocalizacion, String capacidad, String direccion) {
        this.idLocalizacion = idLocalizacion;
        this.nomreLocalizacion = nomreLocalizacion;
        this.capacidad = capacidad;
        this.direccion = direccion;
    }

    //Getters y Setters de los atributos de la clase ->
    public int getIdLocalizacion() {
        return idLocalizacion;
    }

    public String getNomreLocalizacion() {
        return nomreLocalizacion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public String getDireccion() {
        return direccion;
    }
}
