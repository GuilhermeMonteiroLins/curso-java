package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
	
		int A;
		int B;
	
		System.out.println("Digite um n�mero A: ");
		A = input.nextInt();
		
		System.out.println("Digite um n�mero B: ");
		B = input.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("Os numeros A e B S�O MULTIPLOS!" );
		}
		else {
			System.out.println("Os numeros A e B N�O S�O MULTIPLOS!" );
		}
		
		input.close();
	}
}
