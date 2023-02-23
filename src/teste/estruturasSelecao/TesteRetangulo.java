package teste.estruturasSelecao;

public class TesteRetangulo {

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

	private double hipotenusa() {
		if (lado1 > lado2 && lado1 > lado3) {
			return lado1;
		} else if (lado2 > lado1 && lado2 > lado3) {
			return lado2;
		} else {
			return lado3;
		}
	}

	/*public String existeTriangulo() {
		if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			if (lado1 == hipotenusa() && (Math.pow(hipotenusa(), 2)) == (Math.pow(lado2, 2)) + (Math.pow(lado3, 2))) {
				return "Eh possivel formar um triangulo retangulo com esses valores";
			} else if (lado2 == hipotenusa()
					&& (Math.pow(hipotenusa(), 2)) == (Math.pow(lado3, 2)) + (Math.pow(lado1, 2))) {
				return "Eh possivel formar um triangulo retangulo com esses valores";
			} else if (lado3 == hipotenusa()
					&& (Math.pow(hipotenusa(), 2)) == (Math.pow(lado1, 2)) + (Math.pow(lado2, 2))) {
				return "Eh possivel formar um triangulo retangulo com esses valores";
			}
		} else {
			return "Nao e possivel formar um triangulo retangulo";
		}
	}*/

	public String existeTriangulo() {
		if (lado1 == hipotenusa() && (Math.pow(hipotenusa(), 2)) == (Math.pow(lado2, 2)) + (Math.pow(lado3, 2))) {
			return "Eh possivel formar um triangulo retangulo com esses valores";
		} else if (lado2 == hipotenusa()
				&& (Math.pow(hipotenusa(), 2)) == (Math.pow(lado3, 2)) + (Math.pow(lado1, 2))) {
			return "Eh possivel formar um triangulo retangulo com esses valores";
		} else if (lado3 == hipotenusa()
				&& (Math.pow(hipotenusa(), 2)) == (Math.pow(lado1, 2)) + (Math.pow(lado2, 2))) {
			return "Eh possivel formar um triangulo retangulo com esses valores";
		} else {
			return "Nao e possivel formar um triangulo retangulo";
		}
	}
} 
/*Scanner sc = new Scanner(System.in);
TesteRetangulo triangulo = new TesteRetangulo();

System.out.print("Digite os lados do triangulo: ");
triangulo.setLado1(Double.parseDouble(sc.nextLine()));
triangulo.setLado2(Double.parseDouble(sc.nextLine()));
triangulo.setLado3(Double.parseDouble(sc.nextLine()));

System.out.println(triangulo.existeTriangulo());

sc.close();
*/