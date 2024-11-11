package TPO_ADO.src.entidades;

public class Actor {
	private String nombre;
	private int edad;
	private String role;
	
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
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role=role;
	}
	
	public Actor (String nombre, int edad, String role) {
		this.nombre=nombre;
		this.edad=edad;
		this.role=role;
		
	}
	
	
}
