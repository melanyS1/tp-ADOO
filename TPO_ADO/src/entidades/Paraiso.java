package entidades;

public class Platea extends Ubicacion {
    
    private int capacidadMaxima;


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