package sintaxeOpcional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor da compra: ");
		double preco = input.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
		// ONDE É A MESMA COISA QUE:
		//
		//double desconto;
		//
		// if(preco < 20){
		//  	desconto = preco * 0.1;
		//} else{
		//  	desconto = preco * 0.5;
		//}
		
		System.out.printf("O desconto foi de: R$%.2f ",desconto);
		
		input.close();
	}

}
