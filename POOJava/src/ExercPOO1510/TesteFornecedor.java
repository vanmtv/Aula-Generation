package ExercPOO1510;

public class TesteFornecedor {
	public static void main(String args[]) {
		Fornecedor marcela = new Fornecedor("Marcela","Rua Eragon, nº222","56256256256",988885555, 21, 900.00, 500.00);
		Fornecedor eleonor = new Fornecedor("Eleonor", "Rua Solar, nº333", "77788899977",988887777, 26, 700.00, 600.00);

		marcela.imprimirInfo();
		marcela.validarCpf();
		marcela.obterSaldo();
		eleonor.imprimirInfo();
		eleonor.validarCpf();
		eleonor.obterSaldo();

		}
}
