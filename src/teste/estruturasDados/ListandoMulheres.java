package teste.estruturasDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListandoMulheres {

	Scanner sc = new Scanner(System.in);
	private Pessoa pessoa;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void adicionarPessoas() {

		for (int i = 0; i < 20; i++) {
			pessoa = new Pessoa();
			System.out.println("Digite o nome, o sexo e a idade da pessoa " + (i + 1) + ":");
			System.out.print("Nome: ");
			pessoa.setNome(sc.nextLine());
			do {
				System.out.print("Sexo: ");
				pessoa.setSexo(sc.next().toUpperCase());
			} while ((pessoa.getSexo().equalsIgnoreCase("F") || pessoa.getSexo().equalsIgnoreCase("M")) == false);
			do {
				System.out.print("Idade: ");
				pessoa.setIdade(sc.nextInt());
			} while (pessoa.getIdade() < 0);
			pessoas.add(pessoa);
			System.out.print("\n");
			sc.nextLine();
		}
	}

	public void listarMulheres() {
		System.out.println("---- Dados das mulheres ----\n");
		for (Pessoa p : pessoas) {
			if (p.getSexo().equalsIgnoreCase("F")) {
				System.out.println(p.toString());
				System.out.print("\n");
			}
		}
	}

	/*public void listarPessoas() {
		System.out.println("---- Dados das pessoas ----\n");
		for (Pessoa p : pessoas) {
			// System.out.println("Pessoa " + (pessoas.indexOf(p) + 1));
			System.out.println(p.toString());
			System.out.print("\n");
		}
	}*/
}
/*
ListandoMulheres personas = new ListandoMulheres();
		
		personas.adicionarPessoas();
		personas.listarMulheres();
*/
