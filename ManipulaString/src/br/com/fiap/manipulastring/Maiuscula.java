package br.com.fiap.manipulastring;

import java.util.Scanner;

public class Maiuscula {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner (System.in);
		
		 String palavra = entrada.nextLine();
		 
		 System.out.println(palavra.toUpperCase());

	}

}
