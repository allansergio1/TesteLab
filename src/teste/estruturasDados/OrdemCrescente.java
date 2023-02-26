package teste.estruturasDados;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {

	int[] numeros = new int[20];
	Scanner sc = new Scanner(System.in);

	public void ordenar() {

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o valor " + (i + 1) + ": ");
			numeros[i] = sc.nextInt();
		}

		Arrays.sort(numeros);
		System.out.println("\nValores em ordem crescente: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
/*
OrdemCrescente conjunto = new OrdemCrescente();
		
		conjunto.ordenar();

*/