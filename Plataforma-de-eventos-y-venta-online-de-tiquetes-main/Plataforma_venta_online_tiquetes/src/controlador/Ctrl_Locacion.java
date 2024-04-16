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
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Locaciones (Nombre_Locacion, Capacidad, Dirección) VALUES (?, ?, ?)");
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
                locacion.setDireccionLocalidad(rs.getString("Dirección"));
                
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
            PreparedStatement consulta = cn.prepareStatement("UPDATE Locaciones SET Nombre_Locacion = ?, Capacidad = ?, Dirección = ? WHERE ID_Locacion = ?");
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
}
