package PacoteExercPOO;

public class Exerc4Funcionario {
	public String nome;
	public int idade;
	public String setor;
	public double salario;
	
	public void mostrarInfos() {
		System.out.println("Nome do funcionario: "+ nome + "\nIdade: "+ idade+"anos \nSetor: "+ setor +"\nSalario: R$" + salario);
	}
	
	public void fimExpediente() {
		System.out.println("Fim de Expediente: Funcionario "+nome+"sai");
	}
}
