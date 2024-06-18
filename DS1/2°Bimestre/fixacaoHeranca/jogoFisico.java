package atividadeHeranca2;

public class jogoFisico extends jogo {

	private int quantidadeJogadores;
	private double tempoDePartida;
	
//-----------------------------------------ATRIBUTOS-------------------------------------------------
	
	
	public int getQuantidadeJogadores () {
		return this.quantidadeJogadores;
	}
	
	public void setQuantidadeJogadores (int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	
//------------------------------------------------------------------------------------------

	
	public double getTempoDePartida () {
		return this.tempoDePartida;
	}
	
	public void setTempoDePartida (double tempoDePartida) {
		this.tempoDePartida = tempoDePartida;
	}
	
//-----------------------------------------MÉTODOS-------------------------------------------------
	
@Override
	
	public void exibirDetalhes () {
		super.exibirDetalhes();
		System.out.println("Quantidade de jogadores: " + this.getQuantidadeJogadores());
		System.out.println("Tempo de Partida: " + this.getTempoDePartida());
 	}

//------------------------------------------------------------------------------------------
	public double calcularTempoTotal (int quantidadePartidas, double tempoDePartida) {

		return quantidadePartidas * this.tempoDePartida;
		
	}

}
