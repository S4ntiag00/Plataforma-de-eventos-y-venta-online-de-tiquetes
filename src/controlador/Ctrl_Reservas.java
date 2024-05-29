/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.*;
import conexion.Conexion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import modelo.Pago;
import modelo.Reserva;

/**
 *
 * @author andre
 */
public class Ctrl_Reservas {

    public boolean crearReserva(Reserva reserva) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean resultado = false;

        try {
            conn = (Connection) Conexion.conectar();
            String sql = "INSERT INTO Reservas (cantidad_tiquetes, estado_reserva, fecha_reserva, hora_reserva, evento_id, usuario_id, localidad_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, reserva.getCantidadTiquetes());
            pstmt.setString(2, reserva.getEstadoReserva());
            pstmt.setString(3, reserva.getFechaReserva());
            pstmt.setString(4, reserva.getHoraReserva());
            pstmt.setInt(5, reserva.getEventoId());
            pstmt.setInt(6, reserva.getUsuarioId());
            pstmt.setInt(7, reserva.getLocalidadId());

            int filasAfectadas = pstmt.executeUpdate();
            resultado = filasAfectadas > 0;

            if (resultado) {
                actualizarDisponibilidadLocalidad(reserva.getLocalidadId(), reserva.getCantidadTiquetes());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
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

        return resultado;
    }

    private void actualizarDisponibilidadLocalidad(int idLocalidad, int cantidadTiquetes) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = Conexion.conectar();
            String sql = "UPDATE Localidades SET espacios_disponibles = espacios_disponibles - ? WHERE id_localidad = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, cantidadTiquetes);
            pstmt.setInt(2, idLocalidad);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
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
    }


    // Método para hacer la reserva
    public boolean hacerReserva(int idEvento, int idUsuario, int idLocalidad, int cantidadTiquetes) {
        boolean reservaExitosa = false;

        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String fechaReserva = ahora.format(formatoFecha);
        String horaReserva = ahora.format(formatoHora);

        // Crear objeto Reserva
        Reserva reserva = new Reserva();
        reserva.setCantidadTiquetes(cantidadTiquetes);
        reserva.setEstadoReserva("Pagado"); // Cambiamos el estado a "Pagado"
        reserva.setFechaReserva(fechaReserva);
        reserva.setHoraReserva(horaReserva);
        reserva.setEventoId(idEvento);
        reserva.setUsuarioId(idUsuario);
        reserva.setLocalidadId(idLocalidad);

        // Crear la reserva
        try (Connection conn = Conexion.conectar(); PreparedStatement stmt = conn.prepareStatement("INSERT INTO Reservas (cantidad_tiquetes, estado_reserva, fecha_reserva, hora_reserva, evento_id, usuario_id, localidad_id) VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, reserva.getCantidadTiquetes());
            stmt.setString(2, reserva.getEstadoReserva());
            stmt.setString(3, reserva.getFechaReserva());
            stmt.setString(4, reserva.getHoraReserva());
            stmt.setInt(5, reserva.getEventoId());
            stmt.setInt(6, reserva.getUsuarioId());
            stmt.setInt(7, reserva.getLocalidadId());

            int filasInsertadas = stmt.executeUpdate();

            if (filasInsertadas > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idReservaGenerado = generatedKeys.getInt(1);
                        System.out.println("Reserva creada exitosamente. ID de reserva: " + idReservaGenerado);
                        reservaExitosa = true;
                    }
                }
            } else {
                System.out.println("Error al crear la reserva. No se pudo insertar la reserva en la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al crear la reserva: " + e.getMessage());
        }

        return reservaExitosa;
    }

    // Método para obtener el ID de la última reserva
    public int obtenerUltimaReservaId() {
        int idReserva = -1;

        try (Connection conn = Conexion.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT MAX(reserva_id) AS last_id FROM Reservas")) {
            if (rs.next()) {
                idReserva = rs.getInt("last_id");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener el ID de la última reserva: " + e.getMessage());
        }

        return idReserva;
    }

}
