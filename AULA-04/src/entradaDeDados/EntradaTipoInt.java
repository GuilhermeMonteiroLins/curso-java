package entradaDeDados;

import java.util.Scanner;

public class EntradaTipoInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite algum numero: ");
		int x = input.nextInt();//Leitor do texto em que o usuario irá digitar no console um numero inteiro
		
		System.out.println("Voce digitou: " + x);//saida do que o usuario digitou no console
		input.close();
	}

}
