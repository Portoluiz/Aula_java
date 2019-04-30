package br.com.fiap.beans;

public class Bacharelado extends Formacao {
	
	private String ProjetoConclusao;
	private int cargaHorariaEstagio;
	
	public Bacharelado(String descricao, int preiodo, int duracao, double mensalidade, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, preiodo, duracao, mensalidade);
		ProjetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public void calcularMesalidade (double fator) {
		super.definirDuracao();
		mensalidade = (duracao * fator * 600) + (cargaHorariaEstagio * 12);
	}
	
	public String getProjetoConclusao() {
		return ProjetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		ProjetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	
}
