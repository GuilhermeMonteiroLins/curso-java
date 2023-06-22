package funcoesMatematicas;

public class FuncoesMath {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);//Raiz quadrada do valor implementado na variavel x
		B = Math.sqrt(y);//Raiz quadrada do valor implementado na variavel y
		C = Math.sqrt(25.0);//Raiz quadrada do valor 25.0
		System.out.println("A Raiz quadrada de " + x + " = " + A);
		System.out.println("A Raiz quadrada de " + y + " = " + B);
		System.out.println("A Raiz quadrada de 25 é = " + C);
		
		A = Math.pow(x,y);//O numero x elevado a y é igual a A
		B = Math.pow(x,2.0);//O numero x elevado a 2.0 é igual a B
		C = Math.pow(5.0, 2.0);//O numero 5.0 elevado a 2.0 é igual a C
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado é = " + B);
		System.out.println("5 elevado ao quadrado é = " + C);
		
		A = Math.abs(y);//O valor absoluto de y
		B = Math.abs(z);//O valor absoluto de z tira o sinal negativo
		System.out.println("O valor absoluto de " + y + " = " + A);
		System.out.println("O valor absoluto de " + z + " = " + B);
	}

}
