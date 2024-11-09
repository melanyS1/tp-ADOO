package entidades;

public class Actor {
	private String nombre;
	private int edad;
	private String rol;
	
	public Actor(String nombre, int edad, String rol) {
		this.nombre=nombre;
		this.edad=edad;
		this.rol=rol;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol (String rol) {
		this.rol=rol;
	}
}
