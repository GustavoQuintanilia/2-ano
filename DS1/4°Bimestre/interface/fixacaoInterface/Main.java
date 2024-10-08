package exercicio_Fixacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
//----------------------------------CONTA GENÉRICA COM INTERFACE-------------------------------------------
		Conta conta1 = new ContaGenerica();
		
		System.out.println("CONTAS BANCÁRIAS GENÉRICAS:");
		System.out.println();
	
			
		//-----------------------------------nome-----------------------------------
		System.out.print("Digite o seu nome:");
		conta1.setNome(in.nextLine());
		System.out.println();
		
		//------------------------------------CPF----------------------------------
		System.out.print("Digite o seu CPF:");
		conta1.setCpf(in.nextLine());
		System.out.println();
				
		//------------------------------------Nº Conta----------------------------------
		System.out.print("Digite número da conta:");
		conta1.setNumeroConta(in.nextInt());
		System.out.println();
		
		//------------------------------------Saldo----------------------------------
		conta1.setSaldo(11700);
		
		//-----------------------------------depositar-----------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		conta1.depositar(in.nextDouble());
		System.out.println();
		
		//------------------------------------sacar----------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		conta1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+conta1.getNome());
		System.out.println("CPF: "+conta1.getCpf());
		System.out.println("Número da conta: "+conta1.getNumeroConta());
		conta1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
		
//----------------------------------CONTA GENÉRICA-------------------------------------------
		Conta conta2 = new ContaGenerica();
		
		System.out.println("CONTAS BANCÁRIAS GENÉRICAS:");
		System.out.println();
		
		//-----------------------------------nome-----------------------------------
		System.out.print("Digite o seu nome:");
		conta2.setNome(in.next()+in.nextLine());
		System.out.println();
				
		//------------------------------------CPF----------------------------------
		System.out.print("Digite o seu CPF:");
		conta2.setCpf(in.nextLine());
		System.out.println();
						
		//------------------------------------Nº Conta----------------------------------
		System.out.print("Digite número da conta:");
		conta2.setNumeroConta(in.nextInt());
		System.out.println();
				
		//------------------------------------Saldo----------------------------------
		conta2.setSaldo(10500);
		
		//-----------------------------------depositar-----------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		conta2.depositar(in.nextDouble());
		System.out.println();
		
		//------------------------------------sacar----------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		conta2.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+conta2.getNome());
		System.out.println("CPF: "+conta2.getCpf());
		System.out.println("Número da conta: "+conta2.getNumeroConta());
		conta2.imprimirSaldo();
		
		System.out.println();
		System.out.println();
		
//----------------------------------CONTA CORRETE-------------------------------------------
		ContaCorrente contaCorrente1 = new ContaCorrente();
		
		System.out.println("CONTAS CORRENTES:");
		System.out.println();
		
		//-----------------------------------nome-----------------------------------
		System.out.print("Digite o seu nome:");
		contaCorrente1.setNome(in.next()+in.nextLine());
		System.out.println();
						
		//------------------------------------CPF----------------------------------
		System.out.print("Digite o seu CPF:");
		contaCorrente1.setCpf(in.nextLine());
		System.out.println();
								
		//------------------------------------Nº Conta----------------------------------
		System.out.print("Digite número da conta:");
		contaCorrente1.setNumeroConta(in.nextInt());
		System.out.println();
						
		//------------------------------------Saldo----------------------------------
		contaCorrente1.setSaldo(15400);
		
		
		//-----------------------------------depositar-----------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		contaCorrente1.depositar(in.nextDouble());
		System.out.println();
		
		contaCorrente1.getLimiteEspecial();
		System.out.println();
		
		//------------------------------------sacar----------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		contaCorrente1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+contaCorrente1.getNome());
		System.out.println("CPF: "+contaCorrente1.getCpf());
		System.out.println("Número da conta: "+contaCorrente1.getNumeroConta());
		contaCorrente1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
//----------------------------------CONTA POUPANÇA-------------------------------------------	
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		
		System.out.println("CONTAS CORRENTES:");
		System.out.println();
		
		//-----------------------------------nome-----------------------------------
		System.out.print("Digite o seu nome:");
		contaPoupanca1.setNome(in.next()+in.nextLine());
		System.out.println();
						
		//------------------------------------CPF----------------------------------
		System.out.print("Digite o seu CPF:");
		contaPoupanca1.setCpf(in.nextLine());
		System.out.println();
								
		//------------------------------------Nº Conta----------------------------------
		System.out.print("Digite número da conta:");
		contaPoupanca1.setNumeroConta(in.nextInt());
		System.out.println();
						
		//------------------------------------Saldo----------------------------------
		contaPoupanca1.setSaldo(90000);
		
		//-----------------------------------depositar-----------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		contaPoupanca1.depositar(in.nextDouble());
		System.out.println();
		
		//------------------------------------sacar----------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		contaPoupanca1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+contaPoupanca1.getNome());
		System.out.println("CPF: "+contaPoupanca1.getCpf());
		System.out.println("Número da conta: "+contaPoupanca1.getNumeroConta());
		contaPoupanca1.imprimirSaldo();
		System.out.println("Saldo com taxa de rendimento mensal: "+contaPoupanca1.saldoRendimento());

	}

}
