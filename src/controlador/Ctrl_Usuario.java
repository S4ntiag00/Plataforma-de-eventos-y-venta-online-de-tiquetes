package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class Ctrl_Usuario {

    private static Usuario usuarioActivo = null;

    // Método para guardar un nuevo usuario
    public boolean guardarUsuario(Usuario usuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Usuarios (nombre, apellido, correo_electronico, contrasena, telefono,genero, documento_identificacion, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, usuario.getNombre());
            consulta.setString(2, usuario.getApellido());
            consulta.setString(3, usuario.getCorreoElectronico());
            consulta.setString(4, usuario.getContrasena());
            consulta.setString(5, usuario.getTelefono());
            consulta.setString(6, usuario.getGenero());
            consulta.setString(7, usuario.getDocumentoIdentificacion());
            consulta.setDate(8, (Date) usuario.getFechaNacimiento());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Usuario guardado correctamente: " + usuario.getNombre());
            } else {
                System.out.println("No se pudo insertar el usuario: " + usuario.getNombre());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }

        return respuesta;
    }

    public Usuario ingresoUsuario(String email, String password) {
        Connection cn = Conexion.conectar();
        Usuario usuario = null;

        try {
            String query = "SELECT * FROM Usuarios WHERE correo_electronico = ? AND contrasena = ?";
            PreparedStatement consulta = cn.prepareStatement(query);
            consulta.setString(1, email);
            consulta.setString(2, password);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String documentoIdentificacion = rs.getString("documento_identificacion");
                String genero = rs.getString("genero");
                String telefono = rs.getString("telefono");
                Date fechaNacimiento = rs.getDate("fecha_nacimiento");

                usuario = new Usuario(idUsuario, email, password, nombre, apellido, documentoIdentificacion, genero, telefono, fechaNacimiento);
                usuarioActivo = usuario;
            }
        } catch (SQLException e) {
            System.out.println("Error al validar usuario: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }

        return usuario;
    }

    // Método para obtener el usuario actual logueado
    public static Usuario obtenerUsuarioActivo() {
        return usuarioActivo;
    }

    // Método para cerrar sesión
    public static void cerrarSeccion() {
        usuarioActivo = null;
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
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setApellido(rs.getString("apellido"));
                usuario.setCorreoElectronico(rs.getString("correo_electronico"));
                usuario.setContrasena(rs.getString("contraseña"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setDocumentoIdentificacion(rs.getString("documento_identificacion"));
                usuario.setFechaNacimiento(rs.getDate("fecha_nacimiento"));

                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener usuarios: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }

        return usuarios;
    }

}
