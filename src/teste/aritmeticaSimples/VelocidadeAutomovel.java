package teste.aritmeticaSimples;

public class VelocidadeAutomovel {
	
	private double a;
	private double v0;
	private double t;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getV0() {
		return v0;
	}

	public void setV0(double v0) {
		this.v0 = v0;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}
	
	public String calcularVelocidade() {
		double velocidade;
			velocidade = (v0 + (a * t)) * 3.6;
		return "A velocidade final do automovel eh: " + Math.round(velocidade * 100.0)/100.0 + " km/h\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
VelocidadeAutomovel carro = new VelocidadeAutomovel();

do {

	System.out.print("Digite o valor da aceleracao, do tempo de percurso e velocidade inicial do automovel: ");
	carro.setA(Double.parseDouble(sc.nextLine()));
	carro.setT(Double.parseDouble(sc.nextLine()));
	carro.setV0(Double.parseDouble(sc.nextLine()));
	
	System.out.println(carro.calcularVelocidade());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/
