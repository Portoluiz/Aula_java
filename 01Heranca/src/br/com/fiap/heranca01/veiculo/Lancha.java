package br.com.fiap.heranca01.veiculo;

public class Lancha extends Veiculo{
	public Lancha(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		
	}

	private int quantidadeMotores;

	public Lancha(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor,
			int quantidadeMotores) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadeMotores = quantidadeMotores;
	}

	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	
}
