package fixacao_Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conteudo[] catalogo = new Conteudo[10];
		
		//FILME
		catalogo[1] = new Filme("Ação", "Homem-Aranha", 121);
		catalogo[2] = new Filme("Ação", "Homem-Aranha", 140);
		catalogo[3] = new Filme("Ação", "Homem-Aranha", 140);
		catalogo[4] = new Filme("Ação", "Homem-Aranha", 140);
		catalogo[5] = new Filme("Ação", "Homem-Aranha", 140);
		
		//SÉRIE		
		catalogo[1] = new Serie("Ação", "The Boys", 66, 32, 4);
		catalogo[2] = new Serie("Ação", "The Boys", 66, 32, 4);
		catalogo[3] = new Serie("Ação", "The Boys", 66, 32, 4);
		catalogo[4] = new Serie("Ação", "The Boys", 66, 32, 4);
		catalogo[5] = new Serie("Ação", "The Boys", 66, 32, 4);
		
		//APRESENTAÇÃO
		for(Conteudo conteudo : catalogo){		
			conteudo.descricao(); 
			System.out.println();
		}


		

	}

}
