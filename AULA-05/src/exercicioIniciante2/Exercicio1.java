package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		
		if(numero > 0) {
			System.out.println("O n�mero "+ numero +" � POSITIVO!");
		}
		else if(numero == 0) {
			System.out.println("O n�mero "+ numero +" � NEUTRO!");
		}
		else {
			System.out.println("O n�mero "+ numero +" � NEGATIVO!");
		}
		
		input.close();
	}

}
