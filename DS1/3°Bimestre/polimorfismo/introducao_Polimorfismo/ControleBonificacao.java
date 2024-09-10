package polimorfismo_Exemplo;
//Classe Para controlar os gastos da empresa com Bonifica��o
public class ControleBonificacao {
	//atributo soma, serve para somar cada uma das bonifica��es
	private double soma;
	
	//M�todo que recebe como parametro um objeto do tipo funcionario
	public void registra(Funcionario f) {
		//executando o getBonifica��o especifico de cada funcionario e armazenando o valor dentro
		double boni = f.getBonificacao();
		
		// somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni;
	}
	
	//m�todo getSoma();
	public double getSoma() {
		
		return this.soma;
	}
}
