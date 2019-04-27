package br.com.fiap.tds.ltp.pacotes.ex2.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex2.produtos.produto.Produto;

public class Cd extends Produto {
	public Cd(String autor, String titulo, String isbn) {
		super(autor, titulo, isbn);
		
	}
	private String artista;
	private String album;
	
	public Cd(String autor, String titulo, String isbn, String artista, String album) {
		super(autor, titulo, isbn);
		this.artista = artista;
		this.album = album;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}
