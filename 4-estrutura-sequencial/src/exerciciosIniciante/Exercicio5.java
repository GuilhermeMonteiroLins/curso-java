package exerciciosIniciante;


import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int qtdePeca;
		double valorPeca;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o codigo da pe�a 1: ");
		System.out.println("Digite a quantidade de pe�as: ");
		qtdePeca = input.nextInt();
		System.out.println("Digite o valor da pe�a: ");
		valorPeca = input.nextDouble();
		
		double Resultado1 = qtdePeca * valorPeca;
		
		System.out.println("Digite o codigo da pe�a 2: ");
		System.out.println("Digite a quantidade de pe�as: ");
		qtdePeca = input.nextInt();
		System.out.println("Digite o valor da pe�a: ");
		valorPeca = input.nextDouble();
		
		double Resultado2 = qtdePeca * valorPeca;
		
		 
		double total = Resultado1 + Resultado2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
		input.close();

	}

}
