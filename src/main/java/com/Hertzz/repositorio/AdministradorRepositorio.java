package com.Hertzz.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Administrador;
import com.Hertzz.dominio.Album;
import com.Hertzz.dominio.Artista;

public interface AdministradorRepositorio extends CrudRepository<Administrador, Integer> {
	List<Administrador> findAll();
	//boolean saveArtista(Artista artista);
	//boolean saveAlbum(Album album);
	@Query("DELETE FROM Artista c WHERE c.Id_artista = :Id")
	boolean deleteArtista(Integer Id_artista);
	//bool Agregar_Artista(Artista artita);
	//bool Agregar_Album(Album Album);
	//bool Eliminar_Artista(Artista artista);
	//bool Eliminar_Album(Album Album);
}