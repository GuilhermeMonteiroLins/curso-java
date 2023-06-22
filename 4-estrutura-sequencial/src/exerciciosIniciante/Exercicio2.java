package exerciciosIniciante;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double raio ,A;
		double pi = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		raio = input.nextDouble();
		
		A = Math.pow(raio,2.0);
		
		double resultado = pi * A;
		
		System.out.println("A AREA DO CIRCULO É = " + resultado);
		
		input.close();

	}

}
