package teste.estruturasDados;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {

	int[] numeros = new int[20];
	Scanner sc = new Scanner(System.in);

	public void ordenar() {

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		Arrays.sort(numeros);
		int[] numDecrescente = new int[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			numDecrescente[i] = numeros[numeros.length - 1 - i];
		}

		System.out.println("\nValores em ordem decrescente: ");
		for (int i = 0; i < numDecrescente.length; i++) {
			System.out.print(numDecrescente[i] + " ");
		}
	}
}
