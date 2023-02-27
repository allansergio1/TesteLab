package teste.pequenosDesafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PontuacaoBasquete {

	private Scanner sc = new Scanner(System.in);
	private List<Integer> pontos;
	private int recorde = 0; // variável para armazenar o recorde atual
	private int qtdRecordes = 0; // variável para contar a quantidade de vezes que o recorde foi quebrado
	private int piorJogo = 0; // variável para armazenar a partida com o pior desempenho

	public PontuacaoBasquete() {
		pontos = new ArrayList<Integer>();
	}

	public void jogo() {
		System.out.println("Digite as pontuacoes de cada jogo separado por um espaco: ");

		while (sc.hasNextInt()) {
			int pontuacao = sc.nextInt();
			pontos.add(pontuacao);

			if (pontos.size() == 1) {
				// primeiro jogo não conta como recorde
				continue;
			}

			if (pontuacao > recorde) {
				// bateu o recorde
				recorde = pontuacao;
				qtdRecordes++;
			} else if (pontuacao < pontos.get(piorJogo)) {
				// novo pior jogo
				piorJogo = pontos.size() - 1;
			}
		}

		// imprime os resultados
		System.out.printf("%d  %d", qtdRecordes, (piorJogo + 1));
	}
}
/*
PontuacaoBasquete t = new PontuacaoBasquete();
		 
		 t.jogo();
*/
