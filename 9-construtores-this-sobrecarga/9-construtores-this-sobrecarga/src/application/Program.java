package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Price: ");
		double price = input.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("NewName");
		System.out.println("Updated Name: " + product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Updated Price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:  ");
		int quantity = input.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock:  ");
		quantity = input.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		input.close();
	}

}
