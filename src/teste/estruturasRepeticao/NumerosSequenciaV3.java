package teste.estruturasRepeticao;

import java.util.Scanner;

public class NumerosSequenciaV3 {
	
	Scanner sc = new Scanner(System.in);
	private int n; 
	private double soma, seq;

	public void calcularTermo() {

		do {
			System.out.println("Digite o numero de valores da sequencia a serem somados:");
			n = sc.nextInt();
			if (n < 0 || n > 50) {
				System.out.println("ERRO - VALOR MENOR QUE 0 OU MAIOR QUE 50");
			}
		} while (n < 0 || n > 50);

		for (int i = 1; i <= n; i++) {
			seq = (double) (Math.pow(i, 2) + 1) / (Math.pow(i, 3));
			//System.out.print(seq + " ");
			//System.out.print((int) (Math.pow(i, 2) + 1) + "/" + (int) (Math.pow(i, 3)) + "  ");
			soma = soma + seq;
		}

		System.out.printf("\nA soma dos " + n + " primeiros valores da sequencia eh de: %.3f", soma);
	}
}
