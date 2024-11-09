package entidades;

public class PagoCredito {
	private int numeroCuotas;
	
	public PagoCredito(int numeroCuotas) {
		this.numeroCuotas=numeroCuotas;
	}
	
	public int getNumeroCuotas() {
		return numeroCuotas;
	}
	
	public void setNumeroCuotas(int numeroCuotas) {
		this.numeroCuotas=numeroCuotas;
	}
	
	public double calcularMontoFinal(double montoBase) {
		
		return montoBase;
	}
	
	public double aplicarRecargoCredito(int numeroCuotas) {
		double total = 0;
		
		return total;
	}

}
