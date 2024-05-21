package modelo;
/**
 *
 * @author ediso
 */
public class Artista {
    
    private int idArtista;
    private String nombreArtista;
    private String especialidad;

    public Artista() {
    }

    public Artista(int idArtista, String nombreArtista, String especialidad) {
        this.idArtista = idArtista;
        this.nombreArtista = nombreArtista;
        this.especialidad = especialidad;
    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
   
}