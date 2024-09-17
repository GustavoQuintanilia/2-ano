package fixacao_Polimorfismo;

public class Serie extends Conteudo{
	private double duracao;
	private int quantEpisodios;
	private double quantTemps;
	
//------------------------CONSTRUTOR---------------------------
	
	
//------------------------ATRIBUTOS---------------------------
//----------------------------------------------------
	public double getDuracao() {
		return this.duracao;
		
	}
	
	public void setDuracao (double duracao) {
		this.duracao = duracao;

	}

//----------------------------------------------------
	public int getQuantEpisodios() {
		return this.quantEpisodios;
				
	}
	
	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}

//----------------------------------------------------

	
	
}
