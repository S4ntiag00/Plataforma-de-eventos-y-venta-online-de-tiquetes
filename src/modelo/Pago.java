/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andre
 */
public class Pago {
    
    private int idPago;
    private String metodoPago;
    private String estadoPago;
    private Float montoTotal;
    private String fechaPago;
    private String horaPago;
    private int reservaId;

    public Pago() {
    }

    public Pago(int idPago, String metodoPago, String estadoPago, Float montoTotal, String fechaPago, String horaPago, int reservaId) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
        this.montoTotal = montoTotal;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.reservaId = reservaId;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public Float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(String horaPago) {
        this.horaPago = horaPago;
    }

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }
    
    
    
}
