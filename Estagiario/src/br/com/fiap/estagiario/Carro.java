package br.com.fiap.estagiario;

public class Carro {
	String modelo;
	String fabricante;
	int anoFabricado;
	Cor cor;
	boolean airBag;
	boolean abs;
	boolean direcaoHidraulica;
	boolean arCondicionado;
	double preco;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void exibirOpcionais() {
		System.out.println("Cor: " + cor.nome);
		System.out.println("AirBag" + airBag);
		System.out.println("Direção Hidraulica" +direcaoHidraulica );
		System.out.println("Ar" + arCondicionado);
	}
	public void exibirTudo() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Ano: " + anoFabricado);
		System.out.println("cor: " + cor);
		System.out.println("Preço: " + preco);
		exibirOpcionais();		
	}
	public double getIPI() {
		return 0.075 * preco;
	}
	public double getICMS() {
		return 0.005 * preco;
	}
	
	public double getimpostos() {
		return getIPI() + getICMS();
	}
}
