package com.Hertzz.servicio;

import com.Hertzz.dominio.Album;

public interface ArtistaService {
	public boolean Agregar_Album(Integer artista_id, Album album);
	public boolean Eliminar_Album(Integer artista_id, Integer album_id);
}
