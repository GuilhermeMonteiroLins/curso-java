package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		
		if(numero > 0) {
			System.out.println("O número "+ numero +" é POSITIVO!");
		}
		else if(numero == 0) {
			System.out.println("O número "+ numero +" é NEUTRO!");
		}
		else {
			System.out.println("O número "+ numero +" é NEGATIVO!");
		}
		
		input.close();
	}

}
