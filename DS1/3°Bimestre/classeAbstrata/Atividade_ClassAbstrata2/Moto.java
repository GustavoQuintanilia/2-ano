package atividade2;

public class Moto extends Veiculo{
	
	@Override
	public double calculaIpva(double valorTabela) {
		return valorTabela * 2/100;
	}
}
