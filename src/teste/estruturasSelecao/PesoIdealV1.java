package teste.estruturasSelecao;

public class PesoIdealV1 {

	private double peso;
	private double altura;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String pesoIdeal() {
		double r = peso / Math.pow(altura, 2);
		if(r < 20) {
			return "Pessoa abaixo do peso";
		} else if(r >= 20 && r < 25) {
			return "Pessoa no peso ideal";
		} else {
			return "Pessoa acima do peso";
		}
	}
}
/*Scanner sc = new Scanner(System.in);
PesoIdealV1 pessoa = new PesoIdealV1();

System.out.print("Digite o peso e a altura da pessoa: ");
pessoa.setPeso(Double.parseDouble(sc.nextLine()));
pessoa.setAltura(Double.parseDouble(sc.nextLine()));

System.out.println(pessoa.pesoIdeal());

sc.close();*/
