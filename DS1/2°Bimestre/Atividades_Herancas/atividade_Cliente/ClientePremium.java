package teste_Heranca2;

public class ClientePremium extends cliente  {
	
//---------------------------------------------------------------------------------
	
	@Override
	
	public double getValor_Promocional () {
		return super.getValor_Pedido() - (super.getValor_Pedido() * 0.15);
	}
	

//---------------------------------------------------------------------------------
	
	@Override
	
	public double CalculoDesconto (double valor_Pedido) {
		return super.getValor_Pedido() * 0.15;
		
	}


}
