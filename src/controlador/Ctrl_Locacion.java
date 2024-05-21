package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Locacion;

public class Ctrl_Locacion {

    // Método para guardar una nueva locación
    public boolean guardarLocacion(Locacion locacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Locaciones (Nombre_Locacion, Capacidad, direccion) VALUES (?, ?, ?)");
            consulta.setString(1, locacion.getNombreLocaciones());
            consulta.setInt(2, locacion.getCapacidadLocalidad());
            consulta.setString(3, locacion.getDireccionLocalidad());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Locación guardada correctamente: " + locacion.getNombreLocaciones());
            } else {
                System.out.println("No se pudo insertar la locación: " + locacion.getNombreLocaciones());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar locación: " + e.getMessage());
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

    // Método para obtener todas las locaciones
    public List<Locacion> obtenerLocaciones() {
        List<Locacion> locaciones = new ArrayList<>();
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Locaciones");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Locacion locacion = new Locacion();
                locacion.setIdLocaciones(rs.getInt("ID_Locacion"));
                locacion.setNombreLocaciones(rs.getString("Nombre_Locacion"));
                locacion.setCapacidadLocalidad(rs.getInt("Capacidad"));
                locacion.setDireccionLocalidad(rs.getString("direccion"));

                locaciones.add(locacion);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener locaciones: " + e.getMessage());
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

        return locaciones;
    }

    // Método para eliminar una locación por su ID
    public boolean eliminarLocacion(int idLocacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Locaciones WHERE ID_Locacion = ?");
            consulta.setInt(1, idLocacion);

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Locación eliminada correctamente: " + idLocacion);
            } else {
                System.out.println("No se pudo eliminar la locación: " + idLocacion);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar locación: " + e.getMessage());
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

    // Método para actualizar una locación
    public boolean actualizarLocacion(Locacion locacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE Locaciones SET Nombre_Locacion = ?, Capacidad = ?, direccion = ? WHERE ID_Locacion = ?");
            consulta.setString(1, locacion.getNombreLocaciones());
            consulta.setInt(2, locacion.getCapacidadLocalidad());
            consulta.setString(3, locacion.getDireccionLocalidad());
            consulta.setInt(4, locacion.getIdLocaciones());

            respuesta = consulta.executeUpdate() > 0;

            if (respuesta) {
                System.out.println("Locación actualizada correctamente: " + locacion.getNombreLocaciones());
            } else {
                System.out.println("No se pudo actualizar la locación: " + locacion.getDireccionLocalidad());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar locación: " + e.getMessage());
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

    // Método para obtener el ID de una Locacion por su nombre
    public int obtenerIdPorNombre(String nombreLocacion) {
        int idLocacion = -1;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT ID_Locacion FROM Locaciones WHERE Nombre_Locacion = ?");
            consulta.setString(1, nombreLocacion);
            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                idLocacion = rs.getInt("ID_Locacion");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener ID de Locacion por nombre: " + e.getMessage());
        } finally {
            try {
                if (cn != null && !cn.isClosed()) {
                    cn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return idLocacion;
    }

    // Método para guardar una Locacion y obtener su ID generado
    public int guardarLocacionObtenerID(Locacion locacion) {
        int idGenerado = -1;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Locaciones(Nombre_Locacion, Capacidad, direccion) VALUES (?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
            consulta.setString(1, locacion.getNombreLocaciones());
            consulta.setInt(2, locacion.getCapacidadLocalidad());
            consulta.setString(3, locacion.getDireccionLocalidad());

            int affectedRows = consulta.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("No se pudo guardar la Locacion.");
            }

            ResultSet generatedKeys = consulta.getGeneratedKeys();
            if (generatedKeys.next()) {
                idGenerado = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID generado.");
            }

        } catch (SQLException e) {
            System.out.println("Error al guardar Locacion y obtener ID: " + e.getMessage());
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
