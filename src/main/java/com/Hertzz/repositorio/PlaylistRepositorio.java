package com.Hertzz.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Playlist;
import com.Hertzz.dominio.Cancion;

public interface PlaylistRepositorio extends CrudRepository<Playlist, Integer> {
	List<Playlist> findAll();
	
	//void Reproducir(Cancion cancion);
	//void Reproducir_aleatorio(Playlist lista);
}