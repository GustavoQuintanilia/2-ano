package encapsulamento;
import java.util.Scanner;
public class produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
//----------------------------------------------------------------------------------	
	
String getNome() {
	return this.nome;
}
	
void setNome (String nome) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o nome do produto?");
	nome = in.next();
	this.nome = nome;
}
	
//----------------------------------------------------------------------------------
	
double getPrecoCusto() {
		return this.precoCusto;
}
	
void setPrecoCusto (double PrecoCusto) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o preço de custo?");
	precoCusto = in.nextDouble();

	this.precoCusto = precoCusto;
}
	
//----------------------------------------------------------------------------------	
	
double getPrecoVenda() {
	
	return this.precoVenda;
}
	
void setPrecoVenda (Double precoVenda) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o preço de venda?");
	precoVenda = in.nextDouble();
	
		
if (precoVenda < precoCusto) {
	System.out.println("ATENÇÃO!!!");
	System.out.println("O PREÇO DE VENDA NÃO PODE SER INFERIOR AO PREÇO DE CUSTO.");
			
}

this.precoVenda = precoVenda;
			
}
	
//----------------------------------------------------------------------------------	
	
double getMargemLucro() {
	
	return this.margemLucro;
	
}
	

void calcularMargemLucro(double precoVenda, double precoCusto) {
	this.margemLucro = precoVenda - precoCusto;
}

double getPorcentagemMargemLucro() {
	return margemLucro = (margemLucro/precoCusto)*100;
}



}
