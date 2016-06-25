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
	private Integer Id_artista;
	private String nombre_artista;
	@ManyToMany
	@JoinTable(name = "Artista_Cancion",
		joinColumns = @JoinColumn(name = "Artista_ID", referencedColumnName = "Id_artista"),
		inverseJoinColumns = @JoinColumn(name = "Cancion_ID", referencedColumnName = "ID"))
	private List<Cancion> canciones_artista;
	@ManyToMany
	@JoinTable(name = "Artista_Album",
		joinColumns = @JoinColumn(name = "Artista_ID", referencedColumnName = "Id_artista"),
		inverseJoinColumns = @JoinColumn(name = "Album_ID", referencedColumnName = "Album_id"))
	//public List<Cancion> canciones_artista;
	private List<Album> albumes_artista;


	public Artista() {
	}

	public Artista(String nombre_artista,List<Cancion> canciones_artista,List<Album> albums_artista) {
		this.nombre_artista = nombre_artista;		
		this.canciones_artista = canciones_artista;
		this.albumes_artista = albums_artista;
	}
	
	public boolean find_album(Album album){
		for(Album i : albumes_artista){
			if(i == album) return true;
		}
		return false;
	}
	
	public List<Cancion> GetCanciones(){
		return this.canciones_artista;
	}
	public List<Album> GetAlbumes(){
		return this.albumes_artista;
	}
}


