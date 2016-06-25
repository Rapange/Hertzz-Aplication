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

import com.Hertzz.dominio.Cancion;


@Entity
public class Playlist{
	@Id
	@SequenceGenerator(name = "Playlist_ID_GENERATOR", sequenceName = "Playlist_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Playlist_ID_GENERATOR")	
	private Integer playlist_id;
	private Integer usuario_id;

	@ManyToMany
	@JoinTable(name = "Playlist_Cancion",
		joinColumns = @JoinColumn(name = "playlist_ID", referencedColumnName = "playlist_id"),
		inverseJoinColumns = @JoinColumn(name = "Cancion_ID", referencedColumnName = "ID"))
	public List<Cancion> Canciones_playlist;

	
	public String Nombre_playlist;

	public Playlist()
	{
	}
	
	
	
	
	
	public void Reproducir_aleatorio()
	{
	
	
	}

}
