package TPO_ADO.src.entidades;

import java.sql.Time;
import java.util.Date;

public class Funcion {
	private Time hora;
	private Date fecha;
	private Obra obra;
	private double precioBase;
	
	public Funcion(Time hora,Date fecha, Obra obra, double precioBase) {
		this.hora=hora;
		this.fecha=fecha;
		this.obra=obra;
		this.precioBase=precioBase;
	}
	
	public Time getHora() {
		return hora;
	}
	
	public void setHora(Time hora) {
		this.hora=hora;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	
	public Obra getObra() {
		return obra;
	}
	
	public void setObra(Obra obra) {
		this.obra=obra;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase=precioBase;
	}
	
	public double calcularPrecio(double precioBase) {
		
		return precioBase;
	}

}