package exercicio1_Polimorfismo;

public class ContaPoupanca extends Conta{
	private double percentualRendimento = 0.01;
	
//------------------------CONSTRUTORES-----------------------------
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}

	
//------------------------ATRIBUTOS-----------------------------
//----------------------------------------
	public double getPercentualRendimento() {
		return percentualRendimento;
	}
	
	
	public void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
		
	}
	
//------------------------MÉTODOS-----------------------------

	public double atualizarSaldo() {
		return getSaldo() + (getSaldo() * percentualRendimento);
	}
	

}
