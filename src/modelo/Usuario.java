package modelo;
/**
 *
 * @author ediso
 */

public class Usuario {
private int idUsuario;
    private String correoElectronico;
    private String contrasena;
    private String nombre;
    private String apellido;
    private String documentoIdentificacion;
    private String genero;
    private String telefono;
    private String fechaNacimiento;

    public Usuario(int idUsuario, String correoElectronico, String contrasena, String nombre, String apellido, String documentoIdentificacion, String genero, String telefono, String fechaNacimiento) {
        this.idUsuario = idUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentificacion = documentoIdentificacion;
        this.genero = genero;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
}
