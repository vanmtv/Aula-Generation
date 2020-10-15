package PacoteExercPOO;

public class TesteFunc {
	public static void main(String args[]) {
	Exerc4Funcionario helena = new Exerc4Funcionario();
	helena.nome = "Helena";
	helena.idade = 54;
	helena.salario = 5000.00;
	helena.setor = "Limpeza";
	helena.mostrarInfos();
	helena.fimExpediente();
	
	
	Exerc4Funcionario roberta = new Exerc4Funcionario();	
	roberta.nome = "Roberta";
	roberta.idade = 35;
	roberta.salario = 4800.00;
	roberta.setor = "Controladoria";
	roberta.mostrarInfos(); 
	roberta.fimExpediente();
}	
}
