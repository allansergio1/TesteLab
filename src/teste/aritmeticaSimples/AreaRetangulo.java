package teste.aritmeticaSimples;

public class AreaRetangulo {

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

	public String calcularAreaRetangulo() {
		double area = 0.0;
		area = base * altura;
		return "A área do retângulo é: " + Math.round(area * 100.0) / 100.0 + "cm²\n";
	}
}

/*
int op = 0;
Scanner sc = new Scanner(System.in);
AreaRetangulo retangulo = new AreaRetangulo();

do {

	System.out.println("Digite o valor da base e da altura do retangulo: ");
	retangulo.setAltura(Double.parseDouble(sc.nextLine()));
	retangulo.setBase(Double.parseDouble(sc.nextLine()));
	System.out.println("A area do retangulo e: " + retangulo.calcularAreaRetangulo());
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");

} while (op == 1)

sc.close();*/