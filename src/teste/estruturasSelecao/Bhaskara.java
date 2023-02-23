package teste.estruturasSelecao;

public class Bhaskara {

	private double ax2;
	private double bx;
	private double c;

	public double getAx2() {
		return ax2;
	}

	public void setAx2(double ax2) {
		this.ax2 = ax2;
	}

	public double getBx() {
		return bx;
	}

	public void setBx(double bx) {
		this.bx = bx;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	private double delta() {
		return Math.pow(bx, 2) - 4 * ax2 * c;
	}
	
	public String resultado() {
		if (delta() > 0) {
			double x1 = (-(bx) + Math.sqrt(delta())) / (2 * ax2);
			double x2 = (-(bx) - Math.sqrt(delta())) / (2 * ax2);
			return "Duas raizes: " + Math.round(x1 * 100.0) / 100.0 + " e " + Math.round(x2 * 100.0) / 100.0;
		} else if (delta() == 0) {
			double x = 0;
			double x1 = (-(bx) + Math.sqrt(delta())) / (2 * ax2);
			double x2 = (-(bx) - Math.sqrt(delta())) / (2 * ax2);
			if (x1 == x2) {
				x = Math.abs(x1);
			}
			return "Duas raizes iguais: " + Math.round(x * 100.0) / 100.0;
		} else {
			return "Delta negativo - Nenhuma raiz";
		}
	}
}

/*Scanner sc = new Scanner(System.in);
Bhaskara b = new Bhaskara();

System.out.print("Digite tres valores: ");
b.setAx2(Double.parseDouble(sc.nextLine()));
b.setBx(Double.parseDouble(sc.nextLine()));
b.setC(Double.parseDouble(sc.nextLine()));

System.out.println(b.resultado());

sc.close();*/
