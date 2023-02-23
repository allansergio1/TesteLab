package teste.aritmeticaSimples;

public class LeiOhm {

	private double resistencia;
	private double corrente;

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}

	public double getCorrente() {
		return corrente;
	}

	public void setCorrente(double corrente) {
		this.corrente = corrente;
	}

	public String calcularTensao() {
		double tensao;
		tensao = resistencia * corrente;
		return "A tensao eletrica eh: " + Math.round(tensao * 100.0) / 100.0 + "V\n";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
LeiOhm tensao = new LeiOhm();

do {

	System.out.print("Digite o valor da resistencia e da corrente do circuito: ");
	tensao.setResistencia(Double.parseDouble(sc.nextLine()));
	tensao.setCorrente(Double.parseDouble(sc.nextLine()));
	
	System.out.print(tensao.calcularTensao());

	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/