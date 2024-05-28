package prova2_Ds;

public class Revista extends Publicacao {
	
	private int numeroEdicao;
	private String mesPublicacao;
	
//---------------------------------Construtor---------------------------------------
	public Revista() {
		
		
	}
	
	public Revista(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
		
	}
	
	public Revista(int numeroEdicao, String mesPublicacao) {
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}
	
//------------------------------------------------------------------------
	
	public int getNumeroEdicao() {
		return this.numeroEdicao;
	}
	
	public void setNumeroEdicao (int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
//------------------------------------------------------------------------
	
	public String getMesPublicacao() {
		return this.mesPublicacao;
	}
		
	public void setMesPublicacao (String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

//-----------------------------------MÉTODO-------------------------------------
	
}
