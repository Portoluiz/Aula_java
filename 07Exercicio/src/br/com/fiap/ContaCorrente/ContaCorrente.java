package br.com.fiap.ContaCorrente;

public class ContaCorrente {
	public String titular;
	private int agenciaContaCorrente;
	private String numeroContaCorrente;
	private double saldo;
	
	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}
	public double saque(double valor) {
		saldo -= valor;
		return saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void exibirSaldo; {
		
		System.out.println("Olá" + titular + "o seu saldo e R$" saldo);
	}

	

}
