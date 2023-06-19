package exerciciosIniciante;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double A, B, C;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero A: ");
		A = input.nextDouble();
		System.out.println("Digite um numero B: ");
		B = input.nextDouble();
		System.out.println("Digite um numero C: ");
		C = input.nextDouble();
		
		Locale.setDefault(Locale.US);
		double triangulo = (A * C)/2;
		System.out.printf("A area do TRIANGULO é: %.3f%n", triangulo);
		
		double circulo = Math.pow(C, 2.0) * 3.14159;
		System.out.printf("A area do CIRCULO é: %.3f%n", circulo);
		
		double trapezio = ((A + B)/2)*C;
		System.out.printf("A area do TRAPÉZIO é: %.3f%n", trapezio);
		
		double quadrado = Math.pow(B, 2.0);
		System.out.printf("A area do QUADRADO é: %.3f%n", quadrado);
		
		double retangulo = A * B;
		System.out.printf("A area do RETANGULO é: %.3f%n", retangulo);
		
		input.close();
	}

}
