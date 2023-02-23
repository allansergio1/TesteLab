package teste.estruturasSelecao;

public class PesoIdealV2 {

	private String sexo;
	private double peso;
	private double altura;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

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
		String str = null;
		double r = peso / Math.pow(altura, 2);
		if (sexo.equalsIgnoreCase("Masculino")) {
			if (r < 20) {
				str = "Pessoa abaixo do peso";
			} else if (r >= 20 && r < 25) {
				str = "Pessoa no peso ideal";
			} else {
				str = "Pessoa acima do peso";
			}
		} else if (sexo.equalsIgnoreCase("Feminino")) {
			if (r < 19) {
				str = "Pessoa abaixo do peso";
			} else if (r >= 19 && r < 24) {
				str = "Pessoa no peso ideal";
			} else {
				str = "Pessoa acima do peso";
			}
		}
		return str;
	}
}
/*int op = 0;
Scanner sc = new Scanner(System.in);
PesoIdealV2 pessoa = new PesoIdealV2();

do {

	System.out.print("Digite o sexo, o peso e a altura da pessoa: ");
	pessoa.setSexo(sc.nextLine());
	pessoa.setPeso(Double.parseDouble(sc.nextLine()));
	pessoa.setAltura(Double.parseDouble(sc.nextLine()));

	System.out.println(pessoa.pesoIdeal() + "\n");
	
	System.out.println("0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	
} while (op == 1);

sc.close();*/
