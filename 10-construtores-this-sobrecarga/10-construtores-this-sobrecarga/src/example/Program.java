package example;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		
		double[] vet = new double[n];
		
		for(int i = 0; i < n; i++) {
			vet[i] = input.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vet[i];
		}
		
		System.out.printf("Average Height: %.2f%n", sum/n);
		input.close();
	}

}
