package encapsulamento;

import encapsulamento.produto;
import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.0");
		
		produto produtoPrimeiro = new produto();
		System.out.println("Produto 1: ");
		produtoPrimeiro.setNome("");
		produtoPrimeiro.setPrecoCusto(0.00);
		produtoPrimeiro.setPrecoVenda(0.00);
		produtoPrimeiro.calcularMargemLucro(produtoPrimeiro.getPrecoVenda(), produtoPrimeiro.getPrecoCusto());
	
		
		System.out.println("");
		System.out.println("Nome do produto: "+produtoPrimeiro.getNome());
		System.out.println("Preço de custo: R$"+produtoPrimeiro.getPrecoCusto());
		System.out.println("Preço de Venda: R$"+produtoPrimeiro.getPrecoVenda());
		System.out.println("Margem de Lucro: R$"+produtoPrimeiro.getMargemLucro());
		System.out.println("Margem de Lucro em porcentagem: "+deci.format(produtoPrimeiro.getPorcentagemMargemLucro())+"%");
		System.out.println("");
		
//------------------------------------------------------------------------------------------------------------------------------------------
		
		produto produtoSegundo = new produto();
		System.out.println("Produto 2: ");
		produtoSegundo.setNome("");
		produtoSegundo.setPrecoCusto(0.00);
		produtoSegundo.setPrecoVenda(0.00);
		produtoSegundo.calcularMargemLucro(produtoSegundo.getPrecoVenda(), produtoSegundo.getPrecoCusto());
	
		
		System.out.println("");
		System.out.println("Nome do produto: "+produtoSegundo.getNome());
		System.out.println("Preço de custo: R$"+produtoSegundo.getPrecoCusto());
		System.out.println("Preço de Venda: R$"+produtoSegundo.getPrecoVenda());
		System.out.println("Margem de Lucro: R$"+produtoSegundo.getMargemLucro());
		System.out.println("Margem de Lucro em porcentagem: "+deci.format(produtoSegundo.getPorcentagemMargemLucro())+"%");
		System.out.println("");
		
//------------------------------------------------------------------------------------------------------------------------------------------		
		
		produto produtoTerceiro = new produto();
		System.out.println("Produto 3: ");
		produtoTerceiro.setNome("");
		produtoTerceiro.setPrecoCusto(0.00);
		produtoTerceiro.setPrecoVenda(0.00);
		produtoTerceiro.calcularMargemLucro(produtoTerceiro.getPrecoVenda(), produtoTerceiro.getPrecoCusto());


		System.out.println("");
		System.out.println("Nome do produto: "+produtoTerceiro.getNome());
		System.out.println("Preço de custo: R$"+produtoTerceiro.getPrecoCusto());
		System.out.println("Preço de Venda: R$"+produtoTerceiro.getPrecoVenda());
		System.out.println("Margem de Lucro: R$"+produtoTerceiro.getMargemLucro());
		System.out.println("Margem de Lucro em porcentagem: "+deci.format(produtoTerceiro.getPorcentagemMargemLucro())+"%");
		System.out.println("");

	}

}
