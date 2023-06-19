package exercicioFor;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um valor x:");
		int x = input.nextInt();
		
		if (x >= 1 && x <= 1000) {
			for (int i = 0; i <= x; i++) {
				if(i %2!=0) {
				System.out.println(i);
				}
			}
		}
		input.close();
	}

}
