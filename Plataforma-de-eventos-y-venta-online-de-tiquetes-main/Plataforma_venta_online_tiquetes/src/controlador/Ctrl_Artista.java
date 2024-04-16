package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Artista;

public class Ctrl_Artista {

    // Método para guardar un nuevo artista
    public boolean guardarArtista(Artista artista) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Artistas (Nombre_Artista, Especialidad) VALUES (?, ?)");
            consulta.setString(1, artista.getNombreArtista());
            consulta.setString(2, artista.getEspecialidad());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Artista guardado correctamente: " + artista.getNombreArtista());
            } else {
                System.out.println("No se pudo insertar el artista: " + artista.getNombreArtista());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar artista: " + e.getMessage());
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

    // Método para obtener todos los artistas
    public List<Artista> obtenerArtistas() {
        List<Artista> artistas = new ArrayList<>();
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Artistas");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Artista artista = new Artista();
                artista.setIdArtista(rs.getInt("ID_Artista"));
                artista.setNombreArtista(rs.getString("Nombre_Artista"));
                artista.setEspecialidad(rs.getString("Especialidad"));

                artistas.add(artista);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener artistas: " + e.getMessage());
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

        return artistas;
    }

    // Método para eliminar un artista por su ID
    public boolean eliminarArtista(int idArtista) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Artistas WHERE ID_Artista = ?");
            consulta.setInt(1, idArtista);

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Artista eliminado correctamente: " + idArtista);
            } else {
                System.out.println("No se pudo eliminar el artista: " + idArtista);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar artista: " + e.getMessage());
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

    // Método para actualizar un artista
    public boolean actualizarArtista(Artista artista) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE Artistas SET Nombre_Artista = ?, Especialidad = ? WHERE ID_Artista = ?");
            consulta.setString(1, artista.getNombreArtista());
            consulta.setString(2, artista.getEspecialidad());
            consulta.setInt(3, artista.getIdArtista());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Artista actualizado correctamente: " + artista.getNombreArtista());
            } else {
                System.out.println("No se pudo actualizar el artista: " + artista.getNombreArtista());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar artista: " + e.getMessage());
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
