package exercicio_Fixacao;

public class ContaPoupanca extends ContaGenerica{
	private double percentualRendimento;

//-----------------------CONSTRUTORES----------------------
	public ContaPoupanca() {
		super();
		
	}

	public ContaPoupanca(String nome, String cpf, int numeroConta, double saldo, double percentualRendimento) {
		super(nome, cpf, numeroConta, saldo);
		this.percentualRendimento = 0.02;
	}
	
//-----------------------ATRIBUTOS----------------------
//------------------------------------------
	public double getPercentualRendimento() {
		return this.percentualRendimento;
		
	}

	public void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}
	
//-----------------------MÉTODOS----------------------
	
	public double saldoRendimento () {
		return getSaldo() + (getSaldo() * percentualRendimento);
	}
	
}
