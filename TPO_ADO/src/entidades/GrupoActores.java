package TPO_ADO.src.entidades;

import java.util.ArrayList;

import java.util.List;

public class GrupoActores {
	private String nombreGrupo;
	private List<Actor> actores = new ArrayList<>();
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo=nombreGrupo;
	}
	
	public List<Actor> getActores() {
		return actores;
	}
	
	public void setActores(List<Actor> actores) {
		this.actores=actores;
	}
	
	
	public GrupoActores (String nombreGrupo, List<Actor> actores) {
		this.nombreGrupo=nombreGrupo;
		this.actores=actores;
		
		
	}
	
	public List<Actor> agregarActor(Actor actor){
		System.out.println("...");
		List<Actor> actoresAgregados = new ArrayList<>();
		actoresAgregados.add(new Actor("Ana García", 34, "actriz principal"));
		return actoresAgregados;
	}
	
	public static void elimarActor(Actor ator) {
		
		//
	}
	

}
