package teste.aritmeticaSimples;

import java.util.Scanner;

public class CompraTrocoo {
	
	Scanner sc = new Scanner(System.in);
	private double[] valorProdutos = new double[5];
	private double soma = 0.0;
	private double pagamento;
	
	public void produtos() {
		System.out.println("Digite o valor de 5 produtos: ");
		for (int i = 0; i < valorProdutos.length; i++) {
			System.out.print("Produto " + (i+1) + ": ");
			valorProdutos[i] = sc.nextDouble();
			soma = soma + valorProdutos[i];
		}
		
		System.out.print("\nDigite o valor do pagamento: ");
		pagamento = sc.nextDouble();
		
		double total = pagamento - soma;
		
		System.out.printf("O troco eh de: R$%.2f", total);
	}
}
