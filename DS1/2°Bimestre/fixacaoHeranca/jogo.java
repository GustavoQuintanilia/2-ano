package atividadeHeranca2;

public class jogo {
	private String nome;
	private double preco;
	private String distribuidora;

	
//---------------------------ATRIBUTOS------------------------------------
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//---------------------------------------------------------------
	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
//---------------------------------------------------------------
	public String getDistribuidora() {
		return this.distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
//---------------------------MÉTODOS------------------------------------

	public void exibirDetalhes() {
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Preço: R$"+ this.getPreco());
		System.out.println("Distribuidora: "+ this.getDistribuidora());
	}
	

}
