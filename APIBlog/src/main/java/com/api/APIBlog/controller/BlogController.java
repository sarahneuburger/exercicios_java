package com.api.APIBlog.controller;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.APIBlog.model.BlogModel;
import com.api.APIBlog.repository.BlogRepository;
import com.api.APIBlog.model.RespostaModel;

@RestController
@RequestMapping("/api")
public class BlogController {

	// Criando blog respository
	@Autowired
	private BlogRepository blogRepository;

	// método para consultar todos
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public @ResponseBody List<BlogModel> consultarNoticias() {
		return this.blogRepository.findAll();
	}

	// método para consultar por código
	@RequestMapping(value = "/blog/{codigo}", method = RequestMethod.GET)
	public @ResponseBody BlogModel buscarPorCodigo(@PathVariable("codigo") Integer codigo) {
		return this.blogRepository.findByCodigoBlog(codigo);
	}

	// método para salvar e inserir
	@RequestMapping(value = "/blog", method = RequestMethod.POST)
	public @ResponseBody RespostaModel salvar(@RequestBody BlogModel blog) {
		try {
			// Não impacta no código, não está sendo utilizado, apenas testando os formatos de data
//			SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
//			formatarData.format(blog.getDataBlog());
			this.blogRepository.save(blog);
			return new RespostaModel("Registro salvo com sucesso");

		} catch (Exception e) {
			return new RespostaModel("Falha ao gravar registro " + e.getMessage());

		}
	}

	// método para alterar
	@RequestMapping(value = "/blog/{codigo}", method = RequestMethod.PUT)
	public @ResponseBody RespostaModel alterar(@PathVariable("codigo") Integer codigo, @RequestBody BlogModel blog) {
		BlogModel blogModel = blogRepository.findByCodigoBlog(codigo);
		try {
			blogModel.setNomeAutor(blog.getNomeAutor());
			blogModel.setTituloBlog(blog.getTituloBlog());
			blogModel.setDataBlog(blog.getDataBlog());
			blogModel.setConteudoBlog(blog.getConteudoBlog());

			this.blogRepository.save(blog);
			return new RespostaModel("Registro alterado com sucesso");

		} catch (Exception e) {
			return new RespostaModel("Falha ao alterar registro " + e.getMessage());

		}
	}

	// método para deletar dados
	@RequestMapping(value = "/blog/{codigo}", method = RequestMethod.DELETE)
	public @ResponseBody RespostaModel deletar(@PathVariable("codigo") Integer codigo) {
		BlogModel blogModel = blogRepository.findByCodigoBlog(codigo);
		try {
			this.blogRepository.delete(blogModel);
			return new RespostaModel("Registro deletado com sucesso");

		} catch (Exception e) {
			return new RespostaModel("Falha ao deletar registro " + e.getMessage());

		}
	}

}
