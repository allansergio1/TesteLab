package teste.estruturasDados;

import java.util.Scanner;

public class OrdemInversa {
	
	Scanner sc = new Scanner(System.in);
	private int[] numeros = new int[10];
	
	public void valores() {
		
		System.out.println("Digite 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros na ordem inversa:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        sc.close();
	}
}
/*
OrdemInversa oi = new OrdemInversa();
		
		oi.valores();
*/