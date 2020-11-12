package modelo;

public class Livro extends Publicacao {

	private String isbn;
	
	public Livro(String nome, int dataDePublicacao, String editora,String isbn) {
		super(nome, dataDePublicacao, editora);
		this.isbn = isbn;
	}
	
	public Livro() {}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String toString() {
		return "Livro - isbn = " + isbn + ", Nome = " + getNome() + ", Data de Publicacao = " + getDataDePublicacao()
				+ ", Editora = " + getEditora();
	}
	
	
}
