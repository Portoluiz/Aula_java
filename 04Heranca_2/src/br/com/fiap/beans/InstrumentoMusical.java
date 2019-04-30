package br.com.fiap.beans;

public class InstrumentoMusical {
	private int qtdCordas;
	private String marca;
	private Cor cor;
	public InstrumentoMusical(int qtdCordas, String marca) {
		super();
		this.qtdCordas = qtdCordas;
		this.marca = marca;
	}
	public String exibirTudo () {
		return (qtdCordas + " - " + marca + " - " + cor).toUpperCase();
	}
	
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public int getQtdCordas() {
		return qtdCordas;
	}
	public void setQtdCordas(int qtdCordas) {
		this.qtdCordas = qtdCordas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
