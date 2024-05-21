package teste_Heranca2;

public class cliente {
	
	private String nome;
	private int idade;
	private String endereco;
	private double valor_Pedido;
	private double valor_Promocional;

	
//---------------------------------------------------------------------------------

	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;	
	}
	
//---------------------------------------------------------------------------------
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
//---------------------------------------------------------------------------------
	
	public String getEndereco () {
		return this.endereco;
	}
	
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	
//---------------------------------------------------------------------------------

	public double getValor_Pedido () {
		return this.valor_Pedido;
	}
	
	public void setValor_Pedido (double valor_Pedido) {
		this.valor_Pedido = valor_Pedido;
	}
	
//---------------------------------------------------------------------------------
	
	public double getValor_Promocional () {
		return this.valor_Promocional = this.valor_Pedido - (this.valor_Pedido * 0.10);
	}
	
	public void setValor_Promocional (double valor_Promocional) {
		this.valor_Promocional = valor_Promocional;
	}
	
//---------------------------------MÉTODO------------------------------------------------
	
	
	public double CalculoDesconto (double valor_Pedido) {
		return this.valor_Pedido * 0.10;
		
	}


}
