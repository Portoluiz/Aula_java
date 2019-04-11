package Descanso;

public class Cliente {

	private String nome;
	private String email;
	private String fone;
	private String endereco;
	
	public Cliente(String nome, String email, String fone, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
