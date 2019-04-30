package br.com.fiap.beasn.venda.passagen;

public class Teste {

	public static void main(String[] args) {
		Escala escala = new Escala();
		escala.setLocal("Alaska");
		escala.setTempo("10h");
		escala.setTrasnfer(true);
		
		Passagem passagem = new Passagem();
		passagem.setAssento("6A");
		passagem.setCompanhia("Avianca");
		passagem.setDestino("China");
		
		Escala[] escalas = new Escala[10];
		escalas[0] = escala;
		
		passagem.setEscalas(escalas);
		passagem.setHora("04:00H");
		passagem.setLovalizador("98FG568");
		passagem.setNumVoo("9868V");
		passagem.setOrigem("Jhonesburgo");
		passagem.setValor(200);
		
		Passageiro passageiro = new Passageiro();
		passageiro.setNome("Jamal");
		passageiro.setPassagem(passagem);
		passageiro.setRg("47.568.369.x");
		
		
		
		
	}
	
	
}
