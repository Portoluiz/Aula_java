package br.com.fiap.beans;

public class ContraBaixo extends InstrumentoMusical {

	public ContraBaixo(int qtdCordas, String marca) {
		super(qtdCordas, marca);
	}
	private String numSerie;
	private String classe;
	
	public String exibirTudo() {
		return (super.exibirTudo() + " - " + classe + " - " +
numSerie).toUpperCase();	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
