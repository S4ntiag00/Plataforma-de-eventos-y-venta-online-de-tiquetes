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

    // Método para guardar un nuevo evento
    public boolean guardarEvento(Evento evento) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Eventos (Nombre_Evento, Descripción_Evento, Fecha, Hora, Poster, Precio_Tiquete, ID_Categoria, ID_Locacion, ID_Artista, ID_Organizador) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, evento.getNombreEvento());
            consulta.setString(2, evento.getDescripcionEvento());
            consulta.setString(3, evento.getFecha());
            consulta.setString(4, evento.getHora());
            consulta.setBytes(5, evento.getPoster());
            consulta.setFloat(6, evento.getPrecioTiquete()); 
            consulta.setInt(7, evento.getIdCategoria());
            consulta.setInt(8, evento.getIdLocacion());
            consulta.setInt(9, evento.getIdArtista());
            consulta.setInt(10, evento.getIdOrganizador());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Evento guardado correctamente: " + evento.getNombreEvento());
            } else {
                System.out.println("No se pudo insertar el evento: " + evento.getNombreEvento());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar evento: " + e.getMessage());
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

    // Método para obtener todos los eventos
    public List<Evento> obtenerEventos() {
        List<Evento> eventos = new ArrayList<>();
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Eventos");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Evento evento = new Evento();
                evento.setIdEvento(rs.getInt("ID_Evento"));
                evento.setNombreEvento(rs.getString("Nombre_Evento"));
                evento.setDescripcionEvento(rs.getString("Descripción_Evento"));
                evento.setFecha(rs.getString("Fecha"));
                evento.setHora(rs.getString("Hora"));
                evento.setPrecioTiquete(rs.getFloat("Precio_Tiquete"));
                evento.setIdCategoria(rs.getInt("ID_Categoria"));
                evento.setIdLocacion(rs.getInt("ID_Locacion"));
                evento.setIdArtista(rs.getInt("ID_Artista"));
                evento.setIdOrganizador(rs.getInt("ID_Organizador"));

                eventos.add(evento);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener eventos: " + e.getMessage());
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

        return eventos;
    }

    // Método para eliminar un evento por su ID
    public boolean eliminarEvento(int idEvento) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Eventos WHERE ID_Evento = ?");
            consulta.setInt(1, idEvento);

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Evento eliminado correctamente: " + idEvento);
            } else {
                System.out.println("No se pudo eliminar el evento: " + idEvento);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar evento: " + e.getMessage());
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

    // Método para actualizar un evento
    public boolean actualizarEvento(Evento evento) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE Eventos SET Nombre_Evento = ?, Descripción_Evento = ?, Fecha = ?, Hora = ?, Precio_Tiquete = ?, ID_Categoria = ?, ID_Locacion = ?, ID_Artista = ?, ID_Organizador = ? WHERE ID_Evento = ?");
            consulta.setString(1, evento.getNombreEvento());
            consulta.setString(2, evento.getDescripcionEvento());
            consulta.setString(3, evento.getFecha());
            consulta.setString(4, evento.getHora());
            consulta.setFloat(5, evento.getPrecioTiquete());
            consulta.setInt(6, evento.getIdCategoria());
            consulta.setInt(7, evento.getIdLocacion());
            consulta.setInt(8, evento.getIdArtista());
            consulta.setInt(9, evento.getIdOrganizador());
            consulta.setInt(10, evento.getIdEvento());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Evento actualizado correctamente: " + evento.getNombreEvento());
            } else {
                System.out.println("No se pudo actualizar el evento: " + evento.getNombreEvento());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar evento: " + e.getMessage());
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

    public boolean existeEvento(String nombreEvento) {
        boolean existe = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Eventos WHERE Nombre_Evento = ?");
            consulta.setString(1, nombreEvento);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                // Si el ResultSet tiene al menos una fila, el evento existe
                existe = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar si existe el evento: " + e.getMessage());
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

        return existe;
    }
}
