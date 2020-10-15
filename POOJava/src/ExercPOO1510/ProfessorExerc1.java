package ExercPOO1510;

public class ProfessorExerc1 extends PessoaExerc1{
	private String disciplina;
	
	public ProfessorExerc1(String nome, String endereco, String telefone, String disciplina) {
		super(nome,endereco, telefone);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
