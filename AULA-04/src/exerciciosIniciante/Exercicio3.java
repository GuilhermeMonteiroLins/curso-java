package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		int A, B, C, D;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero A para saber a diferen�a: ");
		A = input.nextInt();
		
		System.out.println("Digite um numero B para saber a diferen�a: ");
		B = input.nextInt();
		
		System.out.println("Digite um numero C para saber a diferen�a: ");
		C = input.nextInt();
		
		System.out.println("Digite um numero D para saber a diferen�a: ");
		D = input.nextInt();
		
		int resultado = (A * B - C * D);
		
		System.out.println("A diferen�a entre os numero A, B, C, D � = " + resultado);
		
		input.close();

	}
}
