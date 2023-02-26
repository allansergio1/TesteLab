package teste.estruturasRepeticao;

public class Bergamaschi {

	public void sequencia() {
		int n = 20;
        int b1 = 1, b2 = 1, b3 = 1;

        System.out.print(b1 + " " + b2 + " " + b3 + " ");

        for (int i = 4; i <= n; i++) {
            int b = b1 + b2 + b3;
            b1 = b2;
            b2 = b3;
            b3 = b;
            System.out.print(b + " ");
        }
	}
}
/*
Bergamaschi berga = new Bergamaschi();
		
		berga.sequencia();
*/