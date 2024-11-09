package entidades;

import java.util.ArrayList;
import java.util.List;

public class GrupoActores {
	private String nombre;
	private List<Actor> listActores = new ArrayList();
	
	public GrupoActores(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public List<Actor> getActores() {
    	return this.listActores;
    }
	
	public void agregarActor (Actor actor) {
		
	}
	
	public void eliminarActor (Actor actor) {
		
	}

}
