package br.com.fiap.beans;

public class Guitarra extends InstrumentoMusical{

	public Guitarra(int qtdCordas, String marca) {
		super(qtdCordas, marca);		
	}
	private double tpcorda;
	private String modelo;
	


	public double getTpcorda() {
		return tpcorda;
	}

	public void setTpcorda(double tpcorda) {
		this.tpcorda = tpcorda;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
