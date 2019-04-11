package Descanco;

import java.util.Scanner;

public class TestarAluno {

	private static Scanner e;

	public static void main(String args[]) {

		Aluno aluno1 = new Aluno();
		e = new Scanner(System.in);
		aluno1.setMedia(e.nextDouble());
		aluno1.setNome(e.next() + e.nextLine());
		aluno1.setQtdeFaltas(e.nextInt());
		System.out.println(aluno1);
		System.out.println("Aluno: " + aluno1.getNome());
		System.out.println("Media: " + aluno1.getMedia());
		System.out.println(" Faltas: " + aluno1.getQtdeFaltas());
	}

}