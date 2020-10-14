package PacoteExercPOO;

public class Exerc2Aviao {
	String modelo;
	String tipoViagem;
	String cor;
	
	int quantViagensDia=0;
	double velocidadeAtual=0;
	double velocidadeMax;
	
	
	void liga() {
		System.out.println("Avião decola");
	}
	
	void acelera(double velocidade) {
		velocidade+=this.velocidadeAtual;
		this.velocidadeAtual = velocidade;
		System.out.println("Velocidade atual: "+velocidadeAtual);
	}
	
	void mostraModeloCor(String cor, String modelo) {
		System.out.println("Modelo "+modelo+ "\nCor: "+cor);
	}
	
	void mostraViagensDia(int viagem) {
		quantViagensDia+=viagem;
		System.out.println("Este avião realizou " + quantViagensDia + " viagens");
	}
}
