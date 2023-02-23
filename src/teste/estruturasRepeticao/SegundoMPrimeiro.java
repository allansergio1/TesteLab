package teste.estruturasRepeticao;

import java.util.Scanner;

public class SegundoMPrimeiro {

	Scanner sc = new Scanner(System.in);
	private int n1;
	private int n2;

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public void verificar() {
		System.out.println("Digite dois numeros inteiros: ");
		this.n1 = sc.nextInt();
		this.n2 = sc.nextInt();
		while (this.n2 <= this.n1) {
			System.out.println("Digite apenas o segundo numero: ");
			this.n2 = sc.nextInt();
		}
		sc.close();
	}
}
/*
SegundoMPrimeiro numeros = new SegundoMPrimeiro();
		
		numeros.verificar();
*/