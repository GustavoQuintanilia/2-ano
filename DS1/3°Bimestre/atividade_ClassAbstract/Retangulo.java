package atividade1;

public class Retangulo extends FormasGeometricas {
	private double base;
	private double altura;
	
	//--------------CONSTRUTOR----------------------
	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	//---------------------------------------------

	@Override 
	public double calcularArea() {
		return (base * altura);
	}
}