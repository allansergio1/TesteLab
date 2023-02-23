package teste.estruturasRepeticao;

import java.util.Scanner;

public class ApenasPositivos {

	Scanner sc = new Scanner(System.in);
	private double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	
	public void verificar() {
		do {
			System.out.println("Digite um numero maior que 0: ");
			this.n = Double.parseDouble(sc.nextLine());
		} while (this.n <= 0);
		sc.close();
	}
}
/*
ApenasPositivos pos = new ApenasPositivos();
		
		pos.verificar();
*/