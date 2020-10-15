package ExercPOO1510;

public class Administrador extends PessoaExerc1{
	
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade, double ajudaDeCusto) {
		super(nome, endereco, cpf, telefone, idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void mostrarInfos() {
		System.out.println("\nNome do administrador: "+getNome()+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
		+"\n"+"Endereço: "+getEndereco()+"\n"+"Ajuda de custo no valor de R$ "+getAjudaDeCusto());
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
}
