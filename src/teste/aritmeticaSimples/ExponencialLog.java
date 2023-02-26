package teste.aritmeticaSimples;

import java.util.Scanner;

public class ExponencialLog {

	Scanner sc = new Scanner(System.in);

	public void calcular() {
		
		System.out.print("Digite o valor de X: ");
		double x = Double.parseDouble(sc.nextLine());

		System.out.print("Digite o valor de Y: ");
		double y = Double.parseDouble(sc.nextLine());

		double resultado = Math.exp(y * Math.log(x));

		System.out.println("O resultado de X elevado a Y eh: " + Math.round(resultado * 100) / 100);
	}
}
