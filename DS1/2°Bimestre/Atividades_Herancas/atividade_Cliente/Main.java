package teste_Heranca2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//--------------------------------CLIENTE NORMAL-----------------------------------------//
		
		cliente cliente1 = new cliente();
		
		System.out.println("CLIENTE NORMAL:");
		System.out.println();
		
		System.out.println("Cliente 1");
		
		cliente1.setNome("Lucas Fernandes");
		cliente1.setIdade(24);
		cliente1.setEndereco("Rua Guanabara");
		cliente1.setValor_Pedido(300.00);
		
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Idade: "+cliente1.getIdade()+" anos");
		System.out.println("Endereço: "+cliente1.getEndereco());
		System.out.println("Valor Original: R$ "+cliente1.getValor_Pedido());
		System.out.println("Desconto aplicado (10%): R$ "+cliente1.CalculoDesconto(cliente1.getValor_Pedido()));
		System.out.println("Valor com o desconto aplicado: R$ "+cliente1.getValor_Promocional());
		System.out.println();
		
		//--------------------------------------
		
		cliente cliente2 = new cliente();
		
		System.out.println("Cliente 2");
		
		cliente2.setNome("Gabriela Luana");
		cliente2.setIdade(40);
		cliente2.setEndereco("Rua das Pedras");
		cliente2.setValor_Pedido(270.00);
		
		System.out.println("Nome: "+cliente2.getNome());
		System.out.println("Idade: "+cliente2.getIdade()+" anos");
		System.out.println("Endereço: "+cliente2.getEndereco());
		System.out.println("Valor Original: R$ "+cliente2.getValor_Pedido());
		System.out.println("Desconto aplicado (10%): R$ "+cliente2.CalculoDesconto(cliente2.getValor_Pedido()));
		System.out.println("Valor com o desconto aplicado: R$ "+cliente2.getValor_Promocional());
		System.out.println();
		System.out.println();
		
//--------------------------------CLIENTE PREMIUM-----------------------------------------//
		
		ClientePremium cliente3 = new ClientePremium();
		
		System.out.println("CLIENTE PREMIUM:");
		System.out.println();
		
		System.out.println("Cliente 3");
		
		cliente3.setNome("Gustavo Renan");
		cliente3.setIdade(35);
		cliente3.setEndereco("Rua do Lazer");
		cliente3.setValor_Pedido(450.00);
		
		System.out.println("Nome: "+cliente3.getNome());
		System.out.println("Idade: "+cliente3.getIdade()+" anos");
		System.out.println("Endereço: "+cliente3.getEndereco());
		System.out.println("Valor Original: R$ "+cliente3.getValor_Pedido());
		System.out.println("Desconto aplicado (15%): R$ "+cliente3.CalculoDesconto(cliente3.getValor_Pedido()));
		System.out.println("Valor com o desconto aplicado: R$ "+cliente3.getValor_Promocional());
		System.out.println();
		
		//--------------------------------------
		
		ClientePremium cliente4 = new ClientePremium();
		
		System.out.println("Cliente 4");
		
		cliente4.setNome("Rogério Silva");
		cliente4.setIdade(56);
		cliente4.setEndereco("Rua Gonçalo de Carvalho");
		cliente4.setValor_Pedido(190.00);
		
		System.out.println("Nome: "+cliente4.getNome());
		System.out.println("Idade: "+cliente4.getIdade()+" anos");
		System.out.println("Endereço: "+cliente4.getEndereco());
		System.out.println("Valor Original: R$ "+cliente4.getValor_Pedido());
		System.out.println("Desconto aplicado (15%): R$ "+cliente4.CalculoDesconto(cliente4.getValor_Pedido()));
		System.out.println("Valor com o desconto aplicado: R$ "+cliente4.getValor_Promocional());
		

	}

}
