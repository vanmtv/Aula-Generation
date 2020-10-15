package ExercPOO1510;

public class TesteEmpregado1 {
		public static void main (String args[])
		{
		Empregado1 aurelia = new Empregado1("Aurelia Flores","Rua Ficticia,no.666","55566677788", 917654545, 15, 20, 3000, 10);

		aurelia.imprimirInfo();
		aurelia.calcularSalario();
		aurelia.validarCpf();
		}
}
