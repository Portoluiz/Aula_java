package br.com.fiap.trabalho;

import java.util.Scanner;

public class Trabalho {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		int horas = entrada.nextInt();
		
		System.out.println("Digite o valor/hora em R$: ");
		double valor = entrada.nextDouble();
		
		System.out.println("o seu Salario é de R$ " + (horas*valor));
		

	}

}
