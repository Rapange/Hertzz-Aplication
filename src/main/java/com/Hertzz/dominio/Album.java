package com.Hertzz.dominio;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.Hertzz.dominio.Cancion;

@Entity
public class Album {
	@Id
	@SequenceGenerator(name = "Album_ID_GENERATOR", sequenceName = "Album_ID_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Album_ID_GENERATOR")
	private Integer Album_id;
	private String Nombre_Album;
	@OneToMany(mappedBy = "Album_id")
	private List<Cancion> Canciones_Album;
	private String Fecha_Album;
	public Album(String nombre){
		this.Nombre_Album = nombre;
		this.Fecha_Album = new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime());
	}
	public int getAlbum_id(){
		return this.Album_id;
	}
	public String getNombre_Album(){
		return this.Nombre_Album;
	}
	public List<Cancion> getCanciones_Album(){
		return this.Canciones_Album;
	}
	public String getFecha_Album(){
		return this.Fecha_Album;
	}
}
