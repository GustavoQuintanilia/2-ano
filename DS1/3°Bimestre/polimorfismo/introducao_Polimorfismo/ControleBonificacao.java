package polimorfismo_Exemplo;
//Classe Para controlar os gastos da empresa com Bonificação
public class ControleBonificacao {
	//atributo soma, serve para somar cada uma das bonificações
	private double soma;
	
	//Método que recebe como parametro um objeto do tipo funcionario
	public void registra(Funcionario f) {
		//executando o getBonificação especifico de cada funcionario e armazenando o valor dentro
		double boni = f.getBonificacao();
		
		// somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni;
	}
	
	//método getSoma();
	public double getSoma() {
		
		return this.soma;
	}
}
