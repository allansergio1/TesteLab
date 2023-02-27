package teste.pequenosDesafios.jogoDaVelha;

import java.util.Scanner;

public class JogoDaVelha {

	protected static final char VAZIO = ' ';
	private static final char JOGADOR_1 = 'X';
	private static final char JOGADOR_2 = 'O';
	private Scanner sc = new Scanner(System.in);

	public void jogar() {
		String op;
		do {

			System.out.println("Bem-vindo ao Jogo da Velha!\n");

			// Cria o tabuleiro com 9 objetos
			Posicao[] tabuleiro = new Posicao[9];
			for (int i = 0; i < 9; i++) {
				tabuleiro[i] = new Posicao(VAZIO);
			}

			String nomeJogador1, nomeJogador2;
			System.out.print("Digite o nome do jogador 1: ");
			nomeJogador1 = sc.nextLine();
			System.out.print("Digite o nome do jogador 2: ");
			nomeJogador2 = sc.nextLine();
			instrucaoTabuleiro();

			int vezDoJogador = 1; // começa com jogador 1

			while (true) {
				exibirTabuleiro(tabuleiro);

				String nomeJogador;
				char simboloJogador;
				if (vezDoJogador == 1) {
					nomeJogador = nomeJogador1;
					simboloJogador = JOGADOR_1;
				} else {
					nomeJogador = nomeJogador2;
					simboloJogador = JOGADOR_2;
				}

				System.out.printf("\n%s, digite a posicao para marcar (%c): ", nomeJogador, simboloJogador);
				int posicaoEscolhida = sc.nextInt() - 1; // subtrai 1 para considerar índice do array
				sc.nextLine(); // consome o restante da linha

				if (posicaoEscolhida < 0 || posicaoEscolhida > 8) {
					System.out.println("\nPosicao invalida! Escolha um numero de 1 a 9.");
					continue;
				}

				if (!tabuleiro[posicaoEscolhida].estaVazio()) {
					System.out.println("\nPosicao já está ocupada! Escolha outra posição.");
					continue;
				}

				tabuleiro[posicaoEscolhida].marcar(simboloJogador);

				if (verificarVencedor(tabuleiro, simboloJogador)) {
					exibirTabuleiro(tabuleiro);
					System.out.printf("\nParabens, %s! Você venceu o jogo!\n", nomeJogador);
					break;
				}

				if (verificarEmpate(tabuleiro)) {
					exibirTabuleiro(tabuleiro);
					System.out.println("\nEmpate!");
					break;
				}

				if (vezDoJogador == 1) { // alterna entre jogadores
					vezDoJogador = 2;
				} else {
					vezDoJogador = 1;
				}
			}

			System.out.println("\nDeseja jogar uma nova partida? (S/N)");
			op = sc.nextLine();
		} while (op.equalsIgnoreCase("S"));

		System.out.println("\nObrigado por jogar! Ate a proxima.");
	}

	private boolean verificarVencedor(Posicao[] tabuleiro, char jogador) {
		// Verifica as linhas
		for (int i = 0; i < 9; i += 3) {
			if (tabuleiro[i].getSimbolo() == jogador && tabuleiro[i + 1].getSimbolo() == jogador
					&& tabuleiro[i + 2].getSimbolo() == jogador) {
				return true;
			}
		}

		// Verifica as colunas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i].getSimbolo() == jogador && tabuleiro[i + 3].getSimbolo() == jogador
					&& tabuleiro[i + 6].getSimbolo() == jogador) {
				return true;
			}
		}

		// Verifica as diagonais
		if (tabuleiro[0].getSimbolo() == jogador && tabuleiro[4].getSimbolo() == jogador
				&& tabuleiro[8].getSimbolo() == jogador) {
			return true;
		}
		if (tabuleiro[2].getSimbolo() == jogador && tabuleiro[4].getSimbolo() == jogador
				&& tabuleiro[6].getSimbolo() == jogador) {
			return true;
		}

		return false;
	}

	// Método que verifica se houve empate
	private boolean verificarEmpate(Posicao[] tabuleiro) {
		for (int i = 0; i < 9; i++) {
			if (tabuleiro[i].estaVazio()) {
				return false;
			}
		}

		return true;
	}

	// Método que exibe o tabuleiro atual
	private void exibirTabuleiro(Posicao[] tabuleiro) {
		System.out.println("\nTabuleiro atual:");
		System.out.println(" " + tabuleiro[0] + " | " + tabuleiro[1] + " | " + tabuleiro[2] + " ");
		System.out.println("---+---+---");
		System.out.println(" " + tabuleiro[3] + " | " + tabuleiro[4] + " | " + tabuleiro[5] + " ");
		System.out.println("---+---+---");
		System.out.println(" " + tabuleiro[6] + " | " + tabuleiro[7] + " | " + tabuleiro[8] + " ");
		// System.out.println("\n");
	}

	private void instrucaoTabuleiro() {
		System.out.println("\nTabuleiro:\n");
		System.out.println(" 1 | 2 | 3 ");
		System.out.println("---+---+---");
		System.out.println(" 4 | 5 | 6 ");
		System.out.println("---+---+---");
		System.out.println(" 7 | 8 | 9 ");
	}

}