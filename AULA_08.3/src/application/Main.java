package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.println("Enter name the employee: ");
		empregado.name = input.nextLine();
		System.out.println("Enter Gross salary the employee: ");
		empregado.grossSalary = input.nextDouble();
		System.out.println("Enter tax the employee: ");
		empregado.tax = input.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + empregado );
		System.out.println();
		System.out.println("Which percentage to increase salary?");
		double percentage = input.nextDouble();
		empregado.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + empregado);
		
		input.close();
	}

}
