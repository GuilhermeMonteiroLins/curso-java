package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = input.nextInt();
		
		if(numero %2==0 && numero != 0) {
			System.out.println("O número "+ numero + " é PAR!" );	
		}
		else if(numero == 0){
			System.out.println("O número "+ numero + " é NEUTRO!" );
		}
		else {
			System.out.println("O número "+ numero + " é IMPAR!" );
		}
		
		input.close();

	}

}
