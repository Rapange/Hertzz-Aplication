package com.Hertzz.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Cancion;

@Entity
public class Artista {
	@Id
	@SequenceGenerator(name = "Artista_ID_GENERATOR", sequenceName = "Artista_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Artista_ID_GENERATOR")
	public Integer Id_artista;
	public String nombre_artista;
	@ManyToMany
	@JoinTable(name = "Artista_Cancion",
		joinColumns = @JoinColumn(name = "Artista_ID", referencedColumnName = "Id_artista"),
		inverseJoinColumns = @JoinColumn(name = "Cancion_ID", referencedColumnName = "ID"))
	public List<Cancion> canciones_artista;
	@ManyToMany
	@JoinTable(name = "Artista_Album",
		joinColumns = @JoinColumn(name = "Artista_ID", referencedColumnName = "Id_artista"),
		inverseJoinColumns = @JoinColumn(name = "Album_ID", referencedColumnName = "Album_id"))
	//public List<Cancion> canciones_artista;
	public List<Album> albums_artista;


	public Artista() {
	}

	public Artista(String nombre_artista,List<Cancion> canciones_artista,List<Album> albums_artista) {
		this.nombre_artista = nombre_artista;		
		this.canciones_artista = canciones_artista;
		this.albums_artista = albums_artista;
		
	}
}

