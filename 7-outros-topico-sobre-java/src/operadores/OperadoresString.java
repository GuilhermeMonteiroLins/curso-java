package operadores;

public class OperadoresString {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();//Transforma em letras minusculas
		String s02 = original.toUpperCase();//Transforma em letras maiusculas
		String s03 = original.trim();//Tira espaço nos traços
		String s04 = original.substring(2);//Le apenas depois da 2 letra
		String s05 = original.substring(2,9);//Le apenas entre as letras entre a posição 2 e 9
		String s06 = original.replace('a' , 'x');//Transforma a letra "a" na letra X
		String s07 = original.replace("abc", "xy");//Transforma a palavra "abc" em "xy" 
		int i = original.indexOf("bc");//Primeira ocorrencia onde aparece "bc"
		int j = original.lastIndexOf("bc");//Ultima ocorrencia onde aparece "bc"
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -"        + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2,9): -" + s05 + "-");
		System.out.println("replace('a' , 'x'): -" + s06 + "-");
		System.out.println("replace('abc' , 'xy'): -" + s07 + "-");
		System.out.println("index Of('bc'): " + i );
		System.out.println("last Index Of('bc'): " + j );
	}

}
