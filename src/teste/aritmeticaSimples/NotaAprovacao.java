package teste.aritmeticaSimples;

public class NotaAprovacao {
	
	private double p1;

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public String media() {
		double p2;
		p2 = (15 - p1) / 2;
		return "O aluno precisa de " + Math.round(p2 * 100.0) / 100.0 + " para ser aprovado";
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
NotaAprovacao aluno = new NotaAprovacao();

do {

	System.out.print("Digite a nota da primeira prova do aluno: ");
	aluno.setP1(Double.parseDouble(sc.nextLine()));
	
	System.out.println(aluno.media());

	System.out.println("\n0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/