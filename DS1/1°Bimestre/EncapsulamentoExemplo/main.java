package imcEncapsulamento;
import java.text.DecimalFormat;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.000");
		
		encapsulamentoImc usuarioPrimeiro = new encapsulamentoImc();
		System.out.println("Olá "+usuarioPrimeiro.getEscrevaNome()+", você possui "+usuarioPrimeiro.getEscrevaIdade()+" anos, e seu peso é "+usuarioPrimeiro.getEscrevaPeso()+" e sua altura é "+usuarioPrimeiro.getEscrevaAltura()+". Logo, seu imc é "+deci.format(usuarioPrimeiro.calculoImc())+".");
		System.out.println(usuarioPrimeiro.tipoPeso());
		System.out.println();
		
		encapsulamentoImc usuarioSegundo = new encapsulamentoImc();
		System.out.println("Olá "+ usuarioSegundo.getEscrevaNome()+", você possui "+ usuarioSegundo.getEscrevaIdade()+" anos, e seu peso é "+ usuarioSegundo.getEscrevaPeso()+" e sua altura é "+ usuarioSegundo.getEscrevaAltura()+". Logo, seu imc é "+deci.format( usuarioSegundo.calculoImc())+".");
		System.out.println( usuarioSegundo.tipoPeso());
		System.out.println();

		encapsulamentoImc usuarioTerceiro = new encapsulamentoImc();
		System.out.println("Olá "+ usuarioTerceiro.getEscrevaNome()+", você possui "+ usuarioTerceiro.getEscrevaIdade()+" anos, e seu peso é "+ usuarioTerceiro.getEscrevaPeso()+" e sua altura é "+ usuarioTerceiro.getEscrevaAltura()+". Logo, seu imc é "+deci.format( usuarioTerceiro.calculoImc())+".");
		System.out.println(usuarioTerceiro.tipoPeso());
		System.out.println();
		
		encapsulamentoImc usuarioQuarto = new encapsulamentoImc();
		System.out.println("Olá "+usuarioQuarto.getEscrevaNome()+", você possui "+usuarioQuarto.getEscrevaIdade()+" anos, e seu peso é "+usuarioQuarto.getEscrevaPeso()+" e sua altura é "+usuarioQuarto.getEscrevaAltura()+". Logo, seu imc é "+deci.format(usuarioQuarto.calculoImc())+".");
		System.out.println(usuarioQuarto.tipoPeso());
		System.out.println();


		
	}

}
