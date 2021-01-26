package com.escolaalf.sistema.notas.repository;

import java.util.List;
import org.springframework.data.repository.Repository;

import com.escolaalf.sistema.notas.model.GabaritoModel;

public interface GabaritoRepository extends Repository<GabaritoModel, Integer> {
	
	void save(GabaritoModel gabarito);
	List<GabaritoModel> findAll();
	GabaritoModel findByCodigo(Integer codigo);
	

}
