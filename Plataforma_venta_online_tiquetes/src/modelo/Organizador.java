package modelo;

public class Organizador {

    // Atributos de la clase Organizador -> Tabla Organizadores en la base de datos

    int idOrganizador;
    String nombre;
    String apellido;
    String email;
    String contrasena;
    String telefono;
    String tipoUsuario;

    //Constructor de la clase Organizador  ->
    public Organizador() {
    }

    public Organizador(String nombre, String apellido, String email, String contrasena, String telefono, String tipoUsuario, int idOrganizador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
        this.idOrganizador = idOrganizador;
    }

    //Getters y Setters de los atributos de la clase Organizador  ->

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(int idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
