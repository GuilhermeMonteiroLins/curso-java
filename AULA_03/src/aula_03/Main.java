package aula_03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,media;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Escreva um numero A para saber a média: ");
		a = input.nextDouble();
		System.out.print("Escreva um numero B para saber a média: ");
		b = input.nextDouble();
		
		media = (a+b)/2;
		
		System.out.print("A média entre o numero A e B é: " + media);
		
		input.close();
	}
	

}
