package atividadeHeranca2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		
//-----------------------------------------JOGOS ELETRÔNICOS-------------------------------------------------	
		
		jogoEletronico eletronico1 = new jogoEletronico();
		
		System.out.println("JOGOS ELETRÔNICOS");
		System.out.println();
		
		int quantidadeJogadores;
		
		System.out.println("Quantos jogadores tem na partida:");
		quantidadeJogadores = ler.nextInt();
		System.out.println();
		
		System.out.println("1º Jogo Eletrônico:");
		
		eletronico1.setNome("League of Legends");
		eletronico1.setPreco(0); //Gratuito
		eletronico1.setDistribuidora("Riot Games");
		eletronico1.setPlataforma("Microsoft Windows, Mac OS e macOS");
		eletronico1.setGenero("Arena de batalha multijogador em linha e RPG de ação");
		
		eletronico1.exibirDetalhes();
		eletronico1.jogarOnline(quantidadeJogadores);
		System.out.println();
		
//------------------------------------------------------------------------------------------	
		
		jogoEletronico eletronico2 = new jogoEletronico();
		
		System.out.println("Quantos jogadores tem na partida:");
		quantidadeJogadores = ler.nextInt();
		System.out.println();
		
		System.out.println("2º Jogo Eletrônico:");
		
		eletronico2.setNome("Fortnite");
		eletronico2.setPreco(38);
		eletronico2.setDistribuidora("Epic Games");
		eletronico2.setPlataforma("PlayStation 5, Xbox One, PlayStation 4, dentre outros.");
		eletronico2.setGenero("Sobrevivência, battle royale, sandbox");
		
		eletronico2.exibirDetalhes();
		eletronico2.jogarOnline(quantidadeJogadores);
		System.out.println();
		System.out.println();
		
//-----------------------------------------JOGO FÍSICO-------------------------------------------------	
		
		jogoFisico fisico1 = new jogoFisico();
		
		System.out.println("JOGO FÍSICO");
		System.out.println();
		
		int quantidadePartidas;
		
		System.out.println("Quantas partidas você jogou?");
		quantidadePartidas = ler.nextInt();
		System.out.println();
		
		System.out.println("1º Jogo Físico:");
		
		fisico1.setNome("Baralho");
		fisico1.setPreco(12.90);
		fisico1.setDistribuidora("Bicycle");
		fisico1.setQuantidadeJogadores(10);
		fisico1.setTempoDePartida(15); 
		
		fisico1.exibirDetalhes();
		System.out.println("Total de tempo do jogo: "+fisico1.calcularTempoTotal(quantidadePartidas, fisico1.getTempoDePartida()));
		System.out.println();
		
//------------------------------------------------------------------------------------------	
		jogoFisico fisico2 = new jogoFisico();
		
		System.out.println("Quantas partidas você jogou?");
		quantidadePartidas = ler.nextInt();
		System.out.println();
		
		System.out.println("2º Jogo Físico:");
		
		fisico2.setNome("Grand Theft Auto V");
		fisico2.setPreco(78.80);
		fisico2.setDistribuidora("Rockstar Games");
		fisico2.setQuantidadeJogadores(1);
		fisico2.setTempoDePartida(32); 
		
		fisico2.exibirDetalhes();
		System.out.println("Total de tempo do jogo: "+fisico2.calcularTempoTotal(quantidadePartidas, fisico2.getTempoDePartida()));

		
	}

}
