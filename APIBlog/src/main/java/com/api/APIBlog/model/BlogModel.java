package com.api.APIBlog.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blogs") 
public class BlogModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBlog")
	private Integer codigoBlog;
	
	@Column(name = "nomeAutor")
	private String nomeAutor;
	
	@Column(name = "tituloBlog")
	private String tituloBlog;
	
	@Column(name = "dataBlog")
	private Calendar dataBlog;
	
	@Column(name = "conteudoBlog")
	private String conteudoBlog;

	public Integer getCodigoBlog() {
		return codigoBlog;
	}

	public void setCodigoBlog(Integer codigoBlog) {
		this.codigoBlog = codigoBlog;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getTituloBlog() {
		return tituloBlog;
	}

	public void setTituloBlog(String tituloBlog) {
		this.tituloBlog = tituloBlog;
	}

	public Calendar getDataBlog() {
		return dataBlog;
	}

	public void setDataBlog(Calendar dataBlog) {
		this.dataBlog = dataBlog;
	}

	public String getConteudoBlog() {
		return conteudoBlog;
	}

	public void setConteudoBlog(String conteudoBlog) {
		this.conteudoBlog = conteudoBlog;
	}
	

}
