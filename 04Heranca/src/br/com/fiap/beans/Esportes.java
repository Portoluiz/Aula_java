package br.com.fiap.beans;

public class Esportes {
	private int qutdTimes;
	private int qutdJogadores;
	public Esportes(int qutdTimes, int qutdJogadores) {
		super();
		this.qutdTimes = qutdTimes;
		this.qutdJogadores = qutdJogadores;
	}
	public int getQutdTimes() {
		return qutdTimes;
	}
	public void setQutdTimes(int qutdTimes) {
		this.qutdTimes = qutdTimes;
	}
	public int getQutdJogadores() {
		return qutdJogadores;
	}
	public void setQutdJogadores(int qutdJogadores) {
		this.qutdJogadores = qutdJogadores;
	}
	
}
