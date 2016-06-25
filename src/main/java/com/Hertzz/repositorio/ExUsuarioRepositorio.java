package com.Hertzz.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.ExUsuario;

public interface ExUsuarioRepositorio extends CrudRepository<ExUsuario, Integer> {
	List<ExUsuario> findAll();
	
	//bool Restablecer_Cuenta();
}