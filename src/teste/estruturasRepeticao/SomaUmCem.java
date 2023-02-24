package teste.estruturasRepeticao;

//import java.util.Scanner;

public class SomaUmCem {
	
	//Scanner sc = new Scanner(System.in);
	//private int num;
	
	public void soma() {
		int total = 1;
		System.out.println("Soma dos numeros inteiros positivos do intervalo de 1 a 100: ");
		for (int i = 2; i <= 100; i++) {
	         System.out.println(total + " + " + i + " = " + (total += i));
	    }
	}
}
/*
 SomaUmCem soma = new SomaUmCem();
		
		soma.soma();
*/