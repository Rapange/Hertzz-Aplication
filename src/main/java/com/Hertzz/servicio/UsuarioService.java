package com.Hertzz.servicio;

import com.Hertzz.dominio.Playlist;

public interface UsuarioService {
	boolean crear_playlist(String nombre, Integer usuario_id);
	boolean crear_playlist(Playlist playlist, Integer usuario_id);
	boolean agregar_cancion(Integer cancion_id, Integer playlist_id);
	boolean seguir_usuario(Integer usuario_id, Integer usuario_id2);
	boolean stop_seguir(Integer usuario_id, Integer usuario_id2);
	boolean cerrar_sesion(Integer usuario_id);
}
