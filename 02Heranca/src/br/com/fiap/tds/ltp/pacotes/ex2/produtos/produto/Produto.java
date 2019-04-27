package br.com.fiap.tds.ltp.pacotes.ex2.produtos.produto;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro.Livro;

public class Produto extends Livro {
	public Produto(String autor, String titulo, String isbn) {
		super(autor, titulo, isbn);		
	}
	private int codigo;
	private int preco;
	
	public Produto(String autor, String titulo, String isbn, int codigo, int preco) {
		super(autor, titulo, isbn);
		this.codigo = codigo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
