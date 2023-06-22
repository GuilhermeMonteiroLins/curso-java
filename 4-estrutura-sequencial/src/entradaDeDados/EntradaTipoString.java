package entradaDeDados;

import java.util.Scanner;

public class EntradaTipoString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite algum texto: ");
		String x = input.next();//Leitor do texto em que o usuario irá digitar no console
		
		
		System.out.println("Voce digitou: " + x);//saida do que o usuario digitou no console
		input.close();
	}

}
