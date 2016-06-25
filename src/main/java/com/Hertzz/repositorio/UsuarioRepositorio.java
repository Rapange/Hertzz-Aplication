package com.Hertzz.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;
import com.Hertzz.dominio.Usuario;

public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
	List<Usuario> findAll();
	
	//void Seguir_Usuario(Integer usuario_id);
	//void Stop_Seguir_Usuario(Integer usuario_id);
	//void Agregar_Playlist(Playlist playlist);
	//void Agregar_Cancion(Integer cancion_id, Integer playlist_id);
	//bool Crear_playlist(String nombre);
	@Query("DELETE FROM Playlist c WHERE c.playlist_id = :playlist_id")
	boolean Eliminar_playlist(Integer playlist_id);
	
	@Query("DELETE FROM Usuario c WHERE c.Usuario_id = :usuario_id")
	boolean Eliminarse(Integer usuario_id);
	//void Copiar_playlist(Playlist lista);
	//void Calificar_cancion(Integer numero);
	//void Cerrar_cuenta();
	//Cancion Buscar_Cancion(String nombre);
	
	@Query("SELECT c FROM Playlist AS c WHERE nombre_playlist = :nombre AND usuario_id = :usuario_id")
	Playlist Buscar_Playlist(String nombre, Integer usuario_id);

	@Query("SELECT c FROM Cancion AS c WHERE nombre_cancion = :nombre")
	Cancion Buscar_Cancion(String nombre);



}

