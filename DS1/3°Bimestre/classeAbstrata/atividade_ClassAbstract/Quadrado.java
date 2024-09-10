package atividade1;

public class Quadrado extends FormasGeometricas {
	private double lado;
	
	//--------------CONSTRUTOR----------------------
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	//---------------------------------------------

	@Override 
	public double calcularArea() {
		return (lado * lado);
	}
	
}
