/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author andre
 */
public class Ctrl_Categoria {

    // Método para obtener todas las categorías desde la base de datos
    public List<Categoria> obtenerCategorias() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        try (Connection cn = Conexion.conectar()) {

            PreparedStatement consulta = cn.prepareStatement("SELECT id_categoria, nombre_categoria FROM categorias");
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");
                Categoria categoria = new Categoria(idCategoria, nombreCategoria);
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las categorías: " + e.getMessage());
        }

        return categorias;
    }
}
