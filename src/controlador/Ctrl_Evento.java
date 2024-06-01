package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Evento;

public class Ctrl_Evento {

    public int guardarEvento(Evento evento) {
        int idEvento = -1;
        String sql = "INSERT INTO eventos (nombre_evento, descripcion_evento, fecha, hora, direccion, poster, id_categoria, id_artista , id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING id_evento;";

        try (Connection cn = Conexion.conectar(); PreparedStatement pstmt = cn.prepareStatement(sql)) {

            pstmt.setString(1, evento.getNombreEvento());
            pstmt.setString(2, evento.getDescripcionEvento());
            pstmt.setString(3, evento.getFecha());
            pstmt.setString(4, evento.getHora());
            pstmt.setString(5, evento.getDireccion());
            pstmt.setBytes(6, evento.getPoster());
            pstmt.setInt(7, evento.getIdCategoria());
            pstmt.setInt(8, evento.getIdArtista());
            pstmt.setInt(9, evento.getIdUsuario());

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                idEvento = rs.getInt("id_evento");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idEvento;
    }

    // Método para obtener todos los eventos
    public List<Evento> obtenerEventos() {
        List<Evento> eventos = new ArrayList<>();
        String sql = "SELECT * FROM Eventos";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(sql); ResultSet rs = consulta.executeQuery()) {

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setIdEvento(rs.getInt("id_evento"));
                evento.setNombreEvento(rs.getString("nombre_evento"));
                evento.setDescripcionEvento(rs.getString("descripcion_evento"));
                evento.setFecha(rs.getString("fecha"));
                evento.setHora(rs.getString("hora"));
                evento.setDireccion(rs.getString("direccion"));
                evento.setPoster(rs.getBytes("poster"));
                evento.setIdCategoria(rs.getInt("id_categoria"));
                evento.setIdArtista(rs.getInt("id_artista"));
                evento.setIdUsuario(rs.getInt("id_usuario"));

                eventos.add(evento);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener eventos: " + e.getMessage());
            e.printStackTrace();
        }
        return eventos;
    }

    // Método para actualizar un evento
    public boolean actualizarEvento(Evento evento) {
        boolean respuesta = false;
        String sql = "UPDATE Eventos SET nombre_evento = ?, descripcion_evento = ?, fecha = ?, hora = ?, direccion = ?, poster = ?, id_categoria = ?, id_artista = ? WHERE id_evento = ?";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(sql)) {

            consulta.setString(1, evento.getNombreEvento());
            consulta.setString(2, evento.getDescripcionEvento());
            consulta.setString(3, evento.getFecha());
            consulta.setString(4, evento.getHora());
            consulta.setString(5, evento.getDireccion());
            consulta.setBytes(6, evento.getPoster());
            consulta.setInt(7, evento.getIdCategoria());
            consulta.setInt(8, evento.getIdArtista());
            consulta.setInt(9, evento.getIdEvento());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Evento actualizado correctamente: " + evento.getNombreEvento());
            } else {
                System.out.println("No se pudo actualizar el evento: " + evento.getNombreEvento());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar evento: " + e.getMessage());
        }
        return respuesta;
    }

    public boolean existeEvento(String nombreEvento) {
        boolean existe = false;
        String sql = "SELECT * FROM Eventos WHERE nombre_evento = ?";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(sql)) {

            consulta.setString(1, nombreEvento);
            try (ResultSet rs = consulta.executeQuery()) {
                if (rs.next()) {
                    existe = true;
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar si existe el evento: " + e.getMessage());
        }
        return existe;
    }

    public boolean modificarEvento(Evento evento) {
        Connection cn = Conexion.conectar();
        try {
            String sql = "UPDATE eventos SET nombre_evento = ?, descripcion_evento = ?, fecha = ?, hora = ?, direccion = ?, poster = ?, id_artista = ? WHERE id_evento = ?";
            PreparedStatement consulta = cn.prepareStatement(sql);
            consulta.setString(1, evento.getNombreEvento());
            consulta.setString(2, evento.getDescripcionEvento());
            consulta.setString(3, evento.getFecha());
            consulta.setString(4, evento.getHora());
            consulta.setString(5, evento.getDireccion());
            consulta.setBytes(6, evento.getPoster());
            consulta.setInt(7, evento.getIdArtista());
            consulta.setInt(8, evento.getIdEvento());
            int rowsAffected = consulta.executeUpdate();
            cn.close();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            System.out.println("Error al modificar el evento: " + ex.getMessage());
            return false;
        }
    }

    // Método para obtener un evento por su ID
    public Evento obtenerEventoPorID(int idEvento) {
        // Objeto Evento para almacenar los datos del evento obtenido
        Evento evento = null;

        // Establecer conexión a la base de datos (asumiendo que tienes una clase de conexión)
        try (Connection connection = Conexion.conectar()) {
            // Consulta SQL para obtener el evento por su ID
            String query = "SELECT * FROM Eventos WHERE id_evento = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, idEvento);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Crear un objeto Evento y establecer sus atributos con los valores de la consulta
                        evento = new Evento();
                        evento.setIdEvento(resultSet.getInt("id_evento"));
                        evento.setNombreEvento(resultSet.getString("nombre_evento"));
                        evento.setDescripcionEvento(resultSet.getString("descripcion_evento"));
                        evento.setFecha(resultSet.getString("fecha"));
                        evento.setHora(resultSet.getString("hora"));
                        evento.setDireccion(resultSet.getString("direccion"));
                        evento.setPoster(resultSet.getBytes("poster")); // Obtenemos la imagen como un arreglo de bytes
                        evento.setIdArtista(resultSet.getInt("id_artista"));
                        evento.setIdUsuario(resultSet.getInt("id_usuario"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo adecuado de la excepción dependiendo de tu aplicación
        }

        return evento; // Retornar el objeto Evento obtenido
    }

    // Método para eliminar un evento por su ID
    public boolean eliminarEvento(int idEvento) {
        // Eliminar las localidades asociadas al evento
        Ctrl_Localidades ctrlLocalidades = new Ctrl_Localidades();
        boolean localidadesEliminadas = ctrlLocalidades.eliminarLocalidadesPorEvento(idEvento);
        if (!localidadesEliminadas) {
            // Si no se pudieron eliminar las localidades, no se puede eliminar el evento
            return false;
        }

        // Si se eliminaron las localidades, procedemos a eliminar el evento
        String sql = "DELETE FROM Eventos WHERE id_evento = ?";
        try (PreparedStatement pstmt = Conexion.conectar().prepareStatement(sql)) {
            pstmt.setInt(1, idEvento);
            int rowsAffected = pstmt.executeUpdate();
            // Verificar si se eliminó el evento correctamente (si se afectó al menos una fila)
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
