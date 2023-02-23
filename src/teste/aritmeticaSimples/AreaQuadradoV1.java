package teste.aritmeticaSimples;

public class AreaQuadradoV1 {

	private double aresta;

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public String calcularAreaQuadrado() {
		double area = 0.0;
		area = Math.pow(aresta, 2);
		return "A área do quadrado é: " + Math.round(area * 100.0) / 100.0 + " cm²\n";
	}
}

/*
int op = 0;
Scanner sc = new Scanner(System.in);
AreaQuadradoV1 quadrado = new AreaQuadradoV1();

do {

	System.out.println("Digite o valor da aresta do quadrado: ");
	quadrado.setAresta(Double.parseDouble(sc.nextLine()));
	System.out.println("A area do quadrado e: " + quadrado.calcularAreaQuadrado());
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
			
} while (op == 1);

sc.close();*/
