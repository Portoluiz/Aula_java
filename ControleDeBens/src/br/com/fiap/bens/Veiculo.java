package br.com.fiap.bens;

public class Veiculo {
	private String modelo;
	private String motor;
	private int qtdPortas;
	private boolean zeroKm;
	
	
	
	public Veiculo(String modelo, String motor, int qtdPortas, boolean zeroKm) {
		super();
		this.modelo = modelo;
		this.motor = motor;
		this.qtdPortas = qtdPortas;
		this.zeroKm = zeroKm;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	public boolean isZeroKm() {
		return zeroKm;
	}
	public void setZeroKm(boolean zeroKm) {
		this.zeroKm = zeroKm;
	}
	
}	
	
