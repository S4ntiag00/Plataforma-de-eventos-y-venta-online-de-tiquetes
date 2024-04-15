package controlador;

import conexion.Conexion;
import java.sql.*;
import modelo.Cliente;


public class Ctrl_Cliente {

    
    public boolean guardarCliente(Cliente objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO cliente VALUES (?, ?, ?, ?, ?, ?, ?);");
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDireccion());
            consulta.setString(5, objeto.getDocumento());
            consulta.setString(6, objeto.getCorreo());
            consulta.setString(7, objeto.getTelefono());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar cliente: " + e);
        }
        return respuesta;
    }

   
    public boolean existeCliente(String documento) {
        boolean respuesta = false;
        String sql = "select documento from cliente where documento = '" + documento + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e);
        }
        return respuesta;
    }

   
    public boolean actualizar(Cliente objeto, int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("UPDATE cliente SET id_cliente=?, nombre=?, apellido=?, direccion=?, documento=?, correo=?, telefono=? where id_cliente ='" + idCliente + "'");
            consulta.setInt(1, objeto.getIdCliente());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4, objeto.getDireccion());
            consulta.setString(5, objeto.getDocumento());
            consulta.setString(6, objeto.getCorreo());
            consulta.setString(7, objeto.getTelefono());
            
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: " + e);
        }
        return respuesta;
    }

  
    public boolean eliminar(int idCliente) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "DELETE FROM cliente WHERE id_cliente ='" + idCliente + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e);
        }
        return respuesta;
    }

}
