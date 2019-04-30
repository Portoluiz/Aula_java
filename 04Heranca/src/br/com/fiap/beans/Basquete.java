package br.com.fiap.beans;

public class Basquete extends Esportes{
	public Basquete(int qutdTimes, int qutdJogadores) {
		super(qutdTimes, qutdJogadores);
	}
	private String nomeTreinador;
	private String nomeDestaque;
	
	public Basquete(int qutdTimes, int qutdJogadores, String nomeTreinador, String nomeDestaque) {
		super(qutdTimes, qutdJogadores);
		this.nomeTreinador = nomeTreinador;
		this.nomeDestaque = nomeDestaque;
	}
	public String getNomeTreinador() {
		return nomeTreinador;
	}
	public void setNomeTreinador(String nomeTreinador) {
		this.nomeTreinador = nomeTreinador;
	}
	public String getNomeDestaque() {
		return nomeDestaque;
	}
	public void setNomeDestaque(String nomeDestaque) {
		this.nomeDestaque = nomeDestaque;
	}
	
}
