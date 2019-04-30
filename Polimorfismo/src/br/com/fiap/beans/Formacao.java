package br.com.fiap.beans;

public class Formacao {
	
	private String descricao;
	private int preiodo;
	protected int duracao;
	protected double mensalidade;
	private int periodo;
	
	public Formacao(String descricao, int preiodo, int duracao, double mensalidade) {
		super();
		this.descricao = descricao;
		this.periodo = preiodo;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}
	public String getTudo() {
		return descricao + " - " + periodo + " - " + duracao +
				" - " + mensalidade ;
	}
	public  void definirDuracao() {
		
		if(this instanceof Medio) {
			duracao = 36;
		} else if(this instanceof Tecnologo) {
			duracao = 24;
		} else {
			duracao = 60;
		}
	}
	
	public double exibirMedia(double ps1, double ps2) {
		return exibirMedia(ps1, ps2, 0.0, 0.0);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, 
			double nac2) {
		return exibirMedia (ps1, ps2, nac1, nac2, 0.0, 0.0);
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, 
			double am1, double am2) {
		return ((ps1+ps2)+ 0.5 + (nac1 + nac2 )* + 0.2 + (am1 + am2)* 0.3) /2;
	}
		
	
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPreiodo() {
		return preiodo;
	}
	public void setPreiodo(int preiodo) {
		this.preiodo = preiodo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
}
