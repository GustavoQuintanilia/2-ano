package exercicio_Fixacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
//----------------------------------CONTA GEN�RICA-------------------------------------------
		
		ContaGenerica contaGenerica1 = new ContaGenerica("Mois�s Nascimento", "111999333-29", 234, 10500);
		
		System.out.println("CONTAS BANC�RIAS GEN�RICAS:");
		System.out.println();
		
		System.out.println(contaGenerica1.getNome()+", seu saldo atual � de R$"+contaGenerica1.getSaldo());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		contaGenerica1.depositar(in.nextDouble());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		contaGenerica1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+contaGenerica1.getNome());
		System.out.println("CPF: "+contaGenerica1.getCpf());
		System.out.println("N�mero da conta: "+contaGenerica1.getNumeroConta());
		contaGenerica1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
//----------------------------------CONTA CORRETE-------------------------------------------
		
		ContaCorrente contaCorrente1 = new ContaCorrente("Gustavo Quintanilia", "999666333-21", 506, 15400, 0);
		
		System.out.println("CONTAS CORRENTES:");
		System.out.println();
		
		System.out.println(contaCorrente1.getNome()+", seu saldo atual � de R$"+contaCorrente1.getSaldo());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		contaCorrente1.depositar(in.nextDouble());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		contaCorrente1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+contaCorrente1.getNome());
		System.out.println("CPF: "+contaCorrente1.getCpf());
		System.out.println("N�mero da conta: "+contaCorrente1.getNumeroConta());
		contaCorrente1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
//----------------------------------CONTA POUPAN�A-------------------------------------------	
		
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Vittor Sirqueira", "222444777-98", 990, 90000, 0);
		
		System.out.println("CONTAS CORRENTES:");
		System.out.println();
		
		System.out.println(contaPoupanca1.getNome()+", seu saldo atual � de R$"+contaPoupanca1.getSaldo());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja depositar: ");
		contaPoupanca1.depositar(in.nextDouble());
		System.out.println();
		
		//----------------------------------------------------------------------		
		System.out.println("Qual quantia deseja sacar: ");
		contaPoupanca1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------	
		System.out.println("Nome: "+contaPoupanca1.getNome());
		System.out.println("CPF: "+contaPoupanca1.getCpf());
		System.out.println("N�mero da conta: "+contaPoupanca1.getNumeroConta());
		contaPoupanca1.imprimirSaldo();
		System.out.println("Saldo com taxa de rendimento mensal: "+contaPoupanca1.saldoRendimento());

	}

}
