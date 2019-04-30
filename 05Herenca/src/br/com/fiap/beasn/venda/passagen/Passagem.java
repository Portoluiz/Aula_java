package br.com.fiap.beasn.venda.passagen;

public class Passagem extends Voo {
	private String lovalizador, assento;
	private double valor;
	
	public String getLovalizador() {
		return lovalizador;
	}
	public void setLovalizador(String lovalizador) {
		this.lovalizador = lovalizador;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
