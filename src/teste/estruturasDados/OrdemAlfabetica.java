package teste.estruturasDados;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabetica {

	String[] nomes = new String[5];
	Scanner sc = new Scanner(System.in);

	public void ordenar() {

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome " + (i + 1) + ": ");
			nomes[i] = sc.nextLine();
		}

		Arrays.sort(nomes);

		System.out.println("\nNomes em ordem alfabetica: ");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
/*
OrdemAlfabetica nomes = new OrdemAlfabetica();
		
		nomes.ordenar();
*/