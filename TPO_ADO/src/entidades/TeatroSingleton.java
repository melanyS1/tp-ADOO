package TPO_ADO.src.entidades;

import java.util.ArrayList;

import java.util.List;

public final class TeatroSingleton {
	private final String nombre;
	private final String direccion;
	private final List<Obra> obras;
	private static TeatroSingleton instanciaUnica;
	
	
	private TeatroSingleton() {
		this.nombre = "Teatro Colonial";
		System.out.println(nombre);
		this.direccion = "Calle De Los Teatros 123";
		System.out.println(direccion);
		this.obras = new ArrayList<>();
		obras.add(new Obra("","",235,"",""));
		System.out.println(obras);
	}
	
	public static TeatroSingleton getInstance(){
		if (instanciaUnica == null)
			instanciaUnica = new TeatroSingleton();
		return instanciaUnica;
	}

	
	

}