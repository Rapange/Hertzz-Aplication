package com.Hertzz.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cancion {
	@Id
	@SequenceGenerator(name = "Cancion_ID_GENERATOR", sequenceName = "CAncion_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Cancion_ID_GENERATOR")
	private Integer id;
	private Integer Artista_id;
	private Integer Album_id;
	private String Nombre_Autor;
	private String Nombre_Cancion;
	private String Fecha_Publicacion;
	private String Letra_cancion;
	private Integer Calificacion_Cancion;
	private Integer Reproducciones;
	private Integer Anteriror_Ranking_nota;
	private Integer Anteriror_Ranking_popular;
	
	public Cancion(){
	
	}

	public Cancion(Integer artista_id, Integer album_id, String Nombre_autor, String Nombre_cancion, String Letra_cancion){
		this.Artista_id = artista_id;
		this.Album_id = album_id;
		this.Nombre_Autor = Nombre_autor;
		this.Nombre_Cancion = Nombre_cancion;
		this.Letra_cancion = Letra_cancion;
	}
	public Integer getCalificacion_Cancion() {
		return Calificacion_Cancion;
	}

	public void setCalificacion_Cancion(Integer calificacion_Cancion) {
		Calificacion_Cancion = calificacion_Cancion;
	}

	public Integer getArtista_id() {
		return Artista_id;
	}

	public void setArtista_id(Integer artista_id) {
		Artista_id = artista_id;
	}

	public Integer getAlbum_id() {
		return Album_id;
	}

	public void setAlbum_id(Integer album_id) {
		Album_id = album_id;
	}

	public String getNombre_Autor() {
		return Nombre_Autor;
	}

	public void setNombre_Autor(String nombre_Autor) {
		Nombre_Autor = nombre_Autor;
	}

	public String getNombre_Cancion() {
		return Nombre_Cancion;
	}

	public void setNombre_Cancion(String nombre_Cancion) {
		Nombre_Cancion = nombre_Cancion;
	}

	public String getLetra_cancion() {
		return Letra_cancion;
	}

	public void setLetra_cancion(String letra_cancion) {
		Letra_cancion = letra_cancion;
	}

	public Integer getReproducciones() {
		return Reproducciones;
	}

	public void setReproducciones(Integer reproducciones) {
		Reproducciones = reproducciones;
	}

	public Integer getAnteriror_Ranking_nota() {
		return Anteriror_Ranking_nota;
	}

	public void setAnteriror_Ranking_nota(Integer anteriror_Ranking_nota) {
		Anteriror_Ranking_nota = anteriror_Ranking_nota;
	}

	public Integer getAnteriror_Ranking_popular() {
		return Anteriror_Ranking_popular;
	}

	public void setAnteriror_Ranking_popular(Integer anteriror_Ranking_popular) {
		Anteriror_Ranking_popular = anteriror_Ranking_popular;
	}
	
	
}
