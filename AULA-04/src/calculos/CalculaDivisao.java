package calculos;

public class CalculaDivisao {

	public static void main(String[] args) {
		double a, b, resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double)a/b;// casting para aparecer 2,5 e nao 2,0 no resultado
		
		System.out.println("RESULTADO = " + resultado);
	}

}
