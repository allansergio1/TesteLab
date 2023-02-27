package teste.estruturasRepeticao;

import java.util.Scanner;

public class NumerosSequenciaV2 {
	
	Scanner sc = new Scanner(System.in);
	private int n; 
	private double soma, seq;

	public void calcularTermo() {

		do {
			System.out.println("Digite o numero de valores da sequencia a serem somados:");
			n = sc.nextInt();
			if (n < 0 || n >= 50) {
				System.out.println("ERRO - VALOR MENOR QUE 0 OU MAIOR QUE 50");
			}
		} while (n < 0 || n >= 50);

		for (int i = 1; i <= n; i++) {
			seq = (double) i / (i + 1);
			//System.out.print(seq + " ");
			//System.out.print(i + "/" + (i+1) + "  ");
			soma = soma + seq;
		}

		System.out.printf("\nA soma dos " + n + " primeiros valores da sequencia eh de: %.3f", soma);
	}
}
