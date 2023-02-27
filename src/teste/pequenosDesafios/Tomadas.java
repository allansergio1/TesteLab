package teste.pequenosDesafios;

import java.util.Scanner;

public class Tomadas {

	private Scanner sc = new Scanner(System.in);
	private int t1, t2, t3, t4;

	public void verificar() {
		
		do {
			System.out.print("Digite o numero de tomadas de cada regua, separados por espaco: ");
			t1 = sc.nextInt();
			t2 = sc.nextInt();
			t3 = sc.nextInt();
			t4 = sc.nextInt();

			if (t1 < 1 || t1 > 6 || t2 < 1 || t2 > 6 || t3 < 1 || t3 > 6 || t4 < 1 || t4 > 6) {
				System.out.println("Erro: o numero de tomadas deve ser positivo e menor que 6\n");
				//return;
			}
		} while (t1 < 1 || t1 > 6 || t2 < 1 || t2 > 6 || t3 < 1 || t3 > 6 || t4 < 1 || t4 > 6);

		int totalTomadas = (t1 - 1) + (t2 - 1) + (t3 - 1) + t4;
		System.out.println("\nNumero maximo de notebooks que podem ser conectados num mesmo instante: " + totalTomadas);
	}
}
