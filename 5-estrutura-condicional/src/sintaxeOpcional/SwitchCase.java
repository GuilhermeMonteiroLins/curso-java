package sintaxeOpcional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o dia da Semana: ");
		int x = input.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "Dia Invalido!!";
		}
		//OU PODE UTILIZAR if e else encadeado
		
		//if (x == 1) {
		// 		dia = "domingo";
		//} else if (x == 2) {
		//		dia = "segunda";
		//} else if (x == 3) {
		//		dia = "terça";
		//} else if (x == 4) {
		//		dia = "quarta";
		//} else if (x == 5) {
		//		dia = "quinta";
		//} else if (x == 6) {
		//		dia = "sexta";
		//} else if (x == 7) {
		//		dia = "sabado";
		//} else {
		//		dia = "Dia Invalido!!";
		//}

		System.out.println("Dia da semana: " + dia);
		input.close();
	}
}
