package com.escolaalf.sistema.notas.repository;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.escolaalf.sistema.notas.model.AlunoModel;

public interface AlunoRepository extends Repository<AlunoModel, Integer> {
	
	void save(AlunoModel aluno);
	List<AlunoModel> findAll();
	AlunoModel findByCodigo(Integer codigo);
	

}