package fixacao_Polimorfismo;

public class Serie extends Conteudo{
	private double duracao;
	private int quantEpisodios;
	private double quantTemps;
	
//------------------------CONSTRUTOR---------------------------
	public Serie() {
		
	}
	
	public Serie(String categoria, String titulo, double duracao, int quantEpisodios, double quantTemps) {
		super(categoria, titulo);
		this.duracao = duracao;
		this.quantEpisodios = quantEpisodios;
		this.quantTemps = quantTemps;
	}
	
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
	public double getQuantTemps() {
		return this.quantTemps;
		
	}
	
	public void setQuantTemps(double quantTemps) {
		this.quantTemps = quantTemps;
		
	}
	
//------------------------M�TODOS---------------------------
	@Override
	public void descricao() {
		System.out.println("S�RIE");
		System.out.println("Categoria: "+this.getCategoria()); 
		System.out.println("T�tulo: "+this.getTitulo());
		System.out.println("Dura��o: "+this.getDuracao()+" minutos");
		System.out.println("Quantidade de epis�dios: "+this.getQuantEpisodios());
		System.out.println("Quantidade de temporadas: "+this.getQuantTemps());
		
	}

	
	

}
