package prova2_Ds;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Publicacao primeiraPubli = new Publicacao();
		
		System.out.println("PUBLICA��ES");
		
		System.out.println();
		
		System.out.println("1� Publica��o: ");
		primeiraPubli.setTitulo("Problemas no Rio Grande do Sul!");
		primeiraPubli.setAutor("Gabriel da S�lva");
		primeiraPubli.setAnoPublicacao(2024);
		
		System.out.println("T�tulo: "+primeiraPubli.getTitulo());
		System.out.println("Autor: "+primeiraPubli.getAutor());
		System.out.println("Ano da Publica��o: "+primeiraPubli.getAnoPublicacao());
		System.out.println();
		
//-----------------------------------------------------
		
		Publicacao segundaPubli = new Publicacao("A nova banda de Rock do momento!");
		
		System.out.println("2� Publica��o: ");
		segundaPubli.setAutor("Let�cia Rodriguez");
		segundaPubli.setAnoPublicacao(2023);
		
		System.out.println("T�tulo: "+segundaPubli.getTitulo());
		System.out.println("Autor: "+segundaPubli.getAutor());
		System.out.println("Ano da Publica��o: "+segundaPubli.getAnoPublicacao());
		System.out.println();
		
	}

}
