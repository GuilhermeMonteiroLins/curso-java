package example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<>();
		
		list.add("Guilherme");
		list.add("Bob");
		list.add("Anna");
		list.add("Maria");
		
//		Para adicionar uma informação na posição especifica, basta chamar o list.add(posição, valor)
		list.add(2, "Marco");
		
		for(String name : list) {
			System.out.println(name);
		}
		
		System.out.println(list.size());

//		Para remover, na lista ele pode remover tanto pelo valor, quanto pela posição, e tambem por um predicado;	
		list.remove(1);
		list.remove("Guilherme");
		list.removeIf(x -> x.charAt(0)== 'M');
		
//		Para pegar a posição de um valor, é possivel utilizar list.indexOf, quando o elemento nao é encontrado na lista o mesmo retorna -1
		
		list.indexOf("Guilherme");
		
//		Para filtra da lista tudo que coma com A
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'A').collect(Collectors.toList());
		
//		Para pegar o primeiro elemnto da lista que comece com a letra A e se não encontra o mesmo retornara null
		String name = list.stream().filter(x -> x.charAt(0)== 'A').findFirst().orElse(null);

	}
}
