package ExercPOO1510;

public class Operario extends PessoaExerc1 {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao,
			double comissao) {
		super(nome, endereco, cpf, telefone, idade);
		this.comissao = comissao;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "Idade:"
				+ getIdade() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endere�o: " + getEndereco() + "\n" 
				+ "\n" + "Valor Produ��o:" + valorProducao + "\n" + "Porcentagem (sem '%') da comiss�o deste artigo: "
				+ comissao);
	}

	public void calcularValorArtigo() {
		double valor_total = valorProducao + (valorProducao * (comissao / 100));
		System.out.println("O valor total a ser recebido pelo oper�rio: " + getNome() + " � igual a: " + valor_total);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}
