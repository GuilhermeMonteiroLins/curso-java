package example;

import java.util.Locale;
import java.util.Scanner;

import example.util.Calculator;

public class Program {

	public static final double PI = 3.14159;
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter Radius");
		double radius = input.nextDouble();
		
		double c = Calculator.circuference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", PI);
		
		
		input.close();
	}
	
}
