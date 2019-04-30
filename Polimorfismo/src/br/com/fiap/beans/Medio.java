package br.com.fiap.beans;

public class Medio extends Formacao{
	
	private String tipo;

	public Medio(String descricao, int preiodo, int duracao, double mensalidade, String tipo) {
		super(descricao, preiodo, duracao, mensalidade);
		this.tipo = tipo;
	}

	public void calcularMesalidade (double fator) {
		super.definirDuracao();
		mensalidade = duracao * fator * 500;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
