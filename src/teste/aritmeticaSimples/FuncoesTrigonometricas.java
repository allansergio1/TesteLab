package teste.aritmeticaSimples;

public class FuncoesTrigonometricas {

	private double angulo;

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}

	public String calcularTrigonometria() {
		double seno, cosseno, tangente, secante;
		seno = Math.sin((angulo * Math.PI) / 180);
		seno = Math.round(seno * 10000.0) / 10000.0;
		cosseno = Math.cos((angulo * Math.PI) / 180);
		cosseno = Math.round(cosseno * 10000.0) / 10000.0;
		tangente = Math.tan((angulo * Math.PI) / 180);
		tangente = Math.round(tangente * 10000.0) / 10000.0;
		secante = 1 / Math.cos((angulo * Math.PI) / 180);
		secante = Math.round(secante * 10000.0) / 10000.0;
		return "Seno: " + seno + " rad" + "\nCosseno: " + cosseno + " rad" + "\nTangente: " + tangente + " rad"
				+ "\nSecante: " + secante + " rad" + "\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
FuncoesTrigonometricas funcoes = new FuncoesTrigonometricas();

do {

	System.out.print("Digite o valor do angulo em graus: ");
	funcoes.setAngulo(Double.parseDouble(sc.nextLine()));
	
	System.out.println(funcoes.calcularTrigonometria());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/