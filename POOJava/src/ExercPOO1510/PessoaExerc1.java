package ExercPOO1510;

public class PessoaExerc1 {

	//atributo
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor
	public PessoaExerc1(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	//metodos
	public void movimentar() {
		System.out.println(nome + " se movimenta");
	}
	
	public void mostrarEndereco(String endereco) {
		System.out.println("Endereco: "+endereco);
	}
	
	public void mostrarTelefone(String telefone) {
		System.out.println("Telefone: "+telefone);
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

	
	
}
