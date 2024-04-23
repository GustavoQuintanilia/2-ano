
public class Calculadora {
	private String nome;
	private double resultado;
	
//---------------------------------Construtor---------------------------------------
	public Calculadora (){
		
	}
	
	public Calculadora (String nome) {
		this.nome = nome; 
	}
	
	public String getNome() { 
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
//------------------------------------------------------------------------
	
	public double getResultado() { 
		return resultado;
	}
	
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
//------------------------------------------------------------------------
	
	public void sum(int v1, int v2) {
		resultado = (double) (v1 + v2);
		
	}
	
	public void sum(double v1, double v2) {
		resultado = v1 + v2;
	}
	
	public void sum(int[] val) {
		int resultado = 0;
		
		for(int valor : val) {
			resultado += valor;
			
		}
		
		this.resultado = (double) resultado;
	}

	public void sum(double[] val) {
		double resultado = 0;
		
		for(double valor : val) {
			resultado += valor;
			
		}
		
		this.resultado = resultado;
	}
	
//------------------------------------------------------------------------
	
	public void sub(int v1, int v2) {
		resultado = 0;
		resultado = v1 - v2;
		
	}
	
	public void sub(double v1, double v2) {
		resultado = 0;
		resultado = v1 - v2;
		
	}
	
	public void sub(int[] val) {
		int resultado = val[0];
		
		for(int i = 1; i <= val.length - 1; i++) {
			resultado -= val[i];
			
		}
		this.resultado = (double) resultado;
	
	}
	
	public void sub(double[] val) {
		double resultado = val[0];
		
		for(int i = 1; i <= val.length - 1; i++) {
			resultado -= val[i];
			
		}
		this.resultado = resultado;
		
	}
}
