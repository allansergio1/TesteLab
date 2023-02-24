package teste.main;

import java.util.Scanner;

import teste.aritmeticaSimples.*;
import teste.estruturasRepeticao.*;
import teste.estruturasSelecao.*;

public class Main {

	public static void main(String[] args) {

		int op = 0;
		Scanner sc = new Scanner(System.in);
		TabuadaNumPositivo num = new TabuadaNumPositivo();

		do {

			System.out.print("Digite um numero para ver sua tabuada: ");
			num.setN(sc.nextInt());
			
			num.tabuada();
			
			System.out.println("\n0- Sair // 1- Testar novamente");
			op = sc.nextInt();
			System.out.println("");
			
		} while (op == 1);

		sc.close();
	}

}
