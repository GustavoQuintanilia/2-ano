package prova1_Ds;

public class Produto {
	private int id;
	private String nome;
	private double precoProduto; 
	double descontoProduto;
	
	
	public Produto(){
	
	}
	
	
	public Produto(int id){
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
	  this.id = id;
	}
	
//------------------------------------------------------
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome=nome;
	}
	
//------------------------------------------------------
	public double getPrecoProduto() {
		return this.precoProduto;
	}
	
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}
	
//------------------------------------------------------
	
	public double getDescontoProduto() {
		return this.descontoProduto = this.precoProduto - (this.precoProduto * 0.90);
	}
	
	public void setDescontoProduto(double descontoProduto) {
		this.descontoProduto = descontoProduto;
	}
	
//------------------------------------------------------
	
	public double calcularDesconto(double precoProduto) {
		return this.precoProduto * 0.90;
	}

}
