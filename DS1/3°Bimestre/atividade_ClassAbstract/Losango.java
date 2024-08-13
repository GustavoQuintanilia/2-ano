package atividade1;

public class Losango extends FormasGeometricas {
	private double diagonalMaior;
	private double diagonalMenor;
	
	//--------------CONSTRUTOR----------------------
	public Losango(double diagonalMaior, double diagonalMenor) {
		super();
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	//---------------------------------------------

	@Override 
	public double calcularArea() {
		return (diagonalMaior * diagonalMenor)/2;
	}

}
