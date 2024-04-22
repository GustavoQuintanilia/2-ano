package atividade3;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.000");
		
		Atividade3 usuarioPrimeiro = new Atividade3();
		System.out.println("Olá "+usuarioPrimeiro.escrevaNome()+", você possui "+usuarioPrimeiro.escrevaIdade()+" anos, e seu peso é "+usuarioPrimeiro.escrevaPeso()+" e sua altura é "+usuarioPrimeiro.escrevaAltura()+". Logo, seu imc é "+deci.format(usuarioPrimeiro.calculoImc())+".");
		System.out.println(usuarioPrimeiro.tipoPeso());
		System.out.println();
		
		Atividade3 usuarioSegundo = new Atividade3();
		System.out.println("Olá "+usuarioSegundo.escrevaNome()+", você possui "+usuarioSegundo.escrevaIdade()+" anos, e seu peso é "+usuarioSegundo.escrevaPeso()+" e sua altura é "+usuarioSegundo.escrevaAltura()+". Logo, seu imc é "+deci.format(usuarioSegundo.calculoImc())+".");
		System.out.println(usuarioSegundo.tipoPeso());
		System.out.println();

		Atividade3 usuarioTerceiro = new Atividade3();
		System.out.println("Olá "+usuarioTerceiro.escrevaNome()+", você possui "+usuarioTerceiro.escrevaIdade()+" anos, e seu peso é "+usuarioTerceiro.escrevaPeso()+" e sua altura é "+usuarioTerceiro.escrevaAltura()+". Logo, seu imc é "+deci.format(usuarioTerceiro.calculoImc())+".");
		System.out.println(usuarioTerceiro.tipoPeso());
		System.out.println();
		
		Atividade3 usuarioQuarto = new Atividade3();
		System.out.println("Olá "+usuarioQuarto.escrevaNome()+", você possui "+usuarioQuarto.escrevaIdade()+" anos, e seu peso é "+usuarioQuarto.escrevaPeso()+" e sua altura é "+usuarioQuarto.escrevaAltura()+". Logo, seu imc é "+deci.format(usuarioQuarto.calculoImc())+".");
		System.out.println(usuarioQuarto.tipoPeso());
		System.out.println();

	}

}
