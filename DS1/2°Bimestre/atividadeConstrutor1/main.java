
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
//---------------------------------------1° CALCULADORA-------------------------------------------------
		System.out.println("1º Calculadora:");
		
		Calculadora calc1 =  new Calculadora();
		
		System.out.println("Escreva o 1º valor inteiro: ");
		int intValor1 = scan.nextInt();
		

		System.out.println("Escreva o 2º valor inteiro: ");
		int intValor2 = scan.nextInt();
		
		
		
		System.out.println("Escreva o 1º valor decimal: ");
		double doubleValor1 = scan.nextDouble();
		
		
		System.out.println("Escreva o 2º valor decimal: ");
		double doubleValor2 = scan.nextDouble();
		
		
		int[] intValores = {2,8,9,7,5};
		double[] doubleValores = {5.5, 4.3, 8.2, 6.9}; 
		
		
		calc1.setNome("Primeira calculadora");
		
		
		
		System.out.println("");
		System.out.println("Nome: "+ calc1.getNome()+".");
		
		//SOMA
		
		
		calc1.sum(intValor1, intValor2);
		System.out.println("Soma (inteiro): "+ calc1.getResultado());
		
		
		
		calc1.sum(doubleValor1, doubleValor2);
		System.out.println("Soma (decimal): "+ calc1.getResultado());
		
		
		
		calc1.sum(intValores);
		System.out.println("Soma com vetor (inteiro): "+calc1.getResultado());
		
	
		calc1.sum(doubleValores);
		System.out.println("Soma com vetor (decimal): "+calc1.getResultado());
		
		
		//SUBTRAÇÃO
		
	
		calc1.sub(intValor1, intValor2);
		System.out.println("Subtração (inteiro): "+calc1.getResultado());
		
		
	
		calc1.sub(doubleValor1, doubleValor2);
		System.out.println("Subtração (decimal): "+calc1.getResultado());
		
		

		calc1.sub(intValores);
		System.out.println("Subtração com vetor (inteiro): "+calc1.getResultado());
		
		

		calc1.sub(doubleValores);
		System.out.println("Subtração com vetor (decimal): "+calc1.getResultado());
		
//---------------------------------------2° CALCULADORA-------------------------------------------------
		
		System.out.println("");
		System.out.println("2º Calculadora:");
		
		Calculadora calc2 =  new Calculadora("Segunda Calculadora");
		
		System.out.println("Escreva o 1º valor inteiro: ");
		int iValor1 = scan.nextInt();
		

		System.out.println("Escreva o 2º valor inteiro: ");
		int iValor2 = scan.nextInt();
		
		
		
		System.out.println("Escreva o 1º valor decimal: ");
		double dValor1 = scan.nextDouble();
		
		
		System.out.println("Escreva o 2º valor decimal: ");
		double dValor2 = scan.nextDouble();
		
		int[] intV = {5,4,2,6,5};
		double[] doubleV = {4.6, 5.9, 9.1, 2.3}; 
		
		
		System.out.println("");
		System.out.println("Nome: "+ calc2.getNome()+".");
		
		//SOMA
		
		calc2.sum(iValor1, iValor2);
		System.out.println("Soma (inteiro): "+ calc2.getResultado());
		
		
		
		calc2.sum(dValor1, dValor2);
		System.out.println("Soma (decimal): "+ calc2.getResultado());
		
		
		
		calc2.sum(intV);
		System.out.println("Soma com vetor (inteiro): "+calc2.getResultado());
		
	
		calc2.sum(doubleV);
		System.out.println("Soma com vetor (decimal): "+calc2.getResultado());
		
		//SUBTRAÇÃO
		
		calc2.sub(iValor1, iValor2);
		System.out.println("Subtração (inteiro): "+calc2.getResultado());
		
		
	
		calc2.sub(dValor1, dValor2);
		System.out.println("Subtração (decimal): "+calc2.getResultado());
		
		

		calc2.sub(intV);
		System.out.println("Subtração com vetor (inteiro): "+calc2.getResultado());
		
		

		calc2.sub(doubleV);
		System.out.println("Subtração com vetor (decimal): "+calc2.getResultado());

		
		
	
	}

}
