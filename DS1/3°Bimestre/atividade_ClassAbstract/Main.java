package atividade1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		String resposta;
		
		do {
		
//-------------------------LOSANGO-----------------------------
		
		System.out.println("LOSANGO");
		System.out.println();
				
		double diagonalMaior;
		double diagonalMenor;
				
		System.out.println("Escreva o valor da maior diagonal do losango:");
		diagonalMaior = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da menor diagonal do losango:");
		diagonalMenor = ler.nextDouble();
				
				
		//**APRESENTA��O**
		Losango Losango1 = new Losango(diagonalMaior, diagonalMenor);
		System.out.println("A �rea do losango �: ");
		Losango1.resultado();
						
		System.out.println();
		System.out.println();
				
//-------------------------TRAP�ZIO-----------------------------
				
		System.out.println("TRAP�ZIO");
		System.out.println();
			
		double baseMaior;
		double baseMenor;
		double altura;
				
		System.out.println("Escreva o valor da maior base do trap�zio:");
		baseMaior = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da menor base do trap�zio:");
		baseMenor = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da altura do trap�zio:");
		altura = ler.nextDouble();
				
		//**APRESENTA��O**
		Trapezio Trapezio1 = new Trapezio(baseMaior, baseMenor, altura);
		System.out.println("A �rea do trap�zio �: ");
		Trapezio1.resultado();
				
		System.out.println();
		System.out.println();
				
//-------------------------TRI�NGULO-----------------------------
				
		System.out.println("TRI�NGULO");
		System.out.println();
				
		double base;
			
				
		System.out.println("Escreva o valor da base do tri�ngulo:");
		base = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da altura do tri�ngulo:");
		altura = ler.nextDouble();
				
		//**APRESENTA��O**
		Triangulo Triangulo1 = new Triangulo(base, altura);
		System.out.println("A �rea do tri�ngulo �: ");
		Triangulo1.resultado();
				
		System.out.println();
		System.out.println();
		
//-------------------------LA�O_DE_REPETI��O-----------------------------
		
		System.out.println("Deseja calcular a �rea de mais formas geom�tricas ? Responda com sim ou n�o.");
		resposta = ler.next();
		
		}while(resposta.equals("sim"));

	}
		

}
