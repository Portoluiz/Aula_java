package br.com.fiap.tds.ltp.pacotes.ex2.produtos.livro;

public class Livro  {
	private String autor;
	private String titulo;
	private String isbn;
	
	public Livro(String autor, String titulo, String isbn) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
