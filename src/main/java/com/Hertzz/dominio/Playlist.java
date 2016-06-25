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
	private String Nombre_playlist;

	public Playlist(String nombre, Integer usuario_id)
	{
		this.Nombre_playlist = nombre;
		this.usuario_id = usuario_id;
	}
	
	
	public Integer get_Usuario_Id(){
		return this.usuario_id;
	}
	public String get_Nombre_playlist(){
		return this.Nombre_playlist;
	}
	public List<Cancion> get_Canciones_playlist(){
		return this.Canciones_playlist;
	}
	public boolean find_Cancion(Cancion cancion){
		for(int i = 0; i < Canciones_playlist.size(); i++){
			if(Canciones_playlist.get(i) == cancion){
				return true;
			}
		}
		return false;
	}
	public void add_Cancion(Cancion cancion){
		Canciones_playlist.add(cancion);
		return;
	}
	
	public void Reproducir_aleatorio()
	{
	
	
	}

}
