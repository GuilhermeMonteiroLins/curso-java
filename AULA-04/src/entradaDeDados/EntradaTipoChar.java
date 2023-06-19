package entradaDeDados;

import java.util.Scanner;

public class EntradaTipoChar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		char x = input.next().charAt(0);//Leitor do texto em que o usuario irá digitar no console uma palavra onde o char ira pegar a primeira letra dessa palavra
		
		System.out.println("A primeira letra da palavra é: " + x);//saida da primeira letra da palavra que o usuario digitou no console
		input.close();

	}

}
