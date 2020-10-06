package PacoteJava;

import java.util.Scanner;

public class idadePessoa {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade, ano, mes, dia;
		System.out.println("Digite a ano de nascimento: ");
		ano = ler.nextInt();
		System.out.println("Digite seu mês de nascimento: ");
		mes = ler.nextInt();
		System.out.println("Digite seu dia de nascimento: ");
		dia = ler.nextInt();
		
		idade = (2020 - ano)*365 + mes*30 + dia;
				
		System.out.println(idade);
	}
}
