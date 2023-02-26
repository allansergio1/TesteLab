package teste.estruturasDados;

import java.util.Scanner;

public class ProdutoMatrizV1 {

	Scanner sc = new Scanner(System.in);
	private int[] numeros = new int[20];
	private int n;
	private int aux;

	public void resultado() {

		System.out.println("Digite 20 numeros:");

		for (int i = 0; i < 20; i++) {
			System.out.print("Valor " + (i+1) + ": "); 
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("\nEntre com uma constante para multiplicar os valores");
		n = sc.nextInt();

		System.out.println("Resultado da multiplicao dos numeros:");

		for (int i = 0; i < 20; i++) {
			aux = numeros[i] * n;
			System.out.println("Valor " + (i+1) + ": " + n + " x " + numeros[i] + " = " + aux);
			numeros[i] = aux;
			aux = 0;
		}
		sc.close();
		
		System.out.println("\nComprovante de que os resultados foram armazenados:");
		for (int i = 0; i < 20; i++) {
			System.out.println("Valor " + (i+1) + ": " + numeros[i]);
		}
	}
}
/*
ProdutoMatrizV1 num = new ProdutoMatrizV1();
		
		num.resultado();
*/