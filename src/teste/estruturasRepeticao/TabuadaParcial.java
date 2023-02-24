package teste.estruturasRepeticao;

import java.util.Scanner;

public class TabuadaParcial {

	Scanner sc = new Scanner(System.in);
	private int num;
	private int a;
	private int b;

	public double getN() {
		return num;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void tabuada() {
		boolean v = false;//variavel auxiliar de parada do laço
		do {
			System.out.println("Digite o numero do qual sera gerado a tabuada: ");
			this.num = sc.nextInt();
			//condição que verifica se o num é positivo, se não for, muda a var. aux. e o laço volta,
			//senão, prossegue para coletar os valores do intervalo.
			if (this.num < 0) {
				System.out.println("Apenas valores positivos!!");
				v = true;
			} else {
				System.out.println("Digite o intervalo da tabuada a ser calculada: ");
				this.a = sc.nextInt();
				this.b = sc.nextInt();
				//verifica a condição de b ser maior que a, que caso não seja aetndida
				//solicitara de novo o valor de b
				while (this.b <= this.a) {
					System.out.println("Digite novamente apenas o segundo numero: ");
					this.b = sc.nextInt();
				}
				tabuada1(); 
				v = false; 
			}
		} while (v == true);
		sc.close();
	}

	private void tabuada1() {
		System.out.println("Tabuada parcial do " + num + ":");
		for (int i = b; i >= a; i--) {
			int aux = num * i;
			System.out.println(num + " x " + i + " = " + aux);
		}
	}
}
/*
TabuadaParcial num = new TabuadaParcial();
		
		num.tabuada();
*/
