package visao;
import modelo.Livro;
import modelo.Revista;
public class Teste {
	
	public static void main(String args[]) {
		
		Livro livroOne = new Livro("A hora da Estrela", 1998,"Rocco","85-325-0812-X");  
		Livro livroTwo = new Livro("Dom casmurro", 2004, "Gold", "85-98559-08-3");
		Revista veja = new Revista("Veja", 2013, "Editora Abril", 258963); 
		Revista istoE = new Revista("ISTO É", 2015,"Editora Três",20698);
		
		
		System.out.println("==========================================");
		System.out.println("LIVROS");
		System.out.println("==========================================");
		System.out.println(livroOne);
		System.out.println(livroTwo);
		System.out.println("==========================================");
		System.out.println("REVISTAS");
		System.out.println("==========================================");
		System.out.println(veja);
		System.out.println(istoE);
		
	}

}
