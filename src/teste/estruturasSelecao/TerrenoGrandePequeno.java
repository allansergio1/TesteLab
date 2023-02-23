package teste.estruturasSelecao;

public class TerrenoGrandePequeno {

	private double altura;
	private double base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	private double calcularAreaRetangulo() {
		double area = 0.0;
		area = base * altura;
		return Math.round(area * 100.0) / 100.0;
	}

	public String ehGrandeOuPequeno() {
		if (calcularAreaRetangulo() > 100) {
			return "O terreno possui: " + calcularAreaRetangulo() + " m2\n" + "Eh um terreno grande!";
		} else {
			return "O terreno possui: " + calcularAreaRetangulo() + " m2\n" + "Eh um terreno pequeno!";
		}
	}
}
/*Scanner sc = new Scanner(System.in);
TerrenoGrandePequeno terreno = new TerrenoGrandePequeno();

System.out.print("Digite dois valores: ");
terreno.setAltura(Double.parseDouble(sc.nextLine()));
terreno.setBase(Double.parseDouble(sc.nextLine()));

System.out.println(terreno.ehGrandeOuPequeno());

sc.close();*/
