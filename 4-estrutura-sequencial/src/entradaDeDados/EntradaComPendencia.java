package entradaDeDados;

import java.util.Scanner;

public class EntradaComPendencia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s0, s1, s2, s3;
		int x;
		
		System.out.println("Digite tres palavras com quebra de linha: ");
		
		//nextLine é utilizado para ler a linha inteira
		 x = input.nextInt();//Quando for utilizado um comando de leitura diferente do nextLine essa entrada fica pendente na entrada padrao
		 s0 = input.nextLine();//Para consumir essa pendencia e necessario cria outro nextLine() para consumir o espaço em branco
		 s1 = input.nextLine();//Leitor do texto em que o usuario irá digitar na primeira linha do console
		 s2 = input.nextLine();//Leitor do texto em que o usuario irá digitar na segunda linha do console
		 s3 = input.nextLine();//Leitor do texto em que o usuario irá digitar na terceira linha do console
		
		System.out.println("Voce digitou: " + x);//saida do que o usuario digitou no console
		System.out.println("Voce digitou: " + s1);//saida do que o usuario digitou no console
		System.out.println("Voce digitou: " + s2);//saida do que o usuario digitou no console
		System.out.println("Voce digitou: " + s3);//saida do que o usuario digitou no console
		input.close();

	}

}
