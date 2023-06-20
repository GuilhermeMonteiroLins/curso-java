package exercise;

import java.util.Locale;
import java.util.Scanner;

import exercise.util.CurrencyConvert;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = input.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double dollarsBought = input.nextDouble();
		
		double amountPaidReal = CurrencyConvert.AmountPaidReal(dollarPrice, dollarsBought);
		System.out.printf("Amount to be paid in reais = %.2f%n", amountPaidReal);
		
		input.close();
	}

}
