package teste.aritmeticaSimples;

public class VolumeCone {

	private double altura;
	private double raio;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public String calcularVolumeCone() {
		double volume;
		volume = ((Math.PI * Math.pow(raio, 2)) * altura) / 3;
		return "O volume da esfera eh: " + Math.round(volume * 100.0) / 100.0 + " cm3\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
VolumeCone cone = new VolumeCone();

do {

	System.out.print("Digite o valor da altura e do raio do cone: ");
	cone.setAltura(Double.parseDouble(sc.nextLine()));
	cone.setRaio(Double.parseDouble(sc.nextLine()));
	
	System.out.println(cone.calcularVolumeCone());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/