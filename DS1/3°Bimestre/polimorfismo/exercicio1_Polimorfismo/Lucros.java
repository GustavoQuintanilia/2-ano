package exercicio1_Polimorfismo;

public class Lucros {
	private double soma;
	
//------------------------M�TODOS-----------------------------
	public void registra(Conta c) {
		soma += c.getSaldo();
	}
//-----------------------------------------------------
	
	public double getSoma() {
		return soma;
	}
	
	
	
}
