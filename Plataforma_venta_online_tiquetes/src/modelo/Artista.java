package modelo;

public class Artista {
    // Atributos de la clase Artista -> Tabla Artista en la base de datos

    int idArtista;
    String nombreArtista;
    String espeliadad;

    //contructor vacio  ->
    public Artista() {
    }
    //contructor con todos los atributos  -> de la CLase Artista
    public Artista(int idArtista, String nombreArtista, String espeliadad) {
        this.idArtista = idArtista;
        this.nombreArtista = nombreArtista;
        this.espeliadad = espeliadad;
    }
    //Getters y Setters de los atributos de la clase ->
    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getEspeliadad() {
        return espeliadad;
    }

    public void setEspeliadad(String espeliadad) {
        this.espeliadad = espeliadad;
    }
}
