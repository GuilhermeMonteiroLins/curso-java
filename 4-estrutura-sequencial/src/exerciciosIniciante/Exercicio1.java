package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a, b, soma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro A: ");
		a = input.nextInt();
		
		System.out.println("Digite um numero inteiro B: ");
		b = input.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma do numero A e B = " + soma);
		
		input.close();
		
	}

}
