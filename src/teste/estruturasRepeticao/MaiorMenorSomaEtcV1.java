package teste.estruturasRepeticao;

import java.util.Scanner;

public class MaiorMenorSomaEtcV1 {

	Scanner sc = new Scanner(System.in);
	private double n;
	private double num;

	public void valores() {
		double soma = 0;
		double maior = 0;
		double menor = 0;
		do {
			System.out.println("Quantos valores serao digitados?");
			num = sc.nextDouble();
			if (n < 0 || num > 20) {
				System.out.println("Erro: numero menor que 0 ou maior que 20");
			}
		} while (num < 0 || num > 20);
		for (int i = 0; i < num; i++) {
			do {
				System.out.format("Valor " + (i + 1) + ": ");
				n = sc.nextDouble();
				if (n < 0) {
					System.out.println("Erro");
				} else if (n > maior) {
					maior = n;
				} else if (menor < n) {
					menor = n;
				}
			} while (n < 0);
			soma += n;
		}
		double media = soma / num;
		System.out.println("O maior valor eh: " + maior);
		System.out.println("O menor valor eh: " + menor);
		System.out.println("A soma dos valores eh de: " + soma);
		System.out.println("A media aritmetica dos valores eh de: " + media);
	}
}
