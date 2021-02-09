package com.example.situacaoAluno.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.situacaoAluno.model.AlunoModel;


public interface AlunoRepository extends Repository<AlunoModel, Integer>{
	
	void save(AlunoModel aluno);
	
	List<AlunoModel> findAll();
	
	AlunoModel findByCodigoAluno(Integer codigo);
	
	void delete(AlunoModel colaborador);
	

}