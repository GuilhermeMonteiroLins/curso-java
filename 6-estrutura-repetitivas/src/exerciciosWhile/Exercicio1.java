package exerciciosWhile;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a Senha:");
		int senha = input.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida, Tente Novamente");
			senha = input.nextInt();
		}

		System.out.println("Acesso Permitido! " );
		
		input.close();

	}

}
