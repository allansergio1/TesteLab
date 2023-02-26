package teste.estruturasDados;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private String sexo;
	private Integer idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		 return pessoa.getIdade() - this.idade;
	}

}
