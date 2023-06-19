package exerciciosWhile;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um código de 1 a 4:");
		int x = input.nextInt();

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (x != 4) {
			switch (x) {
			case 1:
				alcool++;
				System.out.println("Insira um código de 1 a 4:");
				x = input.nextInt();
				break;

			case 2:
				gasolina++;
				System.out.println("Insira um código de 1 a 4:");
				x = input.nextInt();
				break;

			case 3:
				diesel++;
				System.out.println("Insira um código de 1 a 4:");
				x = input.nextInt();
				break;
				
			default:
				System.out.println("Tente outro codigo");
				x = input.nextInt();
				break;
			}
		}
		
		System.out.println("MUITO OBRIGADO!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		input.close();
	}
}
