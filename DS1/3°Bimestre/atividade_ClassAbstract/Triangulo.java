package atividade1;

public class Triangulo extends FormasGeometricas {
	private double base;
	private double altura;
	
	//--------------CONSTRUTOR----------------------
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	//---------------------------------------------

	@Override 
	public double calcularArea() {
		return (base * altura)/2;
	}


}
