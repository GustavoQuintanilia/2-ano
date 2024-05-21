package teste_heranca;

public class veiculo {
	
	private String marca; 
	private String modelo;
	private int ano;
	private String cor;
	
//-------------------------------------------------------------------------//
	public String getMarca () {
		 return this.marca;
	 }
 
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
//-------------------------------------------------------------------------//
	public String getModelo () {
		return this.modelo;
	}

	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
//-------------------------------------------------------------------------//	
	public int getAno () {
		return this.ano;
	}
	
	public void setAno (int ano) {
		this.ano = ano;
	}
//-------------------------------------------------------------------------//
	public String getCor() {
		return this.cor;
	}
	public void setCor (String cor) {
		this.cor = cor;
	}
	
}
