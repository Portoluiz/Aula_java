package br.com.fiap.pessoas;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;

public class PF {
	private String nome;
	private String cpf;
	private String veiculo;
	private Veiculo imovel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Veiculo veiculo2) {
		this.imovel = veiculo2;
	}
	
	
}
