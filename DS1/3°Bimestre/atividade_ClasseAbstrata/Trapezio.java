package atividade1;

public class Trapezio extends FormasGeometricas {
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	//--------------CONSTRUTOR----------------------
	public Trapezio(double baseMaior, double baseMenor, double altura) {
		super();
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}
	//----------------------------------------------

	@Override 
	public double calcularArea() {
		return ((baseMaior + baseMenor)*altura)/2;
	}

}

