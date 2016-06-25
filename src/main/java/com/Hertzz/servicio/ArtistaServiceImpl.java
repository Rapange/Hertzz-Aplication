package com.Hertzz.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Artista;
import com.Hertzz.repositorio.AlbumRepositorio;
import com.Hertzz.repositorio.ArtistaRepositorio;

@Service
public class ArtistaServiceImpl implements ArtistaService{
	ArtistaRepositorio artistaRepositorio;
	AlbumRepositorio albumRepositorio;
	
	@Autowired
	public ArtistaServiceImpl(ArtistaRepositorio ar, AlbumRepositorio alr){
		this.artistaRepositorio = ar;
		this.albumRepositorio = alr;
	}
	
	@Override
	public boolean Agregar_Album(Integer artista_id, Album album) {
		albumRepositorio.save(album);
		Artista artista = artistaRepositorio.findOne(artista_id);
		artista.GetAlbumes().add(album);
		return true;
	}

	@Override
	public boolean Eliminar_Album(Integer artista_id, Integer album_id) {
		Album album = albumRepositorio.findOne(album_id);
		if(album == null) return false;
		Artista artista = artistaRepositorio.findOne(artista_id);
		if(artista.find_album(album) == false) return false;
		artista.GetAlbumes().add(album);
		return true;
	}

}
