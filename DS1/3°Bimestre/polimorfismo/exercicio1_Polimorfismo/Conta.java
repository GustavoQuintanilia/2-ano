package exercicio1_Polimorfismo;

public class Conta {
	private String nome;
	private String cpf;
	private String numeroConta;
	private double saldo;

	
//------------------------CONSTRUTORES-----------------------------	
	public Conta() {
		
	}
	
	public Conta(String nome, String cpf, String numeroConta, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
		
//------------------------ATRIBUTOS-----------------------------		
//----------------------------------------	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		 this.nome = nome;
	}
//----------------------------------------	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
//----------------------------------------	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
//----------------------------------------	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
//------------------------MÉTODOS-----------------------------	
	public double depositar(double quantia) {
		return saldo = saldo + quantia;
	}
	
//----------------------------------------	
	
	public void sacar(double quantia) {
		if(saldo < quantia) {
			System.out.println("Você não tem saldo o suficiente para fazer este saque!");
		}else {
			saldo = saldo - quantia;
		}
		
	}
	
//----------------------------------------	

	public void imprimirSaldo(){	
		
		System.out.println("Saldo: "+this.getSaldo());
		
	}
	
//	System.out.println("Nome: "+this.getNome());
//	System.out.println("CPF:"+this.getCpf());
//	System.out.println("Número da Conta: "+this.getNumeroConta());
}


