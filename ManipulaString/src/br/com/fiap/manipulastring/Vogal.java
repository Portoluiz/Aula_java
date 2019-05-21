package br.com.fiap.manipulastring;

import java.util.Scanner;

public class Vogal {

	

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner (System.in);
		
			String palavra = entrada.nextLine();
				String[] vogais = {"a", "e", "i", "o", "u"};
					for(String vogal: vogais) {
						palavra = palavra.replace(vogal, "*");
					}
					System.out.println(palavra);
		
		palavra = palavra.replaceAll("a", "*");
		palavra = palavra.replaceAll("e", "*");
		palavra = palavra.replaceAll("i", "*");
		palavra = palavra.replaceAll("o", "*");
		palavra = palavra.replaceAll("u", "*");
		
		System.out.println(palavra.toUpperCase());
		
		

	}

}
