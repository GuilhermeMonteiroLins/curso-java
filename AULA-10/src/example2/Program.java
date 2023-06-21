package example2;

import java.util.Locale;
import java.util.Scanner;

import example2.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		Product[] vet = new Product[n];

		for (int i = 0; i < vet.length; i++) {
			input.nextLine();
			String name = input.nextLine();
			double price = input.nextDouble();
			vet[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i].getPrice();
		}

		System.out.printf("Average Height: %.2f%n", sum / vet.length);
		input.close();
	}

}
