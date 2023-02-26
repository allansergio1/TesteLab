package teste.estruturasDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaioresDe18V2 {

	Scanner sc = new Scanner(System.in);
	private Pessoa pessoa;
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();

	public void adicionarPessoas() {

		for (int i = 0; i < 20; i++) {
			pessoa = new Pessoa();
			System.out.println("Digite o nome, o sexo (M ou F) e a idade da pessoa " + (i + 1) + ":");
			System.out.print("Nome: ");
			pessoa.setNome(sc.nextLine());
			do {
				System.out.print("Sexo: ");
				pessoa.setSexo(sc.next().toUpperCase());
				if ((pessoa.getSexo().equalsIgnoreCase("F") || pessoa.getSexo().equalsIgnoreCase("M")) == false) {
					System.out.println("ERRO - CARACTERE ERRADO");
				}
			} while ((pessoa.getSexo().equalsIgnoreCase("F") || pessoa.getSexo().equalsIgnoreCase("M")) == false);
			do {
				System.out.print("Idade: ");
				pessoa.setIdade(sc.nextInt());
				if (pessoa.getIdade() < 0) {
					System.out.println("ERRO - IDADE MENOR QUE 0");
				}
			} while (pessoa.getIdade() < 0);
			pessoas.add(pessoa);
			System.out.print("\n");
			sc.nextLine();
		}
	}

	public void listarMaioresDe18() {
		int i = 0;

		System.out.println("---- Dados dos maiores de 18 ----\n");

		for (Pessoa p : pessoas) {
			if (p.getIdade() > 18) {
				System.out.println(p.toString());
				System.out.print("\n");
				i++;
			}
		}

		double pct = (double) i / pessoas.size() * 100;

		System.out.println("Quantidade de pessoas listadas: " + i);
		System.out.printf("Porcentagem dos listados em relacao aos digitados: %.2f%%%n", pct);
	}
}
/*
MaioresDe18V2 personas = new MaioresDe18V2();
		
		personas.adicionarPessoas();
		personas.listarMaioresDe18();
*/