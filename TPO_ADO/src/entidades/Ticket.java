package TPO_ADO.src.entidades;

import java.util.Date;

public class Ticket {
    private int numeroTicket;
    private double totalPagado;
    private Date fechaCompra;
    private Compra compra;

    // Constructor
    public Ticket(int numeroTicket, double totalPagado, Date fechaCompra, Compra compra) {
        this.numeroTicket = numeroTicket;
        this.totalPagado = totalPagado;
        this.fechaCompra = fechaCompra;
        this.compra = compra;
    }

    // Getters y Setters
    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void imprimirTicket() {
        System.out.println("----- TICKET -----");
        System.out.println("Número de Ticket: " + numeroTicket);
        System.out.println("Fecha de Compra: " + fechaCompra);
        System.out.println("Total Pagado: $" + totalPagado);
        System.out.println("Detalles de la Compra: " + compra);
        System.out.println("------------------");
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "numeroTicket=" + numeroTicket +
                ", totalPagado=" + totalPagado +
                ", fechaCompra=" + fechaCompra +
                ", compra=" + compra +
                '}';
    }
}
