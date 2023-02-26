package teste.estruturasRepeticao;

import java.util.Scanner;

public class MaiorMenorSomaEtcV2 {

	Scanner sc = new Scanner(System.in);
	private double n;
	private double num;

	public void valores() {
		String str;
		do {
			double soma = 0;
			double maior = Double.NEGATIVE_INFINITY;
			double menor = Double.POSITIVE_INFINITY;
			int positivos = 0;
			int negativos = 0;

			do {
				System.out.println("Quantos valores serao digitados?");
				n = sc.nextDouble();
				if (n < 0 || n > 20) {
					System.out.println("Erro: numero menor que 0 ou maior que 20");
				}
			} while (n < 0 || n > 20);

			for (int i = 0; i < n; i++) {
				System.out.format("Valor " + (i + 1) + ": ");
				num = sc.nextDouble();
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
				soma += num;

				if (num > 0) {
					positivos++;
				} else if (num < 0) {
					negativos++;
				}
			}

			double media = soma / n;
			double pctPositivos = (double) positivos / n * 100;
			double pctNegativos = (double) negativos / n * 100;

			System.out.println("O maior valor eh: " + maior);
			System.out.println("O menor valor eh: " + menor);
			System.out.println("A soma dos valores eh de: " + soma);
			System.out.println("A media aritmetica dos valores eh de: " + media);
			System.out.printf("A porcentagem de valores positivos eh de: %.2f%%%n", pctPositivos);
			System.out.printf("A porcentagem de valores negativos eh de: %.2f%%%n", pctNegativos);
			System.out.printf("\nDeseja executar o programa novamente? (S/N): ");
			str = sc.next();
			System.out.println("");
			
		} while (str.equalsIgnoreCase("S"));
		sc.close();
	}
}
/*
MaiorMenorSomaEtcV2 conjunto = new MaiorMenorSomaEtcV2();
		
		conjunto.valores();
*/