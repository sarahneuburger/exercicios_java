package com.escolaalf.sistema.notas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "alunos")
@Entity

public class AlunoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAluno")
	private Integer idAluno;

	@Column(name = "nomeAluno")
	private String nomeAluno;

	@Column(name = "sobrenomeAluno")
	private String sobrenomeAluno;

	@Column(name = "descricaoGabarito")
	private String descricaoGabarito;

	@Column(name = "respQuestaoUm")
	private String respQuestaoUm = null;

	@Column(name = "respQuestaoDois")
	private String respQuestaoDois = null;

	@Column(name = "respQuestaoTres")
	private String respQuestaoTres = null;

	@Column(name = "respQuestaoQuatro")
	private String respQuestaoQuatro = null;

	@Column(name = "respQuestaoCinco")
	private String respQuestaoCinco = null;

	@Column(name = "respQuestaoSeis")
	private String respQuestaoSeis = null;

	@Column(name = "respQuestaoSete")
	private String respQuestaoSete = null;

	@Column(name = "respQuestaoOito")
	private String respQuestaoOito = null;

	@Column(name = "respQuestaoNove")
	private String respQuestaoNove = null;

	@Column(name = "respQuestaoDez")
	private String respQuestaoDez = null;

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getSobrenomeAluno() {
		return sobrenomeAluno;
	}

	public void setSobrenomeAluno(String sobrenomeAluno) {
		this.sobrenomeAluno = sobrenomeAluno;
	}

	public String getDescricaoGabarito() {
		return descricaoGabarito;
	}

	public void setDescricaoGabarito(String descricaoGabarito) {
		this.descricaoGabarito = descricaoGabarito;
	}

	public String getRespQuestaoUm() {
		return respQuestaoUm;
	}

	public void setRespQuestaoUm(String respQuestaoUm) {
		this.respQuestaoUm = respQuestaoUm;
	}

	public String getRespQuestaoDois() {
		return respQuestaoDois;
	}

	public void setRespQuestaoDois(String respQuestaoDois) {
		this.respQuestaoDois = respQuestaoDois;
	}

	public String getRespQuestaoTres() {
		return respQuestaoTres;
	}

	public void setRespQuestaoTres(String respQuestaoTres) {
		this.respQuestaoTres = respQuestaoTres;
	}

	public String getRespQuestaoQuatro() {
		return respQuestaoQuatro;
	}

	public void setRespQuestaoQuatro(String respQuestaoQuatro) {
		this.respQuestaoQuatro = respQuestaoQuatro;
	}

	public String getRespQuestaoCinco() {
		return respQuestaoCinco;
	}

	public void setRespQuestaoCinco(String respQuestaoCinco) {
		this.respQuestaoCinco = respQuestaoCinco;
	}

	public String getRespQuestaoSeis() {
		return respQuestaoSeis;
	}

	public void setRespQuestaoSeis(String respQuestaoSeis) {
		this.respQuestaoSeis = respQuestaoSeis;
	}

	public String getRespQuestaoSete() {
		return respQuestaoSete;
	}

	public void setRespQuestaoSete(String respQuestaoSete) {
		this.respQuestaoSete = respQuestaoSete;
	}

	public String getRespQuestaoOito() {
		return respQuestaoOito;
	}

	public void setRespQuestaoOito(String respQuestaoOito) {
		this.respQuestaoOito = respQuestaoOito;
	}

	public String getRespQuestaoNove() {
		return respQuestaoNove;
	}

	public void setRespQuestaoNove(String respQuestaoNove) {
		this.respQuestaoNove = respQuestaoNove;
	}

	public String getRespQuestaoDez() {
		return respQuestaoDez;
	}

	public void setRespQuestaoDez(String respQuestaoDez) {
		this.respQuestaoDez = respQuestaoDez;
	}

	public AlunoModel(Integer idAluno, String nomeAluno, String sobrenomeAluno, String descricaoGabarito,
			String respQuestaoUm, String respQuestaoDois, String respQuestaoTres, String respQuestaoQuatro,
			String respQuestaoCinco, String respQuestaoSeis, String respQuestaoSete, String respQuestaoOito,
			String respQuestaoNove, String respQuestaoDez) {
		this.idAluno = idAluno;
		this.nomeAluno = nomeAluno;
		this.sobrenomeAluno = sobrenomeAluno;
		this.descricaoGabarito = descricaoGabarito;
		this.respQuestaoUm = respQuestaoUm;
		this.respQuestaoDois = respQuestaoDois;
		this.respQuestaoTres = respQuestaoTres;
		this.respQuestaoQuatro = respQuestaoQuatro;
		this.respQuestaoCinco = respQuestaoCinco;
		this.respQuestaoSeis = respQuestaoSeis;
		this.respQuestaoSete = respQuestaoSete;
		this.respQuestaoOito = respQuestaoOito;
		this.respQuestaoNove = respQuestaoNove;
		this.respQuestaoDez = respQuestaoDez;
	}

	@SuppressWarnings("unused")
	private AlunoModel() {
	}

	
	
	public int notaAluno(String respQuestaoUm, String respQuestaoDois, String respQuestaoTres, String respQuestaoQuatro,
			String respQuestaoCinco, String respQuestaoSeis, String respQuestaoSete, String respQuestaoOito,
			String respQuestaoNove, String respQuestaoDez) {
		int notaAluno;
		if(GabaritoModel.getGabaritoQuestaoUm() == respQuestaoUm)

		return notaAluno;
	}
	
	
	public int retornaMedia() {
		return media;
	}
	
}
