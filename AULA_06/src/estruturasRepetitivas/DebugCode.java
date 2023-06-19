package estruturasRepetitivas;

import java.util.Scanner;
import java.util.Locale;

public class DebugCode {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a largura: ");
		double largura = input.nextDouble();
		
		System.out.println("Insira o comprimento: ");
		double comprimento = input.nextDouble();
		
		System.out.println("Insira quantos metros quadrados: ");
		double metroQuadrado = input.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PREÇO: %.2f%n", preco);
		
		input.close();
	}

}
