package teste.estruturasSelecao;

public class TesteTriangulo {

	private double lado1;
	private double lado2;
	private double lado3;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	public String existeTriangulo(){
		boolean lado1Menor = lado1 < (lado2 + lado3);
		boolean lado2Menor = lado2 < (lado1 + lado3);
		boolean lado3Menor = lado3 < (lado1 + lado2);
		
		if (lado1Menor && lado2Menor && lado3Menor) {
			if(lado1 == lado2 && lado2 == lado3) {
				return "Eh possivel formar um triangulo equilatero";
			} else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				return "Eh possivel formar um triangulo escaleno";
			} else {
				return "Eh possivel formar um triangulo isosceles";
			}
		} else {
			return "Nao e possivel formar um triangulo";
		}
	}
}
/*Scanner sc = new Scanner(System.in);
TesteTriangulo triangulo = new TesteTriangulo();

System.out.print("Digite os lados do triangulo: ");
triangulo.setLado1(Double.parseDouble(sc.nextLine()));
triangulo.setLado2(Double.parseDouble(sc.nextLine()));
triangulo.setLado3(Double.parseDouble(sc.nextLine()));

System.out.println(triangulo.existeTriangulo());

sc.close();*/
