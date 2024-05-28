package prova2_Ds;

public class Livro extends Publicacao {
	
	private int numeroPaginas;
	private String editora;
	
//---------------------------------Construtor---------------------------------------
	
	public Livro() {
		
		
	}
	
	public Livro(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
		
	}
	
	public Livro(int numeroPaginas, String editora) {
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		
	}

//------------------------------------------------------------------------
	
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	public void setNumeroPaginas (int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
//------------------------------------------------------------------------
	
	public String getEditora() {
		return this.editora;
	}
		
	public void setEditora (String editora) {
		this.editora = editora;
	}
	
//-----------------------------------MÉTODO-------------------------------------
	
	
}
