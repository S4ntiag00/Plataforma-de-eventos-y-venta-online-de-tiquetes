package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

public class Ctrl_Categoria {
    
    // Método para guardar una nueva categoría
    public boolean guardarCategoria(Categoria categoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO Categorías (Nombre_Categoria) VALUES (?)");
            consulta.setString(1, categoria.getNombreCategoria());
            
            respuesta = consulta.executeUpdate() > 0;
            
            if (respuesta) {
                System.out.println("Categoría guardada correctamente: " + categoria.getNombreCategoria());
            } else {
                System.out.println("No se pudo insertar la categoría: " + categoria.getNombreCategoria());
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar categoría: " + e.getMessage());
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
    
    // Método para obtener todas las categorías
    public List<Categoria> obtenerCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Categorías");
            ResultSet rs = consulta.executeQuery();
            
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdCategoria(rs.getInt("ID_Categoria"));
                categoria.setNombreCategoria(rs.getString("Nombre_Categoria"));
                
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener categorías: " + e.getMessage());
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
        
        return categorias;
    }
    
    // Método para eliminar una categoría por su ID
    public boolean eliminarCategoria(int idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("DELETE FROM Categorías WHERE ID_Categoria = ?");
            consulta.setInt(1, idCategoria);
            
            respuesta = consulta.executeUpdate() > 0;
            
            if (respuesta) {
                System.out.println("Categoría eliminada correctamente: " + idCategoria);
            } else {
                System.out.println("No se pudo eliminar la categoría: " + idCategoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar categoría: " + e.getMessage());
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
    
    // Método para actualizar una categoría
    public boolean actualizarCategoria(Categoria categoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE Categorías SET Nombre_Categoria = ? WHERE ID_Categoria = ?");
            consulta.setString(1, categoria.getNombreCategoria());
            consulta.setInt(2, categoria.getIdCategoria());
            
            respuesta = consulta.executeUpdate() > 0;
            
            if (respuesta) {
                System.out.println("Categoría actualizada correctamente: " + categoria.getNombreCategoria());
            } else {
                System.out.println("No se pudo actualizar la categoría: " + categoria.getNombreCategoria());
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar categoría: " + e.getMessage());
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
