package teste.aritmeticaSimples;

public class MediaGeometrica {

	private double n1;
	private double n2;

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public String mediaGeometrica() {
		double media;
			media = Math.sqrt((n1 * n2));
		return "A media geometrica dos valores eh: " + Math.round(media * 100.0)/100.0 + "\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
MediaGeometrica media = new MediaGeometrica();

do {

	System.out.print("Digite os numeros: ");
	media.setN1(Double.parseDouble(sc.nextLine()));
	media.setN2(Double.parseDouble(sc.nextLine()));
	
	System.out.print(media.mediaGeometrica());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/