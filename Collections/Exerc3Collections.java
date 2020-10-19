package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Exerc3Collections {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		List<String> estoque = new ArrayList<String>();
		String produto;
		int opcao;
		System.out.println("Bem vindo ao Estoque!");
		
		 do {
			 System.out.println("\nDeseja "
						+ "\n( 1 ) Adicionar produto ao estoque"
						+ "\n( 2 ) Remover"
						+ "\n( 3 ) Atualizar produto do estoque "
						+ "\n( 4 ) Listar os produtos do estoque"
						+ "\n( 0 ) Sair do Menu"
						+ "\nDigite: ");
			
			 opcao = ler.nextInt();
			 switch(opcao) {
			 case 1:
				 //adicionar
				 System.out.println("Digite o nome do produto para ADICIONAR: ");
				 produto = ler.next();
				 estoque.add(produto);
				 System.out.println("Produto adicionado");
				 break;
			 case 2:
				 //remover
				 System.out.println("Digite o nome do produto para REMOVER: ");
				 produto = ler.next();
				 estoque.remove(produto);
				 System.out.println("Produto removido");
				 break;

			 case 3:
				 //atualizar
				 System.out.println("Digite o nome do produto para ATUALIZAR: ");
				 produto = ler.next();
				 System.out.println("Qual será o novo produto?  ");
				 String novo = ler.next();
				 estoque.set(estoque.indexOf(produto), novo);
				 System.out.println("Produto atualizado");
				 break;
			 case 4:
				 //listar produtos do estoque
				 System.out.println("Produtos do Estoque: "+ estoque); 
				 break;
			default:
				System.out.println("Nenhum resultado encontrado");
				break;
			 }
			 }
			 while(opcao!=0);
	
	}
}
