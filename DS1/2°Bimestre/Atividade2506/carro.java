package atividadeFixação;

public class carro extends veiculo{
	
	@Override
	public double calculaIpva(double valorTabela) {
		super.calculaIpva(getValorTabela());
		return valorTabela * 4/100;
	}

}
