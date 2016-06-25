package com.Hertzz.repositorio;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.Hertzz.dominio.Cancion;

public interface CancionRepositorio extends CrudRepository<Cancion, Integer> {
	List<Cancion> findAll();
	
	
}
