package funcoes;

import java.util.Scanner;

public class LerMaiorNumero {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter three numbers: ");
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			
			int higher = max(a, b, c);//Passa o parametro para a funcao max onde higher recebe o valor de max
			
			showResult(higher);
		}
		
	}
	
	public static int max(int x, int y, int z) {// os parametros a, b, c sao os mesmos que x, y, z na mesma ordem
		int aux;
		if(x > y && x > z) {
			aux = x;
		}else if( y > z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;//max recebe a variavel aux 
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
