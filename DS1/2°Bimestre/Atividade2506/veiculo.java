package atividadeFixação;

import java.util.Scanner;

public class veiculo {
	Scanner ler = new Scanner(System.in);
	
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	
	
//------------------------------ATRIBUTOS--------------------------------	
//------------------------------CONSTRUTOR--------------------------------
	public veiculo() {
		
		
	}
	
	public veiculo(String modelo, double valorTabela, String cor, String combustivel, double ipva) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
		this.ipva = ipva;
	}
	
//------------------------------GETTER E SETTERS--------------------------------
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		System.out.println("Escreva o modelo do veículo:");
		this.modelo = ler.next();
	}
//--------------------------------------------------------------
	public double getValorTabela() {
		return this.valorTabela;
		
	}
	
	public void setValorTabela(double valorTabela) {
		System.out.println("Escreva o Valor de Tabela do veículo:");
		this.valorTabela = ler.nextDouble();
		
	}
//--------------------------------------------------------------
	public String getCor() {
		return this.cor;
		
	}
	
	public void setCor(String cor) {
		System.out.println("Escreva a cor do veículo:");
		this.cor = ler.next();
		
	}
//--------------------------------------------------------------
	public String getCombustivel() {
		return this.combustivel;
		
	}
	
	public void setCombustivel(String combustivel) {
		System.out.println("Escreva o tipo de combustível do veículo:");
		this.combustivel = ler.next();
		
	}
	
//--------------------------------------------------------------
	public double getIpva() {
		return this.ipva;
		
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
		
	}
	
//------------------------------MÉTODOS--------------------------------
	public double calculaIpva(double valorTabela) {
		double aliquota = 1;
		this.ipva = this.valorTabela * (aliquota/100);
		return this.ipva;
		
	}
	
//--------------------------------------------------------------
	public void imprimirFicha() {
		System.out.println("Modelo: "+this.getModelo());
		System.out.println("Valor de Tabela: R$"+this.getValorTabela());
		System.out.println("Cor: "+this.getCor());
		System.out.println("Combustível: "+this.getCombustivel());
		System.out.println("IPVA: R$"+this.calculaIpva(getValorTabela()));
	}
}
