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

    // Método para eliminar un evento por su ID
    public boolean eliminarEvento(int idEvento) {
        boolean respuesta = false;
        String sql = "DELETE FROM Eventos WHERE id_evento = ?";

        try (Connection cn = Conexion.conectar(); PreparedStatement consulta = cn.prepareStatement(sql)) {

            consulta.setInt(1, idEvento);
            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Evento eliminado correctamente: " + idEvento);
            } else {
                System.out.println("No se pudo eliminar el evento: " + idEvento);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar evento: " + e.getMessage());
        }
        return respuesta;
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

}
