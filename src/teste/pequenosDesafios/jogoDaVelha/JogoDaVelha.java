package teste.pequenosDesafios.jogoDaVelha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogoDaVelha {

	Scanner sc = new Scanner(System.in);
	private List<Jogador> jogadores;
	private Tabuleiro tab;

	public JogoDaVelha() {
		jogadores = new ArrayList<Jogador>();
		tab = new Tabuleiro();
	}

	public void jogar() {
		Jogador a = null, b = null;
		if (jogadores == null) {
			System.out.print("Sem jogadores pra jogar!");
			adicionarJogador();
		} else {
			do {
				System.out.printf("(%s) Digite a posicao da sua jogada: ", jogadores.get(0).getNome());
				jogadores.get(0).setPosicao(sc.nextInt());
				System.out.printf("(%s) Digite a posicao da sua jogada: ", jogadores.get(1).getNome());
				jogadores.get(1).setPosicao(sc.nextInt());
			} while ();
		}
	}
	
	public void vitoria() {
		String[] aux = this.tab.getPosicao();
		boolean win = false;
		for (int i = 1; i < 10; i++) {
			if (aux[i].equals("X")) {
				
			}
		}
	}

	public void adicionarJogador() {
		System.out.println("Digite o nome do Jogador 1 (X): ");
		jogadores.add(new Jogador(sc.nextLine(), this.tab, "X"));
		System.out.println("Digite o nome do Jogador 2 (O): ");
		jogadores.add(new Jogador(sc.nextLine(), this.tab, "O"));
	}

	public void vizualizacaoTab() {
		System.out.println("\t       |" + "    |" + "    ");
		System.out.println("\t     1 |" + "  2 |" + "  3 ");
		System.out.println("\t   ____|" + "____|" + "____");
		System.out.println("\t       |" + "    |" + "    ");
		System.out.println("\t     4 |" + "  5 |" + "  6 ");
		System.out.println("\t   ____|" + "____|" + "____");
		System.out.println("\t       |" + "    |" + "    ");
		System.out.println("\t     7 |" + "  8 |" + "  9 ");
		System.out.println("\t       |" + "    |" + "    ");

	}
}
