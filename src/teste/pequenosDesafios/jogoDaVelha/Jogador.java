package teste.pequenosDesafios.jogoDaVelha;

import java.util.ArrayList;
import java.util.List;

class Jogador {

	private String nome;
	private String simbolo;
	private Tabuleiro posicao;

	public Jogador(String nome, Tabuleiro posicao, String simbolo) {
		this.nome = nome;
		this.posicao = posicao;
		this.simbolo = simbolo;
	}
	
	public Jogador() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tabuleiro getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		String[] aux = this.posicao.getPosicao();
		for(int i = 1; i < 10; i++) {
			if (Integer.toString(posicao).equals(aux[i])) {
				aux[i] = this.simbolo;
				continue;
			}
		}
		aux = null;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return nome;
	}

}
