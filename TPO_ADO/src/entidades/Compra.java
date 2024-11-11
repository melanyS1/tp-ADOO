package TPO_ADO.src.entidades;

import java.util.ArrayList;

import java.util.List;

public class Compra {
    
    private Cliente cliente;
    private MedioDePago medioDePago;
    private List<Entrada> entradas = new ArrayList<>();
    private double montobase;
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public MedioDePago getMedioDePago() {
        return medioDePago;
    }
    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }
    public List<Entrada> getEntradas() {
        return entradas;
    }
    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }
    public double getMontobase() {
        return montobase;
    }
    public void setMontobase(double montobase) {
        this.montobase = montobase;
    }
    public Compra(Cliente cliente, MedioDePago medioDePago, List<Entrada> entradas, double montobase) {
        this.cliente = cliente;
        this.medioDePago = medioDePago;
        this.entradas = entradas;
        this.montobase = montobase;
    }

    public double calcularMontoFinal(){
		//
        return 0.0;
	}


}