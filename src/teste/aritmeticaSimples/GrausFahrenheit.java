package teste.aritmeticaSimples;

public class GrausFahrenheit {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String converterCelsiusFahr() {
		double resultado;
		resultado = (valor * 1.8) + 32;
		return "A temperatura equivalente em Fahrenreit eh: " + Math.round(resultado * 100.0) / 100.0 + " F\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
GrausFahrenheit temperatura = new GrausFahrenheit();

do {

	System.out.print("Digite o valor da temperatura a ser convertida: ");
	temperatura.setValor(Double.parseDouble(sc.nextLine()));
	
	System.out.println(temperatura.converterCelsiusFahr());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/