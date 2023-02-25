package teste.estruturasRepeticao;

import java.util.Scanner;

public class MaiorSomaMedia {

	Scanner sc = new Scanner(System.in);
	private double n;

	public void valores() {
		double soma = 0;
		double maior = 0;
		System.out.println("Digite dez valores positivos");
		for (int i = 0; i < 10; i++) {
			do {
				System.out.format("Valor " + (i + 1) + ": ");
				n = sc.nextDouble();
				if (n < 0) {
					System.out.println("Erro");
				} else if (n > maior) {
					maior = n;
				}
			} while (n < 0);
			soma += n;
		}
		double media = soma / 10;
		System.out.println("O maior valor eh: " + maior);
		System.out.println("A soma dos valores eh de: " + soma);
		System.out.println("A media aritmetica dos valores eh de: " + media);
	}
}
/*
MaiorSomaMedia conjunto = new MaiorSomaMedia();
		
		conjunto.valores();
*/