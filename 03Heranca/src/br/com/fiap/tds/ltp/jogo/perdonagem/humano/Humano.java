package br.com.fiap.tds.ltp.jogo.perdonagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Persoagem;

public class Humano extends Persoagem{
	public Humano(int forca, int inteligencia, int destreza, int level, String nome) {
		super(forca, inteligencia, destreza, level, nome);		
	}
	private String classe;
	
	public Humano(int forca, int inteligencia, int destreza, int level, String nome, String classe) {
		super(forca, inteligencia, destreza, level, nome);
		this.classe = classe;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
