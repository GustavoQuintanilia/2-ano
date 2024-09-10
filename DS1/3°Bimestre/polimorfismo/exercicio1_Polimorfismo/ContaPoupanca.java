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
	
	
	public void setPercentualRendimento() {
		this.percentualRendimento = percentualRendimento;
		
	}
	
//------------------------M�TODOS-----------------------------

	public double atualizarSaldo(double saldo, double percentualRendimento) {
		return saldo = saldo + (saldo * percentualRendimento);
	}
	

}
