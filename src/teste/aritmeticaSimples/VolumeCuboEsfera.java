package teste.aritmeticaSimples;

public class VolumeCuboEsfera {

	private double raio;
	private double aresta;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public String calcularVolumeEsferaCubo() {
		double volume;
		if (2 * raio == aresta) {
			volume = Math.pow(aresta, 3) - (4 * Math.PI * Math.pow(raio, 3) / 3);
			return "O volume livre eh de: " + Math.round(volume * 100.0) / 100.0 + " cm3\n";
		} else {
			return "A esfera nao esta inscrita no cubo.\n";
		}
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
VolumeCuboEsfera figura = new VolumeCuboEsfera();

do {

	System.out.print("Digite o valor da aresta do cubo e do raio da esfera: ");
	figura.setAresta(Double.parseDouble(sc.nextLine()));
	figura.setRaio(Double.parseDouble(sc.nextLine()));
	
	System.out.println(figura.calcularVolumeEsferaCubo());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/
