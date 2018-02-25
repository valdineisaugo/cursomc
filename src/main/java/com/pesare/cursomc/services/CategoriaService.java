package com.pesare.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesare.cursomc.domain.Categoria;
import com.pesare.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {

		Categoria obj = repo.findOne(id);
		return obj;

	}

}
