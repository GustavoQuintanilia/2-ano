package exercicio1_Polimorfismo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// TODO Auto-generated method stub
		
//----------------------------------CONTA-------------------------------------------
		Conta conta1 = new Conta();
		
		System.out.println("CONTAS");
		System.out.println();
		
		System.out.println("Escreva os dados necessários: ");
		System.out.println();
		
		System.out.print("Nome:");
		conta1.setNome(in.next());
		//-------------------------
		System.out.print("CPF:");
		conta1.setCpf(in.next());
		//-------------------------
		System.out.print("Número da conta:");
		conta1.setNumeroConta(in.next());
		//-------------------------
		conta1.setSaldo(1500);
		//-------------------------
		conta1.depositar(in.nextDouble());
		

	}

}
