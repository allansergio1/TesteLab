package teste.pequenosDesafios.jogoDaVelha;

import java.util.ArrayList;
import java.util.List;

class Tabuleiro {
	
	//private List<Jogador> posicao;
	private String[] posicao;
	
	public Tabuleiro () {
		//posicao = new ArrayList<Jogador>();
		posicao = new String[8];
		for (int i = 1; i < 10; i++) {
			posicao[i-1] = Integer.toString(i);
		}
	}
	
	public void controlador() {
		
	}

	public String[] getPosicao() {
		return posicao;
	}

	public void setPosicao(String[] posicao) {
		this.posicao = posicao;
	}

	
}
