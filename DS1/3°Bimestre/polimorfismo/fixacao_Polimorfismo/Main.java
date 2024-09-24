package fixacao_Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conteudo[] catalogo = new Conteudo[10];
		
		//FILME
		catalogo[0] = new Filme("A��o", "Homem-Aranha", 121);
		catalogo[1] = new Filme("A��o", "Guardi�es da Gal�xia Vol. 3", 150);
		catalogo[2] = new Filme("Com�dia", "Mad Max: Estrada da F�ria", 120);
		catalogo[3] = new Filme("A��o", " Mulheres � Beira de um Ataque de Nervos", 88);
		catalogo[4] = new Filme("Drama", "Central Do Brasil", 113);
		
		//S�RIE		
		catalogo[5] = new Serie("A��o", "The Boys", 66, 32, 4);
		catalogo[6] = new Serie("Thriller Policial", "Bom Dia, Ver�nica" , 45, 17 , 3);
		catalogo[7] = new Serie("Fantasia/Suspense", "Cidade Invis�vel", 40, 12, 2);
		catalogo[8] = new Serie("Drama", "Coisa Mais Linda", 50, 13, 2);
		catalogo[9] = new Serie("Drama Psicol�gico", "Sess�o de Terapia", 30, 45, 5);
		
		//APRESENTA��O
		for(Conteudo conteudo1 : catalogo){		
			conteudo1.descricao();
			System.out.println();
		}


	}

}
