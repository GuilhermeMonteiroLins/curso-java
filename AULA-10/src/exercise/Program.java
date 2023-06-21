package exercise;

import java.util.Locale;
import java.util.Scanner;

import exercise.entities.Rent;

public class Program {	
	
	private static Rent[] rooms = new Rent[10];
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("How many rooms will be rented?");
		int quantityRoom = input.nextInt();
		
		for (int i = 0; i < quantityRoom; i++) {
			input.nextLine();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.println("Name: ");
			String name = input.nextLine();
			
			System.out.println("Email: ");
			String email = input.nextLine();
			
			System.out.println("Room: ");
			int room = input.nextInt();
			
			rooms[room] = new Rent(name, email, room);

// 			No exercicio feito foi criado de forma diferente, chamando o metodo addRent;
//			addRent(new Rent(name, email, room));
		}
		
		printRenteds();
		
		input.close();

	}
	
//	private static void addRent(Rent rent) {
//		for(int i=0; i < rooms.length; i++) {
//			if(i == rent.getRoom()) {
//				rooms[i] = rent;
//			}
//		}
//	}
	
	private static void printRenteds() {
		System.out.println("Busy rooms");
		for(int i=0; i < rooms.length; i++) {
			if(rooms[i] == null) {
				System.out.println(i + ": The Room is empty");
			}else {
				System.out.println(rooms[i].getRoom() + ": " + rooms[i].getName()+ ", " + rooms[i].getEmail());
			}
		}
	}

}
