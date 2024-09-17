package fixacao_Polimorfismo;

public class Filme extends Conteudo{
	private double duracao;
	
//------------------------CONSTRUTOR---------------------------
	public Filme() {
		
	}

	public Filme(double duracao) {
		this.duracao = duracao;
		
	}

//------------------------ATRIBUTOS---------------------------
//----------------------------------------------------
	
	public double getDuracao() {
		return this.duracao;
		
	}
	
	

	public void setDuracao(double duracao) {
		this.duracao = duracao;
		
	}
	

}
