package exercicio_Fixacao;

public class ContaCorrente extends ContaGenerica{
	private double limiteEspecial;
	
//-----------------------CONSTRUTORES----------------------
	
	public ContaCorrente() {
		super();
	
	}

	public ContaCorrente(String nome, String cpf, int numeroConta, double saldo, double limiteEspecial) {
		super(nome, cpf, numeroConta, saldo);
		this.limiteEspecial = saldo + 1500;

	}
	
//-----------------------ATRIBUTOS----------------------
//------------------------------------------
	public double getLimiteEspecial() {
		return this.limiteEspecial;
		
	}
	
	public void setLimiteEspecial (double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
		
	}

//-----------------------MÉTODOS----------------------
	@Override
	public void sacar(double valor) {
		if(valor <= limiteEspecial) {
			super.setSaldo(super.getSaldo() - valor);

			
		}else {
			System.out.println("O limite do seu cheque especial acabou!");				
	}
		
	}

}
