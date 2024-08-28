package atividade2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//-----------------------------CARROS------------------------------------
		
		Carro carro1 = new Carro();
		
		System.out.println("CARROS");
		System.out.println();
		
		
		System.out.println("Carro 1:");
		carro1.setModelo(null);
		carro1.setValorTabela(0);
		carro1.setCor(null);
		carro1.setCombustivel(null);
		carro1.calculaIpva(carro1.getValorTabela());
		System.out.println();
		
		//-----------------------------------------------------------------
		Carro carro2 = new Carro();
		
		System.out.println("Carro 2:");
		carro2.setModelo(null);
		carro2.setValorTabela(0);
		carro2.setCor(null);
		carro2.setCombustivel(null);
		carro2.calculaIpva(carro2.getValorTabela());
		System.out.println();
		
		//------------FICHA DOS CARROS---------------
		
		//-------------Carro1--------------------
		System.out.println("Carro 1:");
		carro1.imprimirFicha();
		System.out.println();
		
		//-------------Carro2--------------------
		System.out.println("Carro 2:");
		carro2.imprimirFicha();
		System.out.println();
		System.out.println();
		
		//-----------------------------MOTOS------------------------------------
		
		Moto moto1 = new Moto();
				
		System.out.println("MOTOS");
		System.out.println();
				
				
		System.out.println("Moto 1:");
		moto1.setModelo(null);
		moto1.setValorTabela(0);
		moto1.setCor(null);
		moto1.setCombustivel(null);
		moto1.calculaIpva(moto1.getValorTabela());
		System.out.println();
		
		//-----------------------------------------------------------------
		Moto moto2 = new Moto();
		
		System.out.println("Moto 2:");
		moto2.setModelo(null);
		moto2.setValorTabela(0);
		moto2.setCor(null);
		moto2.setCombustivel(null);
		moto2.calculaIpva(moto2.getValorTabela());
		System.out.println();
		
		//------------FICHA DOS MOTOS---------------	
		
		//-------------Moto1--------------------
		System.out.println("Moto 1:");
		moto1.imprimirFicha();
		System.out.println();
		
		//-------------Moto2--------------------
		System.out.println("Moto 2:");
		moto2.imprimirFicha();
		System.out.println();

	}

}
