package br.com.fiap.beans;

public class Tecnologo extends Formacao {
	
	private boolean planoEstendido;

	public Tecnologo(String descricao, int preiodo, int duracao, double mensalidade, boolean planoEstendido) {
		super(descricao, preiodo, duracao, mensalidade);
		this.planoEstendido = planoEstendido;
	}
	


	public void calcularMensalidade (double fator) {
		super.definirDuracao();
		mensalidade = duracao * fator * 600;
	}
	
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
}
