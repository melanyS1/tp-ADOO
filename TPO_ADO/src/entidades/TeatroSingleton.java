package entidades;

public final class TeatroSingleton {
	private final String nombre;
	private final String direccion;
	private final List<Obra> obras = new ArrayList<>();
	private static TeatroSingleton instance;
	public String s;

	private TeatroSingleton() {
		this.nombre = "nombre del teatro";
		this.direccion = "Calle Falsa 123";
		this.obras = obras.add(new Obra());
	}
	
	public static TeatroSingleton getInstance(){
		if (instance == null)
			instance = new TeatroSingleton();
		return instance;
	}
	
	public String getSingletonData(){
		if (instance == null)
			return null;
		else
			return(s);
	}


}