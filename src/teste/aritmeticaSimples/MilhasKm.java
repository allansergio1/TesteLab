package teste.aritmeticaSimples;

public class MilhasKm {
	
	private double n;

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}
	
	public String converterMilhaKm() {
		double resultado;
			resultado = n * 1.852;
		return "O valor dado em quilometros eh: " + Math.round(resultado * 100.0)/100.0 + " km\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
MilhasKm valor = new MilhasKm();

do {

	System.out.print("Digite o valor a ser convertido: ");
	valor.setN(Double.parseDouble(sc.nextLine()));
	
	System.out.print(valor.converterMilhaKm());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/