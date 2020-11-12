package modelo;

public class Revista extends Publicacao{

	private int periodicidade;
	
	public Revista(String nome, int dataDePublicacao, String editora ,int periodicidade) {
		super(nome, dataDePublicacao, editora);
		this.periodicidade = periodicidade;
	}
	
	public Revista() {}
	
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}
	public String toString() {
		return "Revista - periodicidade = " + periodicidade + ", Nome = " + getNome() + ", Data de Publicacao = "
				+ getDataDePublicacao() + ", Editora = " + getEditora();
	}
	
	
	
}
