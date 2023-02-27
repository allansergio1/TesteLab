package teste.pequenosDesafios;

import java.util.Scanner;

public class BuscaInternet {

	private Scanner sc = new Scanner(System.in);
	private int n;

	public void verificar() {

		do {
			System.out.println("Digite o numero de pessoas que clicaram no terceiro link da busca: ");
			n = sc.nextInt();
			if (n < 1 || n > 1000) {
				System.out.println("Erro: o numero de pessoas deve ser maior/igual a 1 e menor que 1000\n");
			}
		} while (n < 1 || n > 1000);

		int total = 4 * n;

		System.out.println(total);
	}

}
/*
BuscaInternet busca = new BuscaInternet();
		 
		 busca.verificar();
*/