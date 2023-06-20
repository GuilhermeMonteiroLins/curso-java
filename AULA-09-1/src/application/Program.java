package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		BankAccount bankAccount = null;

		System.out.println("Enter account number: ");
		long numberAccount = input.nextLong();

		System.out.println("Enter account holder: ");
		input.nextLine();
		String name = input.nextLine();

		System.out.println("Is there na initial deposit (y/n): ");
		char responseUser = input.next().charAt(0);

		boolean verifyResponse = false;

		while (!verifyResponse) {

			switch (responseUser) {
			case 'y':
				System.out.print("Enter initial deposit value: ");
				double valueInitial = input.nextDouble();
				bankAccount = new BankAccount(numberAccount, name, valueInitial);
				System.out.println(bankAccount.toString());
				verifyResponse = true;
				break;

			case 'n':
				bankAccount = new BankAccount(numberAccount, name);
				System.out.println(bankAccount.toString());
				verifyResponse = true;
				break;

			default:
				System.out.print("Select an option between y and n !! ");
				System.out.println("Is there na initial deposit (y/n): ");
				responseUser = input.next().charAt(0);
				break;
			}
		}
		/******************************* DEPOSITAR *******************************/
		System.out.println("Enter a deposit value: ");
		double depositValue = input.nextDouble();

		bankAccount.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());

		/******************************* SAQUAR *******************************/
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = input.nextDouble();

		bankAccount.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
		
		input.close();
	}
}
