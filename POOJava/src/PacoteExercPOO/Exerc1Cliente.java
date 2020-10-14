package PacoteExercPOO;

public class Exerc1Cliente {
	private String nomeCliente;
	private String cpf;
	
	void entra() {
		System.out.println("Cliente entrou na loja");
	}
	
	void mostraNome(String nomeCliente) {
		System.out.println(nomeCliente);
	}
	
	void mostraCPF(String cpf) {
		System.out.println(cpf);
	}
	
	void paga(double valorPago, double valorCompra) {
		if(valorCompra<=valorPago) {
			valorPago -= valorCompra;
			System.out.printf("\nPagar para o cliente R$ %.2f",valorPago);
		}
		else {
			valorCompra -= valorPago;
			System.out.printf("\nValor insuficiente. Adicione R$ %.2f", valorCompra);
		}
	}
	
}
