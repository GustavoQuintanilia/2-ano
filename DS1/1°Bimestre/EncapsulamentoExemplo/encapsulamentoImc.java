package imcEncapsulamento;
import java.util.Scanner;
public class encapsulamentoImc {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	String getEscrevaNome() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		nome = in.next();
		return this.nome;
	}
	
	void setEscrevaNome (String nome) {
		this.nome = nome;
	}
	
	int getEscrevaIdade() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		idade = in.nextInt();
		return this.idade;
	}
	
	void setEscrevaIdade (int idade) {
		this.idade = idade;
	}
	
	double getEscrevaPeso() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu peso?");
		peso = in.nextDouble();
		return this.peso;
	}
	
	void setEscrevaPeso (double peso) {
		this.peso = peso;
	}

	
	double getEscrevaAltura() {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual a sua altura? (Em metros)");
		altura = in.nextDouble();
		return this.altura;
	}
	
	void setEscrevaAltura (double altura) {
		this.altura = altura;
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
