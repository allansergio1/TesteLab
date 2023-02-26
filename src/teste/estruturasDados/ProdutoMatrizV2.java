package teste.estruturasDados;

import java.util.Scanner;

public class ProdutoMatrizV2 {

	Scanner sc = new Scanner(System.in);
	private int[] numeros = new int[20];
	private int n;
	private int[] aux = new int[20];

	public void resultado() {

		System.out.println("Digite 20 numeros:");

		for (int i = 0; i < 20; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("\nEntre com uma constante para multiplicar os valores");
		n = sc.nextInt();

		System.out.println("\nResultado da multiplicao dos numeros:");

		for (int i = 0; i < 20; i++) {
			aux[i] = numeros[i] * n;
			System.out.println("Valor " + (i + 1) + ": " + n + " x " + numeros[i] + " = " + aux[i]);
		}
		sc.close();

		System.out.println("\nComprovante de que os resultados foram armazenados:");
		for (int i = 0; i < 20; i++) {
			System.out.println("Valor " + (i + 1) + ": " + aux[i]);
		}
	}
}
/*
ProdutoMatrizV2 num = new ProdutoMatrizV2();

		num.resultado();
*/