package teste.aritmeticaSimples;

public class CotacaoDolar {

	private double cotacao;
	private double dolar;

	public double getCotacao() {
		return cotacao;
	}

	public void setCotacao(double cotacao) {
		this.cotacao = cotacao;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public String converterDolarReal() {
		double resultado;
		resultado = dolar * cotacao;
		return "O valor equivalente em real eh: R$ " + Math.round(resultado * 100.0) / 100.0 + "\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
CotacaoDolar moeda = new CotacaoDolar();

do {

	System.out.print("Digite o valor da cotação do dolar e o valor do dolar: ");
	moeda.setCotacao(Double.parseDouble(sc.nextLine()));
	moeda.setDolar(Double.parseDouble(sc.nextLine()));
	
	System.out.println(moeda.converterDolarReal());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/