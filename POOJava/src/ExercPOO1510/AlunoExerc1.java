package ExercPOO1510;

public class AlunoExerc1 extends PessoaExerc1{
	String serieCursando;
	
	AlunoExerc1(String nome, String endereco, String telefone, String serieCursando)
	{
		super(nome,endereco, telefone);
		this.serieCursando = serieCursando;
	}

	public String getSerieCursando() {
		return serieCursando;
	}

	public void setSerieCursando(String serieCursando) {
		this.serieCursando = serieCursando;
	}
		
}
