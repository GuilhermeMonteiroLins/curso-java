package sintaxeOpcional;

import java.util.Locale;
import java.util.Scanner;

public class TarifaTelefone {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite os minutos da ligação: ");
		int minutos = input.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;// Onde é a mesma coisa que "conta = conta + (minutos - 100) * 2.0;"
		}
		
		System.out.printf("Valor da conta = R$%.2f%n",conta);
		
		input.close();
	}

}
