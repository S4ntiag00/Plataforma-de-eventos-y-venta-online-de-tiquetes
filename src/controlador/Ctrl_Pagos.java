/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import modelo.Pago;

/**
 *
 * @author andre
 */
public class Ctrl_Pagos {

    public boolean crearPago(Pago pago) {
        // Obtener la fecha y hora actual
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        String fechaPago = ahora.format(formatoFecha);
        String horaPago = ahora.format(formatoHora);

        // Establecer la fecha y hora del pago
        pago.setFechaPago(fechaPago);
        pago.setHoraPago(horaPago);

        // Lógica para insertar el pago en la base de datos
        String query = "INSERT INTO Pagos (metodo_pago, estado_pago, monto_total, fecha_pago, hora_pago, reserva_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = Conexion.conectar(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pago.getMetodoPago());
            statement.setString(2, pago.getEstadoPago());
            statement.setFloat(3, pago.getMontoTotal());
            statement.setString(4, pago.getFechaPago());
            statement.setString(5, pago.getHoraPago());
            statement.setInt(6, pago.getReservaId());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
