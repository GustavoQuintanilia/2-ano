package fixacao_Polimorfismo;

public class Filme extends Conteudo{
	private double duracao;
	
//------------------------CONSTRUTOR---------------------------
	public Filme() {
			
	}
		
	public Filme(String categoria, String titulo, double duracao) {
		super(categoria, titulo);
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
		
//------------------------M�TODOS---------------------------
	@Override
	public void descricao() {
		System.out.println("FILME");
		System.out.println("Categoria: "+this.getCategoria()); 
		System.out.println("T�tulo: "+this.getTitulo());
		System.out.println("Dura��o: "+this.getDuracao() +" minutos");
			
	}


}
