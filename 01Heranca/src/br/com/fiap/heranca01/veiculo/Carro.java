package br.com.fiap.heranca01.veiculo;

public class Carro extends Veiculo {
	public Carro(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao,
			br.com.fiap.heranca01.veiculo.Cor cor) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		
	}
	int quantidadePortas;
	String placa;
	float  motor = (float) (1.0);
	
	public Carro(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao,
			br.com.fiap.heranca01.veiculo.Cor cor, int quantidadePortas, String placa, float motor) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadePortas = quantidadePortas;
		this.placa = placa;
		this.motor = motor;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	} 
	
	
}
