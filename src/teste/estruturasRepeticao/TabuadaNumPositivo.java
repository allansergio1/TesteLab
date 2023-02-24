package teste.estruturasRepeticao;

public class TabuadaNumPositivo {
	
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void tabuada() { //ver o negocio de travar a digitação pra aceitar apenas positivos
		System.out.println("Tabuada do " + Math.abs(this.n) + ":");
		for (int i = 1; i <= 10; i++) {
			int aux = Math.abs(this.n) * i;
			System.out.println(Math.abs(this.n) + " x " + i + " = " + aux);
		}
	}
}
/*
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
*/