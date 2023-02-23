package teste.estruturasRepeticao;

import java.util.Scanner;

public class SexoMOuF {

	Scanner sc = new Scanner(System.in);
	private String sexo;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void verificar() {
		boolean aux = false;
		do {
			System.out.println("Digite o sexo da pessoa (M ou F): ");
			this.sexo = sc.next();
			if (this.sexo.equalsIgnoreCase("M") == true) {
				aux = false;
			} else if (this.sexo.equalsIgnoreCase("F") == true) {
				aux = false;
			} else {
				aux = true;
			}
		} while (aux == true);
		sc.close();
	}
}
/*
SexoMOuF sex = new SexoMOuF();
		
		sex.verificar();
*/