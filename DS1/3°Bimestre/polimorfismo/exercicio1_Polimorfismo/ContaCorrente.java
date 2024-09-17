package exercicio1_Polimorfismo;

public class ContaCorrente extends Conta{
	private double tarifaMensal;
	
//------------------------CONSTRUTORES-----------------------------
	public ContaCorrente() {
	
	}
	
	public ContaCorrente(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
	
//------------------------ATRIBUTOS-----------------------------		
//----------------------------------------	
	public double getTarifaMensal() {
		return tarifaMensal;
	}
	

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
	
	

}
