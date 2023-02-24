package teste.estruturasRepeticao;

import java.util.Scanner;

public class TabuadaNumPositivo {
	
	Scanner sc = new Scanner(System.in);
	private int n;

	public double getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void tabuada() {
		boolean b = false;
		do {
			System.out.println("Digite um numero positivo: ");
			this.n = sc.nextInt();
			if (this.n < 0) {
				b = true;
			} else {
				tabuada1();
				b = false;
			}
		} while (b == true);
		sc.close();
	}
	
	private void tabuada1() {
		System.out.println("Tabuada do " + this.n + ":");
		for (int i = 1; i <= 10; i++) {
			int aux = this.n * i;
			System.out.println(this.n + " x " + i + " = " + aux);
		}
	}
}
/*
TabuadaNumPositivo num = new TabuadaNumPositivo();
		
		num.tabuada();
*/