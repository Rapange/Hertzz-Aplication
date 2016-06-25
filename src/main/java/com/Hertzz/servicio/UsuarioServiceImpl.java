package com.Hertzz.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Hertzz.dominio.Cancion;
import com.Hertzz.dominio.Playlist;
import com.Hertzz.dominio.Usuario;
import com.Hertzz.repositorio.CancionRepositorio;
import com.Hertzz.repositorio.PlaylistRepositorio;
import com.Hertzz.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	UsuarioRepositorio usuarioRepositorio;
	PlaylistRepositorio playlistRepositorio;
	CancionRepositorio cancionRepositorio;
	@Override
	public boolean crear_playlist(String nombre, Integer usuario_id) {
		Playlist playlist = usuarioRepositorio.Buscar_Playlist(nombre, usuario_id);
		//Usuario usuario = usuarioRepositorio.findOne(usuario_id);
		if(playlist != null) return false;
		playlist = new Playlist(nombre, usuario_id);
		playlistRepositorio.save(playlist);
		return true;
	}

	@Override
	public boolean crear_playlist(Playlist playlist, Integer usuario_id) {
		if(playlist.get_Usuario_Id() == usuario_id) return false;
		Playlist new_playlist = new Playlist(playlist.get_Nombre_playlist(), usuario_id);
		playlistRepositorio.save(new_playlist);
		return true;
	}

	@Override
	public boolean agregar_cancion(Integer cancion_id, Integer playlist_id) {
		Playlist playlist = playlistRepositorio.findOne(playlist_id);
		Cancion Cancion = cancionRepositorio.findOne(cancion_id);
		if(playlist.find_Cancion(Cancion))		return false;
		playlist.add_Cancion(Cancion);
		return true;
	}

	@Override
	public boolean seguir_usuario(Integer usuario_id,Integer usuario_id2) {
		Usuario principal = usuarioRepositorio.findOne(usuario_id);
		Usuario a_seguir = usuarioRepositorio.findOne(usuario_id2);
		if(principal.buscar(principal.get_siguiendo(), a_seguir) != null) return false;
		principal.add_siguiendo(a_seguir);
		return true;
	}

	@Override
	public boolean stop_seguir(Integer usuario_id, Integer usuario_id2) {
		Usuario principal = usuarioRepositorio.findOne(usuario_id);
		Usuario a_no_seguir = usuarioRepositorio.findOne(usuario_id2);
		if(principal.buscar(principal.get_siguiendo(), a_no_seguir)== null) return false;
		principal.delete_siguiendo(a_no_seguir);
		return true;
	}

}
