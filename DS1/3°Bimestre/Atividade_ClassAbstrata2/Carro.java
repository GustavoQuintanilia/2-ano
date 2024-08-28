package atividade2;

import java.util.Scanner;

public class Carro extends Veiculo{
	
	@Override
	public double calculaIpva(double valorTabela) {
		return valorTabela * 4/100;
	}
	

}
