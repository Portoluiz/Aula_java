package br.com.fiap.estagiario;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro =new Carro();
		carro.fabricante = "FORD";
		carro.modelo = "Ka";
		carro.anoFabricado = 2016;
		carro.preco = 26000;
		carro.abs = true;
		carro.airBag = true;
		carro.arCondicionado = true;
		carro.direcaoHidraulica = true;
		
		
		Cor no = new Cor();
		no.nome = "Preto";
		no.corMetalica = true;
		
		
		carro.cor = no;
		
		System.out.println(carro.getPreco());
		System.out.println(carro.getIPI());
		System.out.println(carro.getICMS());
		System.out.println(carro.getimpostos());
		System.out.println();
		

	}

}
