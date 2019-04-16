package br.com.fiap.ContaCorrente;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner (System.in);
		 
		 ContaCorrente conta = new ContaCorrente();
	
		 System.out.println(conta.deposito(20));
		 System.out.println(conta.deposito(100));
		 System.out.println(conta.deposito(20));
		 
		 conta.titular = "fora Temer";
		 System.out.println(conta.getSaldo());
		
	}

}
