package br.com.fiap.tds.itp.sistemabanco.entidades;

public class TesteConta {

	public static void main(String[] args) {
		Cliente cliente = new Cliente ();
		cliente.setNome("Olavo de Carvalho");
		cliente.setCpf("369..785.699-12");
		
		Endereco  endereco = new Endereco();
		endereco.setBairro("Brás");
		endereco.setCep("85561-387");
		endereco.setComplemento("AP 07");
		endereco.setNumero("33");
		endereco.setRua("Alagoas");
		
		ContaCorrente conta = new ContaCorrente();
		conta.setSaldo("R$ 7.950,33");
		conta.setTitular("Olavo de Carvalho");
		
		
	}

}
