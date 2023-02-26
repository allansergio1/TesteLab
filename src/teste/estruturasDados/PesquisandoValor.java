package teste.estruturasDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesquisandoValor {

	Scanner sc = new Scanner(System.in);
	private int n, consulta;
	private int[] numero;
	private List<Integer> posicao;

	public void consulta() {
		do {
			System.out.println("Quantos valores deseja armazenar? (maximo de 20)");
			n = sc.nextInt();
			if (n > 20) {
				System.out.println("Erro - numero maior que o limite maximo");
			}
		} while (n > 20);

		numero = new int[n];

		System.out.println("\nDigite os " + n + " numeros:");

		for (int i = 0; i < n; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			numero[i] = sc.nextInt();
		}

		String str;
		posicao = new ArrayList<Integer>();

		do {
			System.out.println("\nDigite um numero para consultar: ");
			consulta = sc.nextInt();

			for (int i = 0; i < n; i++) {
				if (numero[i] == consulta) {
					posicao.add(i);
				}
			}

			if (posicao.isEmpty()) {
				System.out.println("\nValor nao encontrado!");
			} else {
				System.out.print("\nO numero pesquisado esta localizado na(s) posicao(oes): ");
				for (int i = 0; i < posicao.size(); i++) {
					if (posicao.get(i) != null) {
						System.out.print(posicao.get(i) + "  ");
					}
				}
			}
			posicao.clear();

			System.out.print("\nDeseja fazer uma nova consulta? (S/N) ");
			str = sc.next();

		} while (str.equalsIgnoreCase("S"));
	}
}
/*
PesquisandoValor pesquisa = new PesquisandoValor();
		
		pesquisa.consulta();
*/