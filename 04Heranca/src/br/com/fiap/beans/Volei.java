package br.com.fiap.beans;

public class Volei extends Esportes {
	public Volei(int qutdTimes, int qutdJogadores) {
		super(qutdTimes, qutdJogadores);
	}
	private int qtdHomens;
	private int qtdMulheres;
	
	public Volei(int qutdTimes, int qutdJogadores, int qtdHomens, int qtdMulheres) {
		super(qutdTimes, qutdJogadores);
		this.qtdHomens = qtdHomens;
		this.qtdMulheres = qtdMulheres;
	}

	public int getQtdHomens() {
		return qtdHomens;
	}

	public void setQtdHomens(int qtdHomens) {
		this.qtdHomens = qtdHomens;
	}

	public int getQtdMulheres() {
		return qtdMulheres;
	}

	public void setQtdMulheres(int qtdMulheres) {
		this.qtdMulheres = qtdMulheres;
	}
	
}
