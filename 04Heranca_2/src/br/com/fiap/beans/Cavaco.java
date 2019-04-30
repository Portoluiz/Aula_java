package br.com.fiap.beans;

public class Cavaco extends InstrumentoMusical {

	public Cavaco(int qtdCordas, String marca) {
		super(qtdCordas, marca);
	}
	private double peso;
	private String modelo;
	

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
