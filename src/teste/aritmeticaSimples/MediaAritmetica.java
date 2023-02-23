package teste.aritmeticaSimples;

public class MediaAritmetica {

	private double n1;
	private double n2;
	private double n3;
	private double n4;

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

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	public String mediaAritmetica() {
		double media;
		media = (n1 + n2 + n3 + n4) / 4;
		return "A media aritmetica dos valores eh: " + Math.round(media * 100.0) / 100.0 + "\n";
	}

}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
MediaAritmetica media = new MediaAritmetica();
		
do {
	
		System.out.print("Digite os numeros: ");
		media.setN1(Double.parseDouble(sc.nextLine()));
		media.setN2(Double.parseDouble(sc.nextLine()));
		media.setN3(Double.parseDouble(sc.nextLine()));
		media.setN4(Double.parseDouble(sc.nextLine()));
		
		System.out.print(media.mediaAritmetica());
	
		System.out.println("0- Sair // 1- Testar novamente");
		op = Integer.parseInt(sc.nextLine());
		System.out.println("");
			
} while (op == 1);
		
sc.close();
*/
