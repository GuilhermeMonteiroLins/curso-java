package estruturasRepetitivas;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um valor:");
		int a = input.nextInt();
		
		int total = 0;
		
		while(a != 0) { //while = enquanto a for diferente de 0
			total += a;//OU total = total + a;
			a = input.nextInt();//Le novamente o numero digitado enquanto nao for digitado 0
		}
		//condição = 0 sai do while
		System.out.println("A soma dos valores digitados são: " + total);
		
		input.close();
	}

}
