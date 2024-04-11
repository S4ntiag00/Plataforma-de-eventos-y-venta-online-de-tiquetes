package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class Ctrl_Usuario {

    
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "SELECT usuario.id_usuario, empleado.nombre FROM usuario JOIN empleado ON usuario.id_usuario = empleado.id_usuario WHERE usuario.id_usuario = '" + objeto.getIdUsuario() + "' AND usuario.password = '" + objeto.getPassword() + "'";

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }
    
    
    //Guardar una usuario Nueva
    public boolean guardarusuario(Usuario objeto) throws SQLException {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO usuario VALUES (?,?,?)");
            consulta.setInt(1, objeto.getIdUsuario());
            consulta.setString(2, objeto.getPassword());
            consulta.setInt(3, objeto.getIdcargo());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                System.out.println("Registro guardado correctamente: " + objeto.getIdUsuario());
            } else {
                System.out.println("No se pudo insertar el registro: " + objeto.getIdUsuario());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar línea: " + e.getMessage());
            throw e; // Lanzar la excepción para manejarla en el código que llama a este método
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return respuesta;
    }

    
    
       //verificar que no existan usuarios con el mismo id :) 
    public boolean Existeidusuario(int id) throws SQLException {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        String Sql = "select id_usuario from usuario where id_usuario = '" + id + "';";
        Statement st;

        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(Sql);
            while (rs.next()) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error CONSULTAR usuarios: ");

        }

        return respuesta;
    }

    
    
    
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from usuario where idUsuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
        
        
        
    }

    public Ctrl_Usuario() {
    }
    
    
    
    //modificar idUsuario 
    public boolean modificarUsuario(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE usuario SET id_usuario=?, password=?,id_cargo=? WHERE id_usuario= ?;");
            consulta.setInt(1, objeto.getIdUsuario());
            consulta.setString(2, objeto.getPassword());
            consulta.setInt(3, objeto.getIdcargo());
            consulta.setInt(4, idUsuario);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                System.out.println("Registro actualizado correctamente: " + objeto.getIdUsuario());
            } else {
                System.out.println("No se pudo actualizar el registro: " + objeto.getIdUsuario());
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar una línea: " + e.getMessage());

        }

        return respuesta;
    }
  public boolean elimiarUsuario(int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM usuario WHERE id_usuario = ?;");
            consulta.setInt(1, idUsuario);

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                System.out.println("Registro eliminado correctamente: " + idUsuario);
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar una línea: " + e.getMessage());

        }

        return respuesta;
    }


}
