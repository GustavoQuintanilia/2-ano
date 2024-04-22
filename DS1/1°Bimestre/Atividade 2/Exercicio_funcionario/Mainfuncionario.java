package ds_Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario primeiroPedro = new Funcionario();
		primeiroPedro.salarioBruto = 3481.66;
		System.out.println("Funcionário Pedro, o seu sálario líquido é: R$"+primeiroPedro.salarioLiquido()+".");
		System.out.println("Funcionário Pedro, o seu salário bruto com o aumento é: R$"+primeiroPedro.aumentaSalario()+".");
		System.out.println();



		Funcionario segundoVagner = new Funcionario();
		segundoVagner.salarioBruto = 3740.92;
		System.out.println("Funcionário Vagner, o seu sálario líquido é: R$"+segundoVagner.salarioLiquido()+".");
		System.out.println("Funcionário Vagner, o seu salário bruto com o aumento é: R$"+segundoVagner.aumentaSalario()+".");


	}

}
