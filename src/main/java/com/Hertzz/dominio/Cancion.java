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
	private String Calificacion_Cancion;
	private Integer Reproducciones;
	private Integer Anteriror_Ranking_nota;
	private Integer Anteriror_Ranking_popular;
	
	public Cancion(){
	
	}
	
	
}
