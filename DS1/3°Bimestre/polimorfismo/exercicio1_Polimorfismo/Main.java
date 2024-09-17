package exercicio1_Polimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// TODO Auto-generated method stub
		
//----------------------------------CONTA-------------------------------------------
		Conta conta1 = new Conta();
		
		System.out.println("CONTAS:");
		System.out.println();
		
		System.out.println("Escreva os dados necess�rios: ");
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu nome:");
		conta1.setNome(in.nextLine());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu CPF:");
		conta1.setCpf(in.nextLine());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite n�mero da conta:");
		conta1.setNumeroConta(in.nextLine());
		System.out.println();
		
		//-------------------------
		
		conta1.setSaldo(1500);
		//-------------------------
		
		System.out.print("Qual valor voc� quer depositar da sua conta?");
		conta1.depositar(in.nextDouble());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Qual valor voc� quer sacar da sua conta?");
		conta1.sacar(in.nextDouble());
		System.out.println();
	
		
		//------------APRESENTANDO-------------
		System.out.println("Nome: "+conta1.getNome());
		System.out.println("CPF: "+conta1.getCpf());
		System.out.println("N�mero da conta: "+conta1.getNumeroConta());
		conta1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
		
//----------------------------------CONTA CORRENTE-------------------------------------------
		ContaCorrente contaCorrente1 = new ContaCorrente();
		
		System.out.println("CONTAS CORRENTES:");
		System.out.println();
		
		System.out.println("Escreva os dados necess�rios: ");
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu nome:");
		contaCorrente1.setNome(in.next());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu CPF:");
		contaCorrente1.setCpf(in.next());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite n�mero da conta corrente:");
		contaCorrente1.setNumeroConta(in.next());
		System.out.println();
		
		//-------------------------
		
		contaCorrente1.setSaldo(5400);
		
		//-------------------------
		
		contaCorrente1.setTarifaMensal(10);
		
		//-------------------------
		
		System.out.print("Qual valor voc� quer depositar da sua conta corrente?");
		contaCorrente1.depositar(in.nextDouble());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Qual valor voc� quer sacar da sua conta corrente?");
		contaCorrente1.sacar(in.nextDouble());
		System.out.println();
		
		//------------APRESENTANDO-------------
		System.out.println("Nome: "+contaCorrente1.getNome());
		System.out.println("CPF: "+contaCorrente1.getCpf());
		System.out.println("N�mero da conta: "+contaCorrente1.getNumeroConta());
		System.out.println("Tarifa mensal: R$"+contaCorrente1.getTarifaMensal());
		contaCorrente1.imprimirSaldo();
		
		System.out.println();
		System.out.println();
		
//----------------------------------CONTA POUPAN�A-------------------------------------------
		ContaPoupanca contaPoupanca1 = new ContaPoupanca();
		
		System.out.println("CONTAS POUPAN�A:");
		System.out.println();
		
		System.out.println("Escreva os dados necess�rios: ");
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu nome:");
		contaPoupanca1.setNome(in.next());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite o seu CPF:");
		contaPoupanca1.setCpf(in.next());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Digite n�mero da conta poupan�a:");
		contaPoupanca1.setNumeroConta(in.next());
		System.out.println();
		
		//-------------------------
		
		contaPoupanca1.setSaldo(10500);
		
		
		//-------------------------
		
		System.out.print("Qual valor voc� quer depositar da sua conta poupan�a?");
		contaPoupanca1.depositar(in.nextDouble());
		System.out.println();
		
		//-------------------------
		
		System.out.print("Qual valor voc� quer sacar da sua conta poupan�a?");
		contaPoupanca1.sacar(in.nextDouble());
		System.out.println();
	
		
		//------------APRESENTANDO-------------
		System.out.println("Nome: "+contaPoupanca1.getNome());
		System.out.println("CPF: "+contaPoupanca1.getCpf());
		System.out.println("N�mero da conta: "+contaPoupanca1.getNumeroConta());
		contaPoupanca1.imprimirSaldo();
		System.out.println("Saldo com percentual de rendimento (1%): "+contaPoupanca1.atualizarSaldo());
		
		System.out.println();
		System.out.println();
		
		//----------------------------------LUCROS-------------------------------------------
		Lucros lucro1 = new Lucros();
		
		System.out.println("LUCROS:"
				+ "");
		
		lucro1.registra(conta1);
		lucro1.registra(contaCorrente1);
		lucro1.registra(contaPoupanca1);
		
		//------------APRESENTANDO_SOMA-------------
		System.out.println("Soma dos saldos: "+lucro1.getSoma());
		
		
		
	
		

	}

}
