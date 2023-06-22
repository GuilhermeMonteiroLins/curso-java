package exerciciosWhile;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero X:");
		int x = input.nextInt();
		
		System.out.println("Insira um numero y:");
		int y = input.nextInt();
		
		while(x != 0 || y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
				System.out.println("Insira um numero X:");
				x = input.nextInt();
				System.out.println("Insira um numero y:");
				y = input.nextInt();
				
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
				System.out.println("Insira um numero X:");
				x = input.nextInt();				
				System.out.println("Insira um numero y:");
				y = input.nextInt();
				
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
				System.out.println("Insira um numero X:");
				x = input.nextInt();				
				System.out.println("Insira um numero y:");
				y = input.nextInt();
				
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
				System.out.println("Insira um numero X:");
				x = input.nextInt();				
				System.out.println("Insira um numero y:");
				y = input.nextInt();
			}
		}

		System.out.println("X ou Y é igual a 0! " );
		
		input.close();

	}

}
