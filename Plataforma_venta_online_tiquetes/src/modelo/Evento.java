package modelo;

public class Evento {

    // Atributos de la clase Evento -> Tabla Evento en la base de datos
    int idEvento;
    int idCategoriia;
    int idLocalizacion;
    int idArtista;
    int  organizador;
    String nombreEvento;
    String descripcionEvento;
    String fecha;
    String hora;
    double precio_tiquete;

    //contructor vacio  ->
    public Evento() {
    }
    //contructor con todos los atributos  -> de la CLase Evento
    public Evento(int idEvento, int idCategoriia, int idLocalizacion, int idArtista, String nombreEvento, int organizador, String descripcionEvento, String fecha, String hora, double precio_tiquete) {
        this.idEvento = idEvento;
        this.idCategoriia = idCategoriia;
        this.idLocalizacion = idLocalizacion;
        this.idArtista = idArtista;
        this.nombreEvento = nombreEvento;
        this.organizador = organizador;
        this.descripcionEvento = descripcionEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.precio_tiquete = precio_tiquete;
    }
    //Getters y Setters de los atributos de la clase ->

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getIdCategoriia() {
        return idCategoriia;
    }

    public void setIdCategoriia(int idCategoriia) {
        this.idCategoriia = idCategoriia;
    }

    public int getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public int getOrganizador() {
        return organizador;
    }

    public void setOrganizador(int organizador) {
        this.organizador = organizador;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getPrecio_tiquete() {
        return precio_tiquete;
    }

    public void setPrecio_tiquete(double precio_tiquete) {
        this.precio_tiquete = precio_tiquete;
    }
}
