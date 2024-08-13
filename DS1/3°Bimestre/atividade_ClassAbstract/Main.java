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
				
				
		//**APRESENTAÇÃO**
		Losango Losango1 = new Losango(diagonalMaior, diagonalMenor);
		System.out.println("A área do losango é: ");
		Losango1.resultado();
						
		System.out.println();
		System.out.println();
		
//-------------------------QUADRADO-----------------------------
		
		System.out.println("QUADRADO");
		System.out.println();
				
		double lado;
			
				
		System.out.println("Escreva o valor do lado do seu quadrado:");
		lado = ler.nextDouble();
				
		//**APRESENTAÇÃO**
		Quadrado Quadrado1 = new Quadrado(lado);
		System.out.println("A área do Quadrado é: ");
		Quadrado1.resultado();
				
		System.out.println();
		System.out.println();
		
//-------------------------RETÂNGULO-----------------------------
		
		System.out.println("RETÂNGULO");
		System.out.println();
				
		double base;
		double altura;
			
				
		System.out.println("Escreva o valor da base do retângulo:");
		base = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da altura do retângulo:");
		altura = ler.nextDouble();
				
		//**APRESENTAÇÃO**
		Retangulo Retangulo1 = new Retangulo(base, altura);
		System.out.println("A área do retângulo é: ");
		Retangulo1.resultado();
				
		System.out.println();
		System.out.println();
		
//-------------------------TRAPÉZIO-----------------------------
				
		System.out.println("TRAPÉZIO");
		System.out.println();
			
		double baseMaior;
		double baseMenor;
				
		System.out.println("Escreva o valor da maior base do trapézio:");
		baseMaior = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da menor base do trapézio:");
		baseMenor = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da altura do trapézio:");
		altura = ler.nextDouble();
				
		//**APRESENTAÇÃO**
		Trapezio Trapezio1 = new Trapezio(baseMaior, baseMenor, altura);
		System.out.println("A área do trapézio é: ");
		Trapezio1.resultado();
				
		System.out.println();
		System.out.println();
				
//-------------------------TRIÂNGULO-----------------------------
				
		System.out.println("TRIÂNGULO");
		System.out.println();

			
				
		System.out.println("Escreva o valor da base do triângulo:");
		base = ler.nextDouble();
				
		System.out.println();
				
		System.out.println("Escreva o valor da altura do triângulo:");
		altura = ler.nextDouble();
				
		//**APRESENTAÇÃO**
		Triangulo Triangulo1 = new Triangulo(base, altura);
		System.out.println("A área do triângulo é: ");
		Triangulo1.resultado();
				
		System.out.println();
		System.out.println();
		
//-------------------------LAÇO_DE_REPETIÇÃO-----------------------------
		
		System.out.println("Deseja calcular a área de mais formas geométricas ? Responda com sim ou não.");
		resposta = ler.next();
		
		}while(resposta.equals("sim"));

	}
		

}
