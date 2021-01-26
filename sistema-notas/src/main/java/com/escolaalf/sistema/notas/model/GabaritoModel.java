package com.escolaalf.sistema.notas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "gabatiros")
@Entity
public class GabaritoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idGabarito")
	private Integer idGabarito;

	@Column(name = "descricaoGabarito")
	private String descricaoGabarito;

	@Column(name = "pesoQuestaoUm")
	private Integer pesoQuestaoUm = 0;

	@Column(name = "pesoQuestaoDois")
	private Integer pesoQuestaoDois = 0;

	@Column(name = "pesoQuestaoTrês")
	private Integer pesoQuestaoTrês = 0;

	@Column(name = "pesoQuestaoQuatro")
	private Integer pesoQuestaoQuatro = 0;

	@Column(name = "pesoQuestaoCinco")
	private Integer pesoQuestaoCinco = 0;

	@Column(name = "pesoQuestaoSeis")
	private Integer pesoQuestaoSeis = 0;

	@Column(name = "pesoQuestaoSete")
	private Integer pesoQuestaoSete = 0;

	@Column(name = "pesoQuestaoOito")
	private Integer pesoQuestaoOito = 0;

	@Column(name = "pesoQuestaoNove")
	private Integer pesoQuestaoNove = 0;

	@Column(name = "pesoQuestaoDez")
	private Integer pesoQuestaoDez = 0;

	@Column(name = "gabaritoQuestaoUm")
	private String gabaritoQuestaoUm = null;

	@Column(name = "gabaritoQuestaoDois")
	private String gabaritoQuestaoDois = null;

	@Column(name = "gabaritoQuestaoTres")
	private String gabaritoQuestaoTres = null;

	@Column(name = "gabaritoQuestaoQuatro")
	private String gabaritoQuestaoQuatro = null;

	@Column(name = "gabaritoQuestaoCinco")
	private String gabaritoQuestaoCinco = null;

	@Column(name = "gabaritoQuestaoSeis")
	private String respQuestaoSeis = null;

	@Column(name = "gabaritoQuestaoSete")
	private String gabaritoQuestaoSete = null;

	@Column(name = "gabaritoQuestaoOito")
	private String gabaritoQuestaoOito = null;

	@Column(name = "gabaritoQuestaoNove")
	private String gabaritoQuestaoNove = null;

	@Column(name = "gabaritoQuestaoDez")
	private String gabaritoQuestaoDez = null;

	public Integer getIdGabarito() {
		return idGabarito;
	}

	public void setIdGabarito(Integer idGabarito) {
		this.idGabarito = idGabarito;
	}

	public String getDescricaoGabarito() {
		return descricaoGabarito;
	}

	public void setDescricaoGabarito(String descricaoGabarito) {
		this.descricaoGabarito = descricaoGabarito;
	}

	public Integer getPesoQuestaoUm() {
		return pesoQuestaoUm;
	}

	public void setPesoQuestaoUm(Integer pesoQuestaoUm) {
		this.pesoQuestaoUm = pesoQuestaoUm;
	}

	public Integer getPesoQuestaoDois() {
		return pesoQuestaoDois;
	}

	public void setPesoQuestaoDois(Integer pesoQuestaoDois) {
		this.pesoQuestaoDois = pesoQuestaoDois;
	}

	public Integer getPesoQuestaoTrês() {
		return pesoQuestaoTrês;
	}

	public void setPesoQuestaoTrês(Integer pesoQuestaoTrês) {
		this.pesoQuestaoTrês = pesoQuestaoTrês;
	}

	public Integer getPesoQuestaoQuatro() {
		return pesoQuestaoQuatro;
	}

	public void setPesoQuestaoQuatro(Integer pesoQuestaoQuatro) {
		this.pesoQuestaoQuatro = pesoQuestaoQuatro;
	}

	public Integer getPesoQuestaoCinco() {
		return pesoQuestaoCinco;
	}

	public void setPesoQuestaoCinco(Integer pesoQuestaoCinco) {
		this.pesoQuestaoCinco = pesoQuestaoCinco;
	}

	public Integer getPesoQuestaoSeis() {
		return pesoQuestaoSeis;
	}

	public void setPesoQuestaoSeis(Integer pesoQuestaoSeis) {
		this.pesoQuestaoSeis = pesoQuestaoSeis;
	}

	public Integer getPesoQuestaoSete() {
		return pesoQuestaoSete;
	}

	public void setPesoQuestaoSete(Integer pesoQuestaoSete) {
		this.pesoQuestaoSete = pesoQuestaoSete;
	}

	public Integer getPesoQuestaoOito() {
		return pesoQuestaoOito;
	}

	public void setPesoQuestaoOito(Integer pesoQuestaoOito) {
		this.pesoQuestaoOito = pesoQuestaoOito;
	}

	public Integer getPesoQuestaoNove() {
		return pesoQuestaoNove;
	}

	public void setPesoQuestaoNove(Integer pesoQuestaoNove) {
		this.pesoQuestaoNove = pesoQuestaoNove;
	}

	public Integer getPesoQuestaoDez() {
		return pesoQuestaoDez;
	}

	public void setPesoQuestaoDez(Integer pesoQuestaoDez) {
		this.pesoQuestaoDez = pesoQuestaoDez;
	}

	
	
	public String getGabaritoQuestaoUm() {
		return gabaritoQuestaoUm;
	}

	public void setGabaritoQuestaoUm(String gabaritoQuestaoUm) {
		this.gabaritoQuestaoUm = gabaritoQuestaoUm;
	}

	public String getGabaritoQuestaoDois() {
		return gabaritoQuestaoDois;
	}

	public void setGabaritoQuestaoDois(String gabaritoQuestaoDois) {
		this.gabaritoQuestaoDois = gabaritoQuestaoDois;
	}

	public String getGabaritoQuestaoTres() {
		return gabaritoQuestaoTres;
	}

	public void setGabaritoQuestaoTres(String gabaritoQuestaoTres) {
		this.gabaritoQuestaoTres = gabaritoQuestaoTres;
	}

	public String getGabaritoQuestaoQuatro() {
		return gabaritoQuestaoQuatro;
	}

	public void setGabaritoQuestaoQuatro(String gabaritoQuestaoQuatro) {
		this.gabaritoQuestaoQuatro = gabaritoQuestaoQuatro;
	}

	public String getGabaritoQuestaoCinco() {
		return gabaritoQuestaoCinco;
	}

	public void setGabaritoQuestaoCinco(String gabaritoQuestaoCinco) {
		this.gabaritoQuestaoCinco = gabaritoQuestaoCinco;
	}

	public String getRespQuestaoSeis() {
		return respQuestaoSeis;
	}

	public void setRespQuestaoSeis(String respQuestaoSeis) {
		this.respQuestaoSeis = respQuestaoSeis;
	}

	public String getGabaritoQuestaoSete() {
		return gabaritoQuestaoSete;
	}

	public void setGabaritoQuestaoSete(String gabaritoQuestaoSete) {
		this.gabaritoQuestaoSete = gabaritoQuestaoSete;
	}

	public String getGabaritoQuestaoOito() {
		return gabaritoQuestaoOito;
	}

	public void setGabaritoQuestaoOito(String gabaritoQuestaoOito) {
		this.gabaritoQuestaoOito = gabaritoQuestaoOito;
	}

	public String getGabaritoQuestaoNove() {
		return gabaritoQuestaoNove;
	}

	public void setGabaritoQuestaoNove(String gabaritoQuestaoNove) {
		this.gabaritoQuestaoNove = gabaritoQuestaoNove;
	}

	public String getGabaritoQuestaoDez() {
		return gabaritoQuestaoDez;
	}

	public void setGabaritoQuestaoDez(String gabaritoQuestaoDez) {
		this.gabaritoQuestaoDez = gabaritoQuestaoDez;
	}

	
	public GabaritoModel(Integer idGabarito, String descricaoGabarito, Integer pesoQuestaoUm, Integer pesoQuestaoDois,
			Integer pesoQuestaoTrês, Integer pesoQuestaoQuatro, Integer pesoQuestaoCinco, Integer pesoQuestaoSeis,
			Integer pesoQuestaoSete, Integer pesoQuestaoOito, Integer pesoQuestaoNove, Integer pesoQuestaoDez,
			String gabaritoQuestaoUm, String gabaritoQuestaoDois, String gabaritoQuestaoTres,
			String gabaritoQuestaoQuatro, String gabaritoQuestaoCinco, String respQuestaoSeis,
			String gabaritoQuestaoSete, String gabaritoQuestaoOito, String gabaritoQuestaoNove,
			String gabaritoQuestaoDez) {
		this.idGabarito = idGabarito;
		this.descricaoGabarito = descricaoGabarito;
		this.pesoQuestaoUm = pesoQuestaoUm;
		this.pesoQuestaoDois = pesoQuestaoDois;
		this.pesoQuestaoTrês = pesoQuestaoTrês;
		this.pesoQuestaoQuatro = pesoQuestaoQuatro;
		this.pesoQuestaoCinco = pesoQuestaoCinco;
		this.pesoQuestaoSeis = pesoQuestaoSeis;
		this.pesoQuestaoSete = pesoQuestaoSete;
		this.pesoQuestaoOito = pesoQuestaoOito;
		this.pesoQuestaoNove = pesoQuestaoNove;
		this.pesoQuestaoDez = pesoQuestaoDez;
		this.gabaritoQuestaoUm = gabaritoQuestaoUm;
		this.gabaritoQuestaoDois = gabaritoQuestaoDois;
		this.gabaritoQuestaoTres = gabaritoQuestaoTres;
		this.gabaritoQuestaoQuatro = gabaritoQuestaoQuatro;
		this.gabaritoQuestaoCinco = gabaritoQuestaoCinco;
		this.respQuestaoSeis = respQuestaoSeis;
		this.gabaritoQuestaoSete = gabaritoQuestaoSete;
		this.gabaritoQuestaoOito = gabaritoQuestaoOito;
		this.gabaritoQuestaoNove = gabaritoQuestaoNove;
		this.gabaritoQuestaoDez = gabaritoQuestaoDez;
	}

	@SuppressWarnings("unused")
	private GabaritoModel() {
	}

}
