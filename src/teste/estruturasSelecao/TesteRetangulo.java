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

	private boolean triangulo() {
		boolean lado1Menor = lado1 < (lado2 + lado3);
		boolean lado2Menor = lado2 < (lado1 + lado3);
		boolean lado3Menor = lado3 < (lado1 + lado2);

		if (lado1Menor && lado2Menor && lado3Menor) {
			return true;
		} else {
			return false;
		}
	}

	public String existeTrianguloRetangulo() {
		if (triangulo()) {
			if (trianguloRetangulo(lado1, lado2, lado3) || trianguloRetangulo(lado2, lado3, lado1)
					|| trianguloRetangulo(lado3, lado1, lado2)) {
				return "Eh possivel formar um triangulo retangulo com esses valores";
			} else {
				return "Nao e possivel formar um triangulo retangulo";
			}
		} else {
			return "Nao e possivel formar nem um triangulo";
		}
	}

	public boolean trianguloRetangulo(double hipotenusa, double cateto1, double cateto2) {
		return (Math.pow(hipotenusa, 2)) == (Math.pow(cateto1, 2)) + (Math.pow(cateto2, 2));
	}
}
/*
 * Scanner sc = new Scanner(System.in); TesteRetangulo triangulo = new
 * TesteRetangulo();
 * 
 * System.out.print("Digite os lados do triangulo: ");
 * triangulo.setLado1(Double.parseDouble(sc.nextLine()));
 * triangulo.setLado2(Double.parseDouble(sc.nextLine()));
 * triangulo.setLado3(Double.parseDouble(sc.nextLine()));
 * 
 * System.out.println(triangulo.existeTriangulo());
 * 
 * sc.close();
 */