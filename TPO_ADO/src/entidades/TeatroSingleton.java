package TPO_ADO.src.entidades;

import java.util.ArrayList;

import java.util.List;

public final class TeatroSingleton {
	private final String nombre;
	private final String direccion;
	//private final List<Obra> obras = new ArrayList<>();
	private static TeatroSingleton instanciaUnica;
	

	private TeatroSingleton() {
		this.nombre = "nombre del teatro";
		this.direccion = "Calle Falsa 123";
		//this.obras = obras;
	}
	
	public static TeatroSingleton getInstance(){
		if (instanciaUnica == null)
			instanciaUnica = new TeatroSingleton();
		return instanciaUnica;
	}
	

}