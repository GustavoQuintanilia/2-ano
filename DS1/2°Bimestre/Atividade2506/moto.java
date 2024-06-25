package atividadeFixação;

public class moto extends veiculo{
	
	@Override
	public double calculaIpva(double valorTabela) {
		super.calculaIpva(getValorTabela());
		return valorTabela * 2/100;
	}
	
}
