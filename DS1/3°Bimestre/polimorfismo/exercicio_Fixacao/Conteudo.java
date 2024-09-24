package fixacao_Polimorfismo;

public class Conteudo {
	private String categoria; 
	private String titulo;
	
//------------------------CONSTRUTOR---------------------------
	public Conteudo() {
	
	}
	
	public Conteudo(String categoria, String titulo) {
		this.categoria = categoria;
		this.titulo = titulo;
		
	}
	
//------------------------ATRIBUTOS---------------------------
//----------------------------------------------------
	public String getCategoria() {
		return this.categoria;
		
	}

	

	public void setCategoria(String categoria) {
		this.categoria = categoria;
		
	}
	
//----------------------------------------------------
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
	
//------------------------MÉTODOS---------------------------
	
	public void descricao() {
		System.out.println("Categoria: "+this.getCategoria()); 
		System.out.println("Título: "+this.getTitulo());
	}
	

}
