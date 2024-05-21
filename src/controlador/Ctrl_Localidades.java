package controlador;

import conexion.Conexion;
import modelo.Localidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ctrl_Localidades {

   public boolean guardarLocalidad(Localidad localidad) {
        String sql = "INSERT INTO localidades (id_evento, tipo_localidad, precio, espacios_disponibles) VALUES (?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar();
             PreparedStatement pstmt = cn.prepareStatement(sql)) {
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

    // Método para obtener todas las locaciones de un evento
    public List<Localidad> obtenerLocalidadesEvento(int idEvento) {
        List<Localidad> localidades = new ArrayList<>();
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("SELECT * FROM Localidades WHERE id_evento = ?");
            consulta.setInt(1, idEvento);
            ResultSet rs = consulta.executeQuery();

            while (rs.next()) {
                Localidad localidad = new Localidad();
                localidad.setIdLocalidad(rs.getInt("id_localidad"));
                localidad.setIdEvento(rs.getInt("id_evento"));
                localidad.setTipoLocalidad(rs.getString("tipo_localidad"));
                localidad.setPrecio(rs.getFloat("precio"));
                localidad.setEspaciosDisponibles(rs.getInt("espacios_disponibles"));

                localidades.add(localidad);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener localidades del evento: " + e.getMessage());
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

        return localidades;
    }
}
