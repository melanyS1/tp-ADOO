package TPO_ADO.src.entidades;

public class Ubicacion {
	
	private int asiento;
	private int fila;
	private double costBase;
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public double getCostBase() {
		return costBase;
	}
	public void setCostBase(double costBase) {
		this.costBase = costBase;
	}
	public Ubicacion(int asiento, int fila, double costBase) {
		this.asiento = asiento;
		this.fila = fila;
		this.costBase = costBase;
	}

	public double calcularCosto(int asiento, double costoBase){
		int cantAsientos = 1;
		//calcular la cantidad de asientos
		double costototal = costoBase*cantAsientos;
		return costototal;
	}

	

}
package entidades;

public class Ubicacion {

}
