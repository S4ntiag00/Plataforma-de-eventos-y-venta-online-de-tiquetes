package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class Ctrl_Usuario {

    // Método para guardar un nuevo usuario
    public boolean guardarUsuario(Usuario usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Usuarios (Nombre, Apellido, Email, Contraseña, Teléfono, Tipo_Usuario) VALUES (?, ?, ?, ?, ?, ?)");
            consulta.setString(1, usuario.getNombre());
            consulta.setString(2, usuario.getApellido());
            consulta.setString(3, usuario.getEmail());
            consulta.setString(4, usuario.getContraseña());
            consulta.setString(5, usuario.getTelefono());
            consulta.setString(6, usuario.getTipoUsuario());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Usuario guardado correctamente: " + usuario.getNombre());
            } else {
                System.out.println("No se pudo insertar el usuario: " + usuario.getNombre());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
            e.printStackTrace();
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

    // Método para obtener todos los usuarios
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Usuarios");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("ID_Usuario"));
                usuario.setNombre(rs.getString("Nombre"));
                usuario.setApellido(rs.getString("Apellido"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setContraseña(rs.getString("Contraseña"));
                usuario.setTelefono(rs.getString("Teléfono"));
                usuario.setTipoUsuario(rs.getString("Tipo_Usuario"));

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuarios;
    }

    // Método para eliminar un usuario por su ID
    public boolean eliminarUsuario(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Usuarios WHERE ID_Usuario = ?");
            consulta.setInt(1, idUsuario);

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Usuario eliminado correctamente: " + idUsuario);
            } else {
                System.out.println("No se pudo eliminar el usuario: " + idUsuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            e.printStackTrace();
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

    // Método para actualizar un usuario
    public boolean actualizarUsuario(Usuario usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE Usuarios SET Nombre = ?, Apellido = ?, Email = ?, Contraseña = ?, Teléfono = ?, Tipo_Usuario = ? WHERE ID_Usuario = ?");
            consulta.setString(1, usuario.getNombre());
            consulta.setString(2, usuario.getApellido());
            consulta.setString(3, usuario.getEmail());
            consulta.setString(4, usuario.getContraseña());
            consulta.setString(5, usuario.getTelefono());
            consulta.setString(6, usuario.getTipoUsuario());
            consulta.setInt(7, usuario.getIdUsuario());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Usuario actualizado correctamente: " + usuario.getNombre());
            } else {
                System.out.println("No se pudo actualizar el usuario: " + usuario.getNombre());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e.getMessage());
            e.printStackTrace();
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
}
