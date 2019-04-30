package br.com.fiap.teste;

import java.util.Scanner;

import br.com.fiap.bens.Imovel;
import br.com.fiap.bens.Veiculo;
import br.com.fiap.pessoas.PF;

public class ExerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PF pessoa = new PF();
		Scanner entrada = new Scanner (System.in);
		pessoa.setNome(entrada.next());
		pessoa.setCpf(entrada.next());
		
		Imovel imovel = new Imovel();
		imovel.setEndereco(entrada.next());
		imovel.setResidencial(entrada.hasNextBoolean());
		imovel.setTamanho(entrada.hashCode());
		imovel.setValor(entrada.nextDouble());
		pessoa.setImovel(imovel);
		
		
		Veiculo veiculo = new Veiculo(null, null, 0, false);
		veiculo.setModelo(entrada.next());
		veiculo.setMotor(entrada.next());
		veiculo.setQtdPortas(entrada.nextInt());
		veiculo.setZeroKm(entrada.nextBoolean());
		pessoa.setImovel(veiculo);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getCpf());
		
		System.out.println(pessoa.getImovel() .getEndereco());
		System.out.println(pessoa.getImovel().isResidencial());
		System.out.println(pessoa.getImovel().getTamanho());
		System.out.println(pessoa.getImovel().getValor());
		
		System.out.println(pessoa.getVeiculo().getModelo());
		System.out.println(pessoa.getVeiculo().getMotor());
		System.out.println(pessoa.getVeiculo().getQtdPortas());
		System.out.println(pessoa.getVeiculo().isZeroKm());
		
		
		
		
		
		
	}

}
