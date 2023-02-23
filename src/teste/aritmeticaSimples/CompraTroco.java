package teste.aritmeticaSimples;

public class CompraTroco {

	private double v1;
	private double v2;
	private double v3;
	private double v4;
	private double v5;
	private double pagamento;

	public double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}

	public double getV3() {
		return v3;
	}

	public void setV3(double v3) {
		this.v3 = v3;
	}

	public double getV4() {
		return v4;
	}

	public void setV4(double v4) {
		this.v4 = v4;
	}

	public double getV5() {
		return v5;
	}

	public void setV5(double v5) {
		this.v5 = v5;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	
	public String troco() {
		double total = v1 + v2 + v3 + v4 + v5;
		double troco = pagamento - total;
		return "O troco da compra eh de: R$" + Math.round(troco * 100.0) / 100.0;
	}
}
/*
int op = 0;
Scanner sc = new Scanner(System.in);
CompraTroco compra = new CompraTroco();

do {

	System.out.print("Digite o valor dos produtos: ");
	compra.setV1(Double.parseDouble(sc.nextLine()));
	compra.setV2(Double.parseDouble(sc.nextLine()));
	compra.setV3(Double.parseDouble(sc.nextLine()));
	compra.setV4(Double.parseDouble(sc.nextLine()));
	compra.setV5(Double.parseDouble(sc.nextLine()));
	
	System.out.print("Digite o valor do pagamento: ");
	compra.setPagamento(Double.parseDouble(sc.nextLine()));
	
	System.out.println(compra.troco());

	System.out.println("\n0- Sair // 1- Testar novamente");
	op = Integer.parseInt(sc.nextLine());
	System.out.println("");
	
} while (op == 1);

sc.close();
*/
