package com.Hertzz.servicio;

import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Artista;

public interface AdministradorService {
	boolean agregarArtista(Artista artista);
	boolean agregarAlbum(Album album);
}
