package teste.estruturasSelecao;

public class AlunoAprovado {

	private double p1;
	private double p2;

	public double getP1() {
		return p1;
	}

	public void setP1(double p1) {
		this.p1 = p1;
	}

	public double getP2() {
		return p2;
	}

	public void setP2(double p2) {
		this.p2 = p2;
	}

	private double media() {
		double media;
		media = (p1 + 2 * p2) / 3;
		return Math.round(media * 100.0) / 100.0;
	}
	
	public String resultadoAluno() {
		String str = null;
		if (media() >= 5) {
			str = "Media: " + media() + "\nAluno APROVADO";
		} else {
			str = "Media: " + media() + "\nAluno REPROVADO";
		}
		return str;
	}
}
/*int op = 0;
Scanner sc = new Scanner(System.in);
AlunoAprovado aluno = new AlunoAprovado();

do {

	System.out.print("Digite as duas notas do aluno: ");
	aluno.setP1(Double.parseDouble(sc.nextLine()));
	aluno.setP2(Double.parseDouble(sc.nextLine()));

	System.out.println(aluno.resultadoAluno() + "\n");
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();*/
