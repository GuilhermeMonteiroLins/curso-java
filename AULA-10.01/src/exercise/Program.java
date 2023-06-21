package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercise.entities.Employee;


public class Program {

	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("How many employees will be registered?");
		int quantityEmployee = input.nextInt();
		
		for (int i = 0; i < quantityEmployee; i++) {
			input.nextLine();
			System.out.println("Employee #" + (i+1) + ":");
			
			System.out.println("Id: ");
			long id = input.nextLong();
			
			input.nextLine();
			
			System.out.println("Name: ");
			String name = input.nextLine();
				
			
			System.out.println("Salary: ");
			double salary = input.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		long idEmployeeIncrease = input.nextLong();
		
		System.out.println("Enter the percentage");
		double percentageSalaryIncrease = input.nextDouble();
		
		for(Employee employee : employees) {
			if(employee.getId() == idEmployeeIncrease) {
				double bonus = employee.getSalary() * percentageSalaryIncrease / 100.0;
				employee.setSalary(employee.getSalary() + bonus);
			}
		}
		
		for(Employee employee : employees) {
			System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
		}
		
		input.close();
	}
}
