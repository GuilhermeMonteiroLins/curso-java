package tiposDePrint;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String nome = "Guilherme";
		int idade = 20;
		double renda = 2000.00;
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n",x);//comando utilizado para mostrar duas casas depois da virgula
		System.out.printf("%.4f%n",x);//comando utilizado para mostrar quatro casas depois da virgula
		Locale.setDefault(Locale.US);//Biblioteca utilizada para padrao americano ao invés de , sera .
		System.out.printf("%.4f%n",x);//comando utilizado para mostrar quatro casas depois do ponto conforme padrao americano
		System.out.println("RESULTADO = "+ x + " Metros");
		System.out.printf("RESULTADO = %.2f metros%n",x);//%f ponto flutuando para mostra duas casas depois da virgula
		System.out.printf("Meu nome é %s tenho %d anos e tenho uma renda de R$ %.2f Reais%n",nome,idade,renda);
		//%s utilizados para string
		//%d utilizados para numeros inteiros 
		//%f ou 2%f utilizados para numeros com virgula e selecionas quantas casas depois da virgula
	}

}
