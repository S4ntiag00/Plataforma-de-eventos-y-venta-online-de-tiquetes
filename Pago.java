package modelo;

public class Pago {
    
// Atributos de la clase Pago -> Tabla Pago en la base de datos
    int idPago;
    int idReserva;
    String  metodoPago;;
    String fechaPago;
    String horaPago;
    double monto;


    // Constructor de la clase Pago con todos los atributos  ->
    public Pago(String metodoPago, String fechaPago, String horaPago, double monto) {
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.monto = monto;
    }

    //Getters y Setters de los atributos de la clase Pago  ->
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Pago() {
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
