package teste_heranca;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//--------------------------------Carros-----------------------------------------//
		
		carro veiculo1 = new carro();
		
		System.out.println("CARRO");
		System.out.println("");
		
		System.out.println("1º Veículo");
		
		veiculo1.setMarca("BMW");
		veiculo1.setModelo("BMW i7");
		veiculo1.setAno(2024);
		veiculo1.setCor("Preto Safira");
		veiculo1.setPortas(4);
		
		System.out.println("Marca: "+veiculo1.getMarca()+".");
		System.out.println("Modelo: "+veiculo1.getModelo()+".");
		System.out.println("Ano: "+veiculo1.getAno()+".");
		System.out.println("Cor: "+veiculo1.getCor()+".");
		System.out.println("Quantidade de portas: "+veiculo1.getPortas()+".");
		System.out.println("");
		
		//-----------------------------------
		
		carro veiculo2 = new carro();
		
		System.out.println("2º Veículo");
		
		veiculo2.setMarca("Porsche");
		veiculo2.setModelo("992 gt3 rs");
		veiculo2.setAno(2024);
		veiculo2.setCor("Vermelho");
		veiculo2.setPortas(2);
		
		System.out.println("Marca: "+veiculo2.getMarca()+".");
		System.out.println("Modelo: "+veiculo2.getModelo()+".");
		System.out.println("Ano: "+veiculo2.getAno()+".");
		System.out.println("Cor: "+veiculo2.getCor()+".");
		System.out.println("Quantidade de portas: "+veiculo2.getPortas()+".");
		System.out.println("");
		
//--------------------------------Motos-----------------------------------------//
		moto veiculo3 = new moto();
		
		System.out.println("MOTO");
		System.out.println("");
		
		System.out.println("3º Veículo");
		
		veiculo3.setMarca("Yamaha");
		veiculo3.setModelo("Yamaha XJ6");
		veiculo3.setAno(2016);
		veiculo3.setCor("Azul");
		veiculo3.setCilindrada(600.0);
		
		System.out.println("Marca: "+veiculo3.getMarca()+".");
		System.out.println("Modelo: "+veiculo3.getModelo()+".");
		System.out.println("Ano: "+veiculo3.getAno()+".");
		System.out.println("Cor: "+veiculo3.getCor()+".");
		System.out.println("Cilindrada: "+veiculo3.getCilindrada()+"cc.");
		System.out.println("");
		
		//-----------------------------------

		moto veiculo4 = new moto();
		
		System.out.println("4º Veículo");
		
		veiculo4.setMarca("BMW");
		veiculo4.setModelo("1250 GS");
		veiculo4.setAno(2024);
		veiculo4.setCor("cinza");
		veiculo4.setCilindrada(1253.0);
		
		System.out.println("Marca: "+veiculo4.getMarca()+".");
		System.out.println("Modelo: "+veiculo4.getModelo()+".");
		System.out.println("Ano: "+veiculo4.getAno()+".");
		System.out.println("Cor: "+veiculo4.getCor()+".");
		System.out.println("Cilindrada: "+veiculo4.getCilindrada()+"cc.");
		
		
		}

}
