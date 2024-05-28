package prova2_Ds;

public class Publicacao {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
//---------------------------------Construtor---------------------------------------
	
	public Publicacao() {
		
		
	}
	
	public Publicacao(String titulo) {
		this.titulo = titulo;
			
	}
	
	public Publicacao(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;	
	}
	
	public Publicacao(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;	
		this.anoPublicacao = anoPublicacao;
	}
	
//------------------------------------------------------------------------
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}
	
//------------------------------------------------------------------------
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
//------------------------------------------------------------------------
	
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
		
	public void setAnoPublicacao (int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
//-----------------------------------MÉTODO-------------------------------------
		
	


}
