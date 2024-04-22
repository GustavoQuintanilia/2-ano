package ds_Funcionario;

import java.util.Scanner;

public class Funcionario {
	String nome;
	Double salarioBruto;
	Double Imposto;
	
	Double salarioLiquido() {
		Double a = (salarioBruto*15)/100;
		Double salarioLiquido = salarioBruto - a;
		return salarioLiquido;
	}
	Double aumentaSalario() {
		Scanner in = new Scanner(System.in);
		System.out.println("Para aumentar seu salário, informe o valor que você deseja que seja adicionado ao seu salário bruto:");
		Double b = in.nextDouble();
		Double aumentaSalario = salarioBruto + b;
		return aumentaSalario;
	}

}

