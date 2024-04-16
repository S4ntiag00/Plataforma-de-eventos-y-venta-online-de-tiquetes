package modelo;

/**
 *
 * @author ediso
 */
public class Evento {

    //Atributos
    private int idEvento;
    private String nombreEvento;
    private String descripcionEvento;
    private String fecha;
    private String hora;
    private float PrecioTiquete;
    private int idLocacion;
    private int idCategoria;
    private int idArtista;
    private int idOrganizador;
    private String poster;

    public Evento() {
    }

    public Evento(int idEvento, String nombreEvento, String descripcionEvento, String fecha, String hora, float PrecioTiquete, int idLocacion, int idCategoria, int idArtista, int idOrganizador, String poster) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.descripcionEvento = descripcionEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.PrecioTiquete = PrecioTiquete;
        this.idLocacion = idLocacion;
        this.idCategoria = idCategoria;
        this.idArtista = idArtista;
        this.idOrganizador = idOrganizador;
        this.poster = poster;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
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

    public float getPrecioTiquete() {
        return PrecioTiquete;
    }

    public void setPrecioTiquete(float PrecioTiquete) {
        this.PrecioTiquete = PrecioTiquete;
    }

    public int getIdLocacion() {
        return idLocacion;
    }

    public void setIdLocacion(int idLocacion) {
        this.idLocacion = idLocacion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public int getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(int idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

        
   

}
