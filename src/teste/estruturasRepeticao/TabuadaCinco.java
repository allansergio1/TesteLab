package teste.estruturasRepeticao;

public class TabuadaCinco {
	
	private int n;

	public int getN() {
		return n;
	}
	
	public void tabuada() {
		System.out.println("Tabuada do cinco:");
		for (int i = 1; i <= 10; i++) {
			int aux = 5 * i;
			System.out.println("5 x " + i + " = " + aux);
		}
	}
}
/*
TabuadaCinco cinco = new TabuadaCinco();
		
		cinco.tabuada();
*/