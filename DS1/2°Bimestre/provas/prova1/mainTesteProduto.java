package prova1_Ds;

public class mainTesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Produto produtoPrimeiro = new Produto();
		
		System.out.println("1° Produto:");
		
		produtoPrimeiro.setId(1);
		produtoPrimeiro.setNome("Geladeira");
		produtoPrimeiro.setPrecoProduto(29.99);
		
		
		System.out.println("id: "+produtoPrimeiro.getId());
		
		System.out.println("Nome: "+produtoPrimeiro.getNome());
		
		System.out.println("Preço do produto: "+produtoPrimeiro.getPrecoProduto());
		
		System.out.println("Desconto (90%): "+produtoPrimeiro.calcularDesconto(produtoPrimeiro.getPrecoProduto()));
		
		System.out.println("Valor com o desconto aplicado: "+produtoPrimeiro.getDescontoProduto());
		System.out.println();
		
//-----------------------------------------------------------------------------
		
		Produto produtoSegundo = new Produto(2);
		
		System.out.println("2° Produto:");
		
		produtoSegundo.setNome("Fogão");
		produtoSegundo.setPrecoProduto(30.55);
		
		
		System.out.println("id: "+produtoSegundo.getId());
		
		System.out.println("Nome: "+produtoSegundo.getNome());
		
		System.out.println("Preço do produto: "+produtoSegundo.getPrecoProduto());
		
		System.out.println("Desconto (90%): "+produtoSegundo.calcularDesconto(produtoSegundo.getPrecoProduto()));
		
		System.out.println("Valor com o desconto aplicado: "+produtoSegundo.getDescontoProduto());

	}

}
