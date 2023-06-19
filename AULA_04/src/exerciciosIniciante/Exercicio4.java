package exerciciosIniciante;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int idFuncionario, horas;
		double horaTrabalhada;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionario: ");
		idFuncionario = input.nextInt();
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		horas = input.nextInt();
		
		System.out.println("Digite quanto o funcionario recebe por hora trabalhada: ");
		horaTrabalhada = input.nextDouble();
		 
		double salario = horas * horaTrabalhada;
		
		System.out.println("NUMERO DO FUNCIONARIO = " + idFuncionario);
		
		Locale.setDefault(Locale.US);
		System.out.printf("SALARIO = U$ %.2f" ,salario);
		
		input.close();


	}

}
