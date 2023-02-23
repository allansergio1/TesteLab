package teste.aritmeticaSimples;

public class VolumeEsfera {

	private double diametro;

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public String calcularVolumeEsfera() {
		double volume;
		volume = (4 * Math.PI * Math.pow((diametro / 2), 3)) / 3;
		return "O volume da esfera eh: " + Math.round(volume * 100.0) / 100.0 + " cm3";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
VolumeEsfera esfera = new VolumeEsfera();

do {

	System.out.print("Digite o diametro da esfera: ");
	esfera.setDiametro(Double.parseDouble(sc.nextLine()));

	System.out.println(esfera.calcularVolumeEsfera() + "\n");
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/