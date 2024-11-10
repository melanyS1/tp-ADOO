package entidades;

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
		
		//
		
		//return actoresAgregados;
	}
	
	public static void elimarActor(Actor ator) {
		
		//
	}
	

}
