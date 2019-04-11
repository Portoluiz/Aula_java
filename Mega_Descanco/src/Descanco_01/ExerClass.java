package Descanco_01;

import java.util.Scanner;

public class ExerClass {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Digite sua Idade: ");
		int teste = entrada.nextInt();
		System.out.println("Digite a sua grana: ");
		double saldo = entrada.nextDouble();

		if (teste < 45) {

			System.out.println("voce e novo");
		} else {
			System.out.println("voce e velhaco");
		}
		System.out.println("voce tem: " + saldo + " ricasso!!!");
	}

}
