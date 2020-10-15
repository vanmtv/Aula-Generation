package ExercPOO1510;

public class Vendedor extends PessoaExerc1{
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas, double comissao) {
		super(nome, endereco, cpf, telefone, idade);
		this.comissao = comissao;
		this.valorVendas = valorVendas;
	}

	//Valor Venda: correspondente ao valor monet�rio dos artigos vendidos
	//Comissao: porcentagem do valorVendas que ser� adicionado ao vencimento base do Vendedor
	public void calcularValorFinal() {
		double valorFinal = valorVendas + valorVendas*(comissao/100);
		System.out.println("Valor de Vendas + Comiss�o do(a) vendedor "+ getNome() + " ser� de R$ "+ valorFinal);
	}
	
	public void mostrarInfos() {
		System.out.println("\nNome do Vendedor: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endere�o: "+getEndereco()+"\n"+"Valor das Vendas: R$ "+ getValorVendas() + "\nComiss�o(em %): "+ getComissao());
	}
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
}
