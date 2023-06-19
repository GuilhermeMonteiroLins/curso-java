package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter width the rectangle: ");
		x.width = input.nextDouble();
		
		System.out.println("Enter heigth the rectangle: ");
		x.height = input.nextDouble();
		
		double a = x.area();
		double p = x.perimeter();
		double d= x.diagonal();
		
		System.out.printf("Rectangle area: %.2f%n",a);
		System.out.printf("Rectangle perimeter: %.2f%n",p);
		System.out.printf("Rectangle diagonal: %.2f%n",d);
		
		input.close();
	}

}
