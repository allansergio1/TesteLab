package teste.estruturasSelecao;

public class VelocidadePermitida {

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
	
	private double velocidade() {
		double v = (v0 + (a * t)) * 3.6;
		return Math.round(v * 100.0) / 100.0; 
	}
	
	public String velocidadePermitida() {
		String str = null;
		if (velocidade() <= 40) {
			str = "Velocidade: " + velocidade() + " km/h" + "\nVeiculo muito lento";
		} else if (velocidade() > 40 && velocidade() <= 60) {
			str = "Velocidade: " + velocidade() + " km/h" + "\nVelocidade permitida";
		} else if (velocidade() > 60 && velocidade() <= 80) {
			str = "Velocidade: " + velocidade() + " km/h" + "\nVelocidade de cruzeiro";
		} else if (velocidade() > 80 && velocidade() <= 120) {
			str = "Velocidade: " + velocidade() + " km/h" + "\nVeiculo rapido";
		} else if (velocidade() > 120) {
			str = "Velocidade: " + velocidade() + " km/h" + "\nVeiculo muito rapido";
		}
		return str;
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
VelocidadePermitida veiculo = new VelocidadePermitida();

do {

	System.out.print("Digite a aceleracao, a velocidade inicial e o tempo de percurso do veiculo: ");
	veiculo.setA(Double.parseDouble(sc.nextLine()));
	veiculo.setV0(Double.parseDouble(sc.nextLine()));
	veiculo.setT(Double.parseDouble(sc.nextLine()));
	

	System.out.println(veiculo.velocidadePermitida() + "\n");
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/
