package controlador;

import conexion.Conexion;
import modelo.Localidad;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ctrl_Localidades {

    public boolean guardarLocalidad(Localidad localidad) {
        String sql = "INSERT INTO localidades (id_evento, tipo_localidad, precio, espacios_disponibles) VALUES (?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar(); PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setInt(1, localidad.getIdEvento());
            pstmt.setString(2, localidad.getTipoLocalidad());
            pstmt.setFloat(3, localidad.getPrecio());
            pstmt.setInt(4, localidad.getEspaciosDisponibles());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Localidad> cargarLocalidades(int idEvento) {
        List<Localidad> localidades = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.conectar(); // Asegúrate de que tienes una clase de conexión
            String sql = "SELECT id_localidad, tipo_localidad, precio, espacios_disponibles FROM Localidades WHERE id_evento = ?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, idEvento);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Localidad localidad = new Localidad();
                localidad.setIdLocalidad(rs.getInt("id_localidad"));
                localidad.setTipoLocalidad(rs.getString("tipo_localidad"));
                localidad.setPrecio(rs.getFloat("precio"));
                localidad.setEspaciosDisponibles(rs.getInt("espacios_disponibles"));
                localidades.add(localidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return localidades;
    }

    public int obtenerIdLocalidadSeleccionada(String textoSeleccionado) {
        int idLocalidad = -1; // Valor por defecto si no se encuentra el ID

        // Obtener el texto del ID de la localidad desde el inicio hasta el primer espacio
        String idLocalidadTexto = textoSeleccionado.split(" ")[0];

        try {
            idLocalidad = Integer.parseInt(idLocalidadTexto);
        } catch (NumberFormatException e) {
            // Manejar el caso en el que el texto no sea un número válido
            System.err.println("Error al convertir el ID de la localidad a entero: " + e.getMessage());
        }

        return idLocalidad;
    }
    
    public float obtenerPrecioLocalidad(int idLocalidad) {
        // Lógica para obtener el precio de una localidad en la base de datos
        String query = "SELECT precio FROM Localidades WHERE id_localidad = ?";
        try (Connection connection = Conexion.conectar();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, idLocalidad);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getFloat("precio");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Si no se encuentra el precio, devuelve 0 o un valor predeterminado
    }
}
