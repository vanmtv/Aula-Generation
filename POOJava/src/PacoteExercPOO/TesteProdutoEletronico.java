package PacoteExercPOO;

public class TesteProdutoEletronico {
	public static void main(String args[]) {
	Exerc3ProdutoEletronico playstation = new Exerc3ProdutoEletronico();
	playstation.nome = "Playstation";
	playstation.categoria = "videogame";
	playstation.valor = 2000.00;
	
	playstation.mostrarInfos();
	playstation.ligar();
	
	Exerc3ProdutoEletronico televisao = new Exerc3ProdutoEletronico();
	televisao.nome = "LG WebOS";
	televisao.categoria = "televisor 50pol";
	televisao.valor = 2500.00;
	
	televisao.mostrarInfos();
	televisao.ligar();
	}
}
