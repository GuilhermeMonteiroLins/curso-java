package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	
		int A;
		int B;
	
		System.out.println("Digite um número A: ");
		A = input.nextInt();
		
		System.out.println("Digite um número B: ");
		B = input.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Os numeros A e B SÃO MULTIPLOS!" );
		}
		else {
			System.out.println("Os numeros A e B NÃO SÃO MULTIPLOS!" );
		}
		
		input.close();
	}
}
