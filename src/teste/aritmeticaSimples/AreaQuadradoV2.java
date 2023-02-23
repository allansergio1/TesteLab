package teste.aritmeticaSimples;

public class AreaQuadradoV2 {

	private double diagonal;

	public double getDiagonal() {
		return diagonal;
	}

	public void setDiagonal(double diagonal) {
		this.diagonal = diagonal;
	}

	public String calcularAreaQuadrado2() {
		double area = 0.0;
		area = Math.pow(diagonal, 2) / 2;
		return "A área do quadrado é: " + Math.round(area * 100.0) / 100.0 + " cm²\n";
	}
}

/*
int op = 0;
Scanner sc = new Scanner(System.in);
AreaQuadradoV2 quadrado = new AreaQuadradoV2();

do {

	System.out.println("Digite o valor da aresta do quadrado: ");
	quadrado.setDiagonal(Double.parseDouble(sc.nextLine()));
	System.out.println("A area do quadrado e: " + quadrado.calcularAreaQuadrado2());
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");

} while (op == 1);

sc.close();*/