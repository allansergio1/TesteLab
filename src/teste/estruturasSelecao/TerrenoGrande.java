package teste.estruturasSelecao;

public class TerrenoGrande {

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
	
	public String ehGrande() {
		if(calcularAreaRetangulo() > 100) {
			return "A area do terreno eh: " + calcularAreaRetangulo() + " m2\n" 
					+ "Eh um terreno grande!";
		} else {
			return "A area do terreno eh: " + calcularAreaRetangulo() + " m2\n";
		}
	}
}
/*Scanner sc = new Scanner(System.in);
TerrenoGrande terreno = new TerrenoGrande();

System.out.print("Digite dois valores: ");
terreno.setAltura(Double.parseDouble(sc.nextLine()));
terreno.setBase(Double.parseDouble(sc.nextLine()));

System.out.println(terreno.ehGrande());

sc.close();*/