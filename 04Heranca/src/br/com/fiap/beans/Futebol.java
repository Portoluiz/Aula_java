package br.com.fiap.beans;

public class Futebol extends Esportes {
	public Futebol(int qutdTimes, int qutdJogadores) {
		super(qutdTimes, qutdJogadores);		
	}
	private String nomeGanhador;
	private int qtdVitorias;
	
	public Futebol(int qutdTimes, int qutdJogadores, String nomeGanhador, int qtdVitorias) {
		super(qutdTimes, qutdJogadores);
		this.nomeGanhador = nomeGanhador;
		this.qtdVitorias = qtdVitorias;
	}
	public String getNomeGanhador() {
		return nomeGanhador;
	}
	public void setNomeGanhador(String nomeGanhador) {
		this.nomeGanhador = nomeGanhador;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	
	
}
