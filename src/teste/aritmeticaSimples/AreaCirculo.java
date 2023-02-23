package teste.aritmeticaSimples;

public class AreaCirculo {

	private double diametro;

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public String calcularAreaCirculo() {
		double area;
		area = Math.PI * Math.pow((diametro / 2), 2);
		return "A area do circulo eh: " + Math.round(area * 100.0) / 100.0 + " cm2\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
AreaCirculo circulo = new AreaCirculo();

do {

	System.out.print("Digite o valor do diametro do circulo: ");
	circulo.setDiametro(Double.parseDouble(sc.nextLine()));
	
	System.out.println(circulo.calcularAreaCirculo());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/
