package com.api.APIBlog.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.api.APIBlog.model.BlogModel;

public interface BlogRepository extends Repository<BlogModel, Integer>{
	
	void save(BlogModel aluno);
	
	List<BlogModel> findAll();
	
	BlogModel findByCodigoBlog(Integer codigo);
	
	void delete(BlogModel colaborador);

}
