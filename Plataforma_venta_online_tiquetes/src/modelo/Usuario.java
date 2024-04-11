package modelo;

/**
 *
 * @author ediso
 */
public class Usuario {

    //Atributos
    private int idUsuario;
    private int idcargo;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario, int idcargo, String password) {
        this.idUsuario = idUsuario;
        this.idcargo = idcargo;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   

 

}
