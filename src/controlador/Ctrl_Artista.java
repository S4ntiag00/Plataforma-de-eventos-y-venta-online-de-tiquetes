package controlador;

import conexion.Conexion;
import modelo.Artista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ctrl_Artista {

    // Método para guardar un nuevo artista
    public boolean guardarArtista(Artista artista) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Artistas (nombre_artista, especialidad) VALUES (?, ?)");
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
                artista.setIdArtista(rs.getInt("id_artista"));
                artista.setNombreArtista(rs.getString("nombre_artista"));
                artista.setEspecialidad(rs.getString("especialidad"));

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
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Artistas WHERE id_artista = ?");
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
            PreparedStatement consulta = cn.prepareStatement("UPDATE Artistas SET nombre_artista = ?, especialidad = ? WHERE id_artista = ?");
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

    // Método para obtener el ID de un Artista por su nombre
    public int obtenerIdPorNombre(String nombreArtista) {
        int idArtista = -1;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT id_artista FROM Artistas WHERE nombre_artista = ?");
            consulta.setString(1, nombreArtista);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                idArtista = rs.getInt("id_artista");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ID de Artista por nombre: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idArtista;
    }

    // Método para guardar un Artista y obtener su ID generado
    public int guardarArtistaObtenerID(Artista artista) {
        int idGenerado = -1;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Artistas(nombre_artista, especialidad) VALUES (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            consulta.setString(1, artista.getNombreArtista());
            consulta.setString(2, artista.getEspecialidad());

            int affectedRows = consulta.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo guardar el Artista.");
            }

            ResultSet generatedKeys = consulta.getGeneratedKeys();
            if (generatedKeys.next()) {
                idGenerado = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID generado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Artista y obtener ID: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idGenerado;
    }
}
