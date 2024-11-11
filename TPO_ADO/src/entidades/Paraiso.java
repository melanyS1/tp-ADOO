package TPO_ADO.src.entidades;

public class Paraiso extends Ubicacion {
    
    private int capacidadMaxima;


    public Paraiso(int asiento, int fila, double costBase, int capacidadMaxima) {
        super(asiento, fila, costBase);
        this.capacidadMaxima = capacidadMaxima;
    }


    public double calcularCosto(int asiento, double costoBase){
		int cantAsientos = 1;
		//calcular la cantidad de asientos
		double costototal = costoBase*cantAsientos;
		return costototal;
	}


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }


    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}