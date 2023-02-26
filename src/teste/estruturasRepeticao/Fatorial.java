package teste.estruturasRepeticao;

import java.util.Scanner;

public class Fatorial {
	Scanner sc = new Scanner(System.in);
	private int n;

	public void calcular() {
		String str;
		do {
			do {
				System.out.println("Digite o valor do qual sera calculado o fatorial: ");
				n = sc.nextInt();
				if (n <= 0) {
					System.out.println("Erro: numero menor que 0");
				}
			} while (n <= 0);

			int fatorial = 1;
			for (int i = 1; i <= n; i++) {
				if (i > 1) {
					System.out.print(" x " + i);
				} else {
					System.out.print(i);
				}
				fatorial *= i;
			}

			System.out.println(" = " + fatorial);

			System.out.print("\nDeseja calcular o fatorial de outro numero? (S/N) ");
			str = sc.next();
			System.out.println("");
		} while (str.equalsIgnoreCase("S"));
	}
}
/*
Fatorial fat = new Fatorial();
		
		fat.calcular();
*/