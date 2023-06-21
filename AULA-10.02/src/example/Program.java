package example;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = input.nextInt();
			}
		}

		System.out.println("Main Diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);

		}
		System.out.println();
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println("Negative numbers: " + count);
		input.close();
	}
	
//	mat[i].length serve para contar as colunas, pois i representa a linha e .length as colunas que essa linha tem 
}
