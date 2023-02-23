package teste.estruturasSelecao;

public class MaiorValorV3 {

	private double valor1;
	private double valor2;
	private double valor3;

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

	public double getValor3() {
		return valor3;
	}

	public void setValor3(double valor3) {
		this.valor3 = valor3;
	}
	
	public String maiorValor3() {
		if (valor1 > valor2 && valor1 > valor3) {
			return valor1 + " e o maior valor";
		} else if (valor2 > valor1 && valor2 > valor3) {
			return valor2 + " e o maior valor";
		} else {
			return valor3 + " e o maior valor";
		}
	}
}
/*Scanner sc = new Scanner(System.in);
MaiorValorV3 valores = new MaiorValorV3();

System.out.print("Digite tres valores: ");
valores.setValor1(Double.parseDouble(sc.nextLine()));
valores.setValor2(Double.parseDouble(sc.nextLine()));
valores.setValor3(Double.parseDouble(sc.nextLine()));

System.out.println(valores.maiorValor3());

sc.close();*/
