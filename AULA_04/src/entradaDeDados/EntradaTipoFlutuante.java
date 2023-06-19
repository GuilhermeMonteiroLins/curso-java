package entradaDeDados;

import java.util.Scanner;

public class EntradaTipoFlutuante {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite algum numero flutuante: ");
		double x = input.nextDouble();//Leitor do texto em que o usuario irá digitar no console um numero flutuante
		
		System.out.printf("Voce digitou: %.2f", x);//saida do que o usuario digitou no console
		input.close();

	}

}
