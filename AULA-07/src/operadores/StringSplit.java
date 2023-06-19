package operadores;

public class StringSplit {

	public static void main(String[] args) {
		String s = "potato apple lemon";
		
		String [] v = s.split(" ");//o espaço em branco serve como separador de posições
		
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);

	}

}
