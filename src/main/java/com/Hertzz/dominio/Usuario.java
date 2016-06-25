package com.Hertzz.dominio;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;

@Entity
public class Usuario{
	@Id
	@SequenceGenerator(name = "Usuario_ID_GENERATOR", sequenceName = "Usuario_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Usuario_ID_GENERATOR")	

	private Integer Usuario_id;
	private String Nombre_completo;
	private String Correo_electronico;
	private String Contrasenha;
	@OneToMany(mappedBy = "playlist_id")
	private List<Playlist> Playlists;
	@ManyToMany
	@JoinTable(name = "Usuario_seguidores",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Seguidor_ID", referencedColumnName = "Usuario_id"))
	private List<Usuario> Seguidores;
	@ManyToMany
	@JoinTable(name = "Usuario_siguiendo",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Siguiendo_ID", referencedColumnName = "Usuario_id"))
	public List<Usuario> Siguiendo;
	@ManyToMany
	@JoinTable(name = "Usuario_Cancion",
		joinColumns = @JoinColumn(name = "Usuario_ID", referencedColumnName = "Usuario_id"),
		inverseJoinColumns = @JoinColumn(name = "Cancion_ID", referencedColumnName = "ID"))
	private List<Cancion>Historial;
	public Usuario(){};
	public Usuario(String Name,String Mail,String Password){
		Nombre_completo=Name;
		Correo_electronico=Mail;
		Contrasenha=Password;
	}

}