package teste.aritmeticaSimples;

public class AreaTriangulo {

	private double base;
	private double altura;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String calcularAreaTriangulo() {
		double area = 0.0;
		area = (base * altura) / 2;
		return "A area do triangulo eh: " + Math.round(area * 100.0) / 100.0 + " cm2";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
AreaTriangulo triangulo = new AreaTriangulo();

do {

	System.out.print("Digite a base e a altura do triangulo: ");
	triangulo.setBase(Double.parseDouble(sc.nextLine()));
	triangulo.setAltura(Double.parseDouble(sc.nextLine()));

	System.out.println(triangulo.calcularAreaTriangulo() + "\n");
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/