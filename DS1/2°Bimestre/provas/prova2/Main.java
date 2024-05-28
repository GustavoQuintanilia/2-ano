package prova2_Ds;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Publicacao primeiraPubli = new Publicacao();
		
		System.out.println("PUBLICAÇÕES");
		
		System.out.println();
		
		System.out.println("1° Publicação: ");
		primeiraPubli.setTitulo("Problemas no Rio Grande do Sul!");
		primeiraPubli.setAutor("Gabriel da Sílva");
		primeiraPubli.setAnoPublicacao(2024);
		
		System.out.println("Título: "+primeiraPubli.getTitulo());
		System.out.println("Autor: "+primeiraPubli.getAutor());
		System.out.println("Ano da Publicação: "+primeiraPubli.getAnoPublicacao());
		System.out.println();
		
//-----------------------------------------------------
		
		Publicacao segundaPubli = new Publicacao("A nova banda de Rock do momento!");
		
		System.out.println("2° Publicação: ");
		segundaPubli.setAutor("Letícia Rodriguez");
		segundaPubli.setAnoPublicacao(2023);
		
		System.out.println("Título: "+segundaPubli.getTitulo());
		System.out.println("Autor: "+segundaPubli.getAutor());
		System.out.println("Ano da Publicação: "+segundaPubli.getAnoPublicacao());
		System.out.println();
		
	}

}
