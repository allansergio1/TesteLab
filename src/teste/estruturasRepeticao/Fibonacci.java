package teste.estruturasRepeticao;

public class Fibonacci {

	public void sequencia() {
		
		int n = 30;
		int a = 0;
		int b = 1;
		int c;

		System.out.println("Os " + n + " primeiros valores da serie de Fibonacci sao:");

		for (int i = 1; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}
}
