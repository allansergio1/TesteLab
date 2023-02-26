package teste.estruturasRepeticao;

import java.util.Scanner;

public class NumerosSequenciaV1 {

	Scanner sc = new Scanner(System.in);
	private int n, soma, seq;

	public void calcularTermo() {

		do {
			System.out.println("Digite o numero de valores da sequencia a serem somados:");
			n = sc.nextInt();
			if (n < 0 || n > 100) {
				System.out.println("ERRO - VALOR MENOR QUE 0 OU MAIOR QUE 100");
			}
		} while (n < 0 || n > 100);

		for (int i = 1; i <= n; i++) {
			seq = (int) Math.pow(i, 2) + 1;
			//System.out.print(seq + " ");
			soma = soma + seq;
		}

		System.out.println("\nA soma dos " + n + " primeiros valores da sequencia eh de: " + soma);
	}
}
/*
NumerosSequenciaV1 num = new NumerosSequenciaV1();
		
		num.calcularTermo();
*/