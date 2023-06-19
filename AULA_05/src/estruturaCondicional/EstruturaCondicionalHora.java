package estruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicionalHora {

	public static void main(String[] args) {
		int hora;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Que horas são?");
		hora = input.nextInt();
		
		if(hora < 12){
			System.out.println("Bom dia");
		}
		else if(hora < 18){
			System.out.println("Boa tarde");	
		}
		else {
			System.out.println("Boa noite");
		}
		
		input.close();
	}

}


