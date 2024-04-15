package modelo;

public class Reserva {
    //A tributos de la clase Reserva -> Tabla Reserva en la base de datos
    int idReserva;
    int cantidadTiquetes;
    int idEvento;
    int usuarioId;
    String estadoReserva;
    String fechaReserva;
    String horaReserva;

   //contructor vacio  ->
    public Reserva() {
    }

    //contructor con todos los atributos  -> de la CLase Reserva
    public Reserva(int idReserva, int cantidadTiquetes, int idEvento, int usuarioId, String estadoReserva, String fechaReserva, String horaReserva) {
        this.idReserva = idReserva;
        this.cantidadTiquetes = cantidadTiquetes;
        this.idEvento = idEvento;
        this.usuarioId = usuarioId;
        this.estadoReserva = estadoReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }
    //Getters y Setters de los atributos de la clase ->
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getCantidadTiquetes() {
        return cantidadTiquetes;
    }

    public void setCantidadTiquetes(int cantidadTiquetes) {
        this.cantidadTiquetes = cantidadTiquetes;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
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
}
