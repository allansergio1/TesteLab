package teste.estruturasSelecao;

public class MaiorValorV1 {

	private double valor1;
	private double valor2;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public String maiorValor() {
		if (valor1 > valor2) {
			return valor1 + " e o maior valor";
		} else {
			return valor2 + " e o maior valor";
		}
	}
}

/*Scanner sc = new Scanner(System.in);
MaiorValorV1 valores = new MaiorValorV1();

System.out.print("Digite dois valores: ");
valores.setValor1(Double.parseDouble(sc.nextLine()));
valores.setValor2(Double.parseDouble(sc.nextLine()));

System.out.println(valores.maiorValor());

sc.close();*/