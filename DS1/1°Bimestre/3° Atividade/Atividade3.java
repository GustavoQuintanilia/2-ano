package atividade3;
import java.util.Scanner;
public class Atividade3 {
	String nome;
	int idade;
	double peso;
	double altura;
	
	String escrevaNome() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = in.next();
		return nome;
	}
	
	int escrevaIdade() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = in.nextInt();
		return idade;
	}
	
	double escrevaPeso() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu peso?");
		peso = in.nextDouble();
		return peso;
	}
	
	double escrevaAltura() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a sua altura? (Em metros)");
		altura = in.nextDouble();
		return altura;
	}
	
	
	
	double calculoImc() {
		double imc;
		imc = peso/(altura*altura);
		return imc;
	}
	
	String tipoPeso() {
		double imc = peso/(altura*altura);
		if (imc<18.5) {
			return "Você está abaixo do peso imc.";
		} else if (imc<=24.9) {
			return "Você está com peso normal imc.";
		}else if (imc<=29.9) {
			return "Você está com sobrepeso imc.";
		}else if (imc<=34.9) {
			return "Você está com obesidade grau 1 imc.";
		} else if (imc<=39.9) {
			return "Você está com obesidade grau 2 imc.";
		} else {
			return "Você está com obesidade grau 3 imc.";
		}
	}
	
	
	

}

