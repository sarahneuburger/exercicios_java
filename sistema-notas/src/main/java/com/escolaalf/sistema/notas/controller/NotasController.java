package com.escolaalf.sistema.notas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolaalf.sistema.notas.repository.AlunoRepository;
import com.escolaalf.sistema.notas.repository.GabaritoRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping

public class NotasController {
	
	private int mediaAluno;
	
	public 
	
	@Autowired
	private GabaritoRepository gabaritoRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	
	
	//@RequestMapping()

}
