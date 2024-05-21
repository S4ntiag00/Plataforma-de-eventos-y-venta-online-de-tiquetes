/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andre
 */
public class Reserva {

    private int reservaId;
    private int cantidadTiquetes;
    private String estadoReserva;
    private String fechaReserva;
    private String horaReserva;
    private int eventoId;
    private int usuarioId;
    private int localidadId;

    public Reserva() {
    }

    public Reserva(int reservaId, int cantidadTiquetes, String estadoReserva, String fechaReserva, String horaReserva, int eventoId, int usuarioId, int localidadId) {
        this.reservaId = reservaId;
        this.cantidadTiquetes = cantidadTiquetes;
        this.estadoReserva = estadoReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.eventoId = eventoId;
        this.usuarioId = usuarioId;
        this.localidadId = localidadId;
    }

    public int getReservaId() {
        return reservaId;
    }

    public void setReservaId(int reservaId) {
        this.reservaId = reservaId;
    }

    public int getCantidadTiquetes() {
        return cantidadTiquetes;
    }

    public void setCantidadTiquetes(int cantidadTiquetes) {
        this.cantidadTiquetes = cantidadTiquetes;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getLocalidadId() {
        return localidadId;
    }

    public void setLocalidadId(int localidadId) {
        this.localidadId = localidadId;
    }
    
}
