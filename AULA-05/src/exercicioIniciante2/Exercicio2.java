package exercicioIniciante2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = input.nextInt();
		
		if(numero %2==0 && numero != 0) {
			System.out.println("O n�mero "+ numero + " � PAR!" );	
		}
		else if(numero == 0){
			System.out.println("O n�mero "+ numero + " � NEUTRO!" );
		}
		else {
			System.out.println("O n�mero "+ numero + " � IMPAR!" );
		}
		
		input.close();

	}

}
