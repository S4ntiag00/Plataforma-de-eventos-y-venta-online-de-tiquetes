package modelo;
/**
 *
 * @author ediso
 */
public class Evento {
    private int idEvento;
    private String nombreEvento;
    private String descripcionEvento;
    private String fecha;
    private String hora;
    private String direccion;
    private byte[] poster;
    private int idCategoria;
    private int idArtista;

    public Evento() {
    }

    public Evento(int idEvento, String nombreEvento, String descripcionEvento, String fecha, String hora, String direccion, byte[] poster, int idCategoria, int idArtista) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.descripcionEvento = descripcionEvento;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.poster = poster;
        this.idCategoria = idCategoria;
        this.idArtista = idArtista;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte[] getPoster() {
        return poster;
    }

    public void setPoster(byte[] poster) {
        this.poster = poster;
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
    
    
}
