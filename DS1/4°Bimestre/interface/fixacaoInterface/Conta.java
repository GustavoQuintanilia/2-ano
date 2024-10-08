package exercicio_Fixacao;

public interface Conta {
//-----------------------------ATRIBUTOS--------------------------------
//Nome
	String getNome();
	void setNome(String nome);
		
		
//CPF	
	String getCpf();
	void setCpf(String cpf);
		
		
//Numero da conta	
	int getNumeroConta();
	void setNumeroConta(int numeroConta);

		
//Saldo
	double getSaldo();
	void setSaldo(double saldo);
		
//-----------------------------ATRIBUTOS--------------------------------
		
//Depositar
	double depositar(double valor);
		

//Sacar
	void sacar(double valor);
		
		
//Imprimir o Saldo
	void imprimirSaldo();
		

}
