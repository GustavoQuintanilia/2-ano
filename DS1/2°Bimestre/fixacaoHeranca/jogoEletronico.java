package atividadeHeranca2;

public class jogoEletronico extends jogo {

	private String plataforma;
	private String genero;
	
//-----------------------------------------ATRIBUTOS-------------------------------------------------	
	

	public String getPlataforma () {
		return this.plataforma;
	}
	
	public void setPlataforma (String plataforma) {
		this.plataforma = plataforma;
	}
	
//------------------------------------------------------------------------------------------		
	
	public String getGenero () {
		return this.genero;
	}
	
	public void setGenero (String genero) {
		this.genero = genero;
	}
	
//-----------------------------------------MÉTODOS-------------------------------------------------	
	
@Override
	
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Plataforma: " + this.getPlataforma());
		System.out.println("Gênero: " + this.getGenero());
	}
//------------------------------------------------------------------------------------------	
	
	public void jogarOnline (int quantidadeJogadores) {
			
			System.out.println("Jogando online com "+quantidadeJogadores+" jogadores.");
	}
	
}
