package exercicio_Fixacao;

public class ContaGenerica implements Conta{
	private String nome;
	private String cpf;
	private int numeroConta;
	private double saldo;
	
//-----------------------CONSTRUTORES----------------------
	public ContaGenerica() {
		
	}
	
	public ContaGenerica(String nome, String cpf, int numeroConta, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

//-----------------------ATRIBUTOS----------------------
	
	public String getNome() {
		return this.nome;
		
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
//---------------------------------------------
	
	public String getCpf() {
		return this.cpf;
		
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
//---------------------------------------------
	
	public int getNumeroConta() {
		return this.numeroConta;
		
	}
	
	public void setNumeroConta (int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
//---------------------------------------------
	
	public double getSaldo () {
		return this.saldo;
		
	}
	

	public void setSaldo (double saldo) {
		this.saldo = saldo;
		
	}

//-----------------------MÉTODOS----------------------
	
	public double depositar(double valor) {
		return saldo = saldo + valor;
		
	}
	
//---------------------------------------------
	public void sacar(double valor) {
		if(saldo < valor) {
			
			System.out.println("Seu saldo no banco é insuficiente para este saque!");
			
		}else {
			
			saldo = saldo - valor;
			
		}
		
	}
//---------------------------------------------
	public void imprimirSaldo() {
		System.out.println("Saldo da conta: R$"+this.getSaldo());
		
	}

	

}
