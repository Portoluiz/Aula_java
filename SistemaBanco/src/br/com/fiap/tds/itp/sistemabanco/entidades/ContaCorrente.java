package br.com.fiap.tds.itp.sistemabanco.entidades;

public class ContaCorrente {
	private double saldo;
	private Cliente titular;
	
	public double retornaSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
}
