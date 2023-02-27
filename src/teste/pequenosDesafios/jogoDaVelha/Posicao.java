package teste.pequenosDesafios.jogoDaVelha;

class Posicao extends JogoDaVelha{
	
	private char simbolo;

	public Posicao(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void marcar(char simbolo) {
		this.simbolo = simbolo;
	}

	public boolean estaVazio() {
		return simbolo == VAZIO;
	}

	@Override
	public String toString() {
		return String.valueOf(simbolo);
	}
}