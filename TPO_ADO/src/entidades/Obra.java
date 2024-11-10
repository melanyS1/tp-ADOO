package entidades;

import java.util.ArrayList;
import java.util.List;

public class Obra {
	private String titulo;
	private String sinopsis;
	private int duracion;
	private String director;
	private List<GrupoActores> elencoPrincipal = new ArrayList();
	private List<Funcion> funciones = new ArrayList();
	
	public List<GrupoActores> getElencoPrincipal() {
		return elencoPrincipal;
	}

	public void setElencoPrincipal(List<GrupoActores> elencoPrincipal) {
		this.elencoPrincipal = elencoPrincipal;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}

	private String genero;
	
	public Obra (String titulo, String sinopsis, int duracion, String director, String genero) {
		this.titulo=titulo;
		this.sinopsis=sinopsis;
		this.duracion=duracion;
		this.director=director;
		this.genero=genero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public String getSinopsis() {
		return sinopsis;
	}
	
	public void setSinopsis(String sinopsis) {
		this.sinopsis=sinopsis;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion=duracion;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director=director;
	}
	
	public List<GrupoActores> getReseñas() {
    	return this.elencoPrincipal;
    }
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	
}
