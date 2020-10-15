package ExercPOO1510;

public class testeVendedor {
	public static void main(String args[]) 
	{
		Vendedor dwight = new Vendedor("Dwight Schrute", "Rua Verde, no 17","89756423111", 988771122, 45, 1200.50, 60.60); 
		Vendedor michael = new Vendedor("Michael Scott", "Rua Evergreen Terrace,no 632", "85762021076", 45451212, 35, 2050.00, 150.00);
		
		dwight.mostrarInfos();
		dwight.calcularValorFinal();
		
		michael.mostrarInfos();
		michael.calcularValorFinal();
	}
}
