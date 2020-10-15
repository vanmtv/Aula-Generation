package PacoteExercPOO;

public class Exerc3ProdutoEletronico {
	public String nome;
	public double valor;
	public String categoria;
	public double imposto=0.50;

	
	public void mostrarInfos() {
		System.out.println("Nome do produto: "+ nome + "\nValor do produto: R$" + valor + "\nCategoria: "+categoria);
	}
	
	public void ligar() {
		System.out.println(nome+ " ligou...\n");
	}
}
