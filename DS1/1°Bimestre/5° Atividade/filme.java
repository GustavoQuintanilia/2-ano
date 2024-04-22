package filmesAtividade_Ds;

public class filme {
	String nome;
	int minutoDuracao;
	
//------------------------------------------------------------------------------------
	
	String getNome() {
		return this.nome;
		
	}
	
	void setNome (String nome) {
		this.nome = nome;
	}

//------------------------------------------------------------------------------------
	
	int getMinutoDuracao() {
		return this.minutoDuracao;
		
	}
	
	void setMinutoDuracao(int minutoDuracao) {
		this.minutoDuracao = minutoDuracao;
		
	}
	
//------------------------------------------------------------------------------------
	
	String horaDuracao (int minutoDuracao) {
		int hora = minutoDuracao / 60;
		int minuto = minutoDuracao % 60;
		return String.format("%02d:%02d:00", hora, minuto);
	}
	
}
