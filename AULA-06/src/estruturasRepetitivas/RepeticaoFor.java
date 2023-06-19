package estruturasRepetitivas;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o total de numeros em que quer somar:");
		int N = input.nextInt();
		
		int soma = 0;
		
		for(int i = 0; i < N; i++){
			System.out.println("Qual o numero você quer somar?");
			int x = input.nextInt();
			soma += x;
		}
		
		System.out.println("A soma dos numeros são:" + soma);

		input.close();
	}
 }
