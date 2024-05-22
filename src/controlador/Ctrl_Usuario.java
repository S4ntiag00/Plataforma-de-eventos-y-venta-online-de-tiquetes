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
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Usuarios (nombre, apellido, correo_electronico, contrasena, telefono,genero, documento_identificacion, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, usuario.getNombre());
            consulta.setString(2, usuario.getApellido());
            consulta.setString(3, usuario.getCorreoElectronico());
            consulta.setString(4, usuario.getContrasena());
            consulta.setString(5, usuario.getTelefono());
            consulta.setString(6, usuario.getGenero());
            consulta.setString(7, usuario.getDocumentoIdentificacion());
            consulta.setString(8, usuario.getFechaNacimiento());
         

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
                usuario.setFechaNacimiento(rs.getString("fecha_nacimiento"));

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

   
//    public boolean eliminarUsuario(int idUsuario) {
//        boolean respuesta = false;
//        Connection cn = Conexion.conectar();
//
//        try {
//            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Usuarios WHERE id_usuario = ?");
//            consulta.setInt(1, idUsuario);
//
//            respuesta = consulta.executeUpdate() > 0;
//
//            if (respuesta) {
//                System.out.println("Usuario eliminado correctamente: " + idUsuario);
//            } else {
//                System.out.println("No se pudo eliminar el usuario: " + idUsuario);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al eliminar usuario: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (cn != null && !cn.isClosed()) {
//                    cn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return respuesta;
//    }

//    // Método para actualizar un usuario
//    public boolean actualizarUsuario(Usuario usuario) {
//        boolean respuesta = false;
//        Connection cn = Conexion.conectar();
//
//        try {
//            PreparedStatement consulta = cn.prepareStatement("UPDATE Usuarios SET nombre = ?, apellido = ?, email = ?, contraseña = ?, telefono = ?, tarjeta_identidad = ? WHERE id_usuario = ?");
//            consulta.setString(1, usuario.getNombre());
//            consulta.setString(2, usuario.getApellido());
//            consulta.setString(3, usuario.getCorreoElectronico());
//            consulta.setString(4, usuario.getContrasena());
//            consulta.setString(5, usuario.getTelefono());
//            consulta.setString(6, usuario.getDocumentoIdentificacion());
//            consulta.setInt(7, usuario.getIdUsuario());
//
//            respuesta = consulta.executeUpdate() > 0;
//
//            if (respuesta) {
//                System.out.println("Usuario actualizado correctamente: " + usuario.getNombre());
//            } else {
//                System.out.println("No se pudo actualizar el usuario: " + usuario.getNombre());
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al actualizar usuario: " + e.getMessage());
//            e.printStackTrace();
//        } finally {
//            try {
//                if (cn != null && !cn.isClosed()) {
//                    cn.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return respuesta;
//    }

    public boolean iniciarSesion(Usuario usuario) {
        boolean inicioSesionExitoso = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Usuarios WHERE correo_electronico = ? AND contrasena = ?");
            consulta.setString(1, usuario.getNombre());
            consulta.setString(2, usuario.getContrasena());
            ResultSet rs = consulta.executeQuery();

            inicioSesionExitoso = rs.next(); // Verificar si se encontró alguna coincidencia en la base de datos
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }

        return inicioSesionExitoso;
    }

    public boolean existeUsuario(Usuario usuario) {
        boolean usuarioExistente = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Usuarios WHERE correo_electronico = ?");
            consulta.setString(1, usuario.getNombre());
            ResultSet rs = consulta.executeQuery();

            usuarioExistente = rs.next(); 
        } catch (SQLException e) {
            System.out.println("Error al verificar la existencia del usuario: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
            }
        }

        return usuarioExistente;
    }

}
