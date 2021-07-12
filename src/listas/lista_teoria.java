package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista_teoria {

	public static void main(String[] args) {
		
		//exemplo de instanciar interface que d� errado
				//List x = new List();	
		
		
		List<String> list = new ArrayList<>();
		
		/* 
		 * se fosse inteiro n�o pode ser List<int> pois lista 
		 * n�o aceita tipos primitivos mas sim List<Integer>
		 * 
		 */
		
		// <  >  - generics: parametriza um tipo informando o outro tipo que voc� quer
		
		
		
		list.add("Isabela");
		list.add("Rosana");
		list.add("Davi");
		list.add("Fernanda"); 
		list.add("Simba");
		list.add("Hello");		
		list.add(2, "Teste"); //adiciona na posi��o 2 e os elementos 'pulam' uma posi��o
		
		System.out.println("Tamanho da lista: " + list.size());
		
		list.remove("Hello"); //remove um dado a partir da compara��o dele com o outro
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		list.remove(1); //remove o primeiro
		
		list.removeIf(x -> x.charAt(0) == 'F');		
		//fun��o lambda de predicado, retorna verdadeiro ou falso
				//se a primeira letra for 'F', vai remover
		
		for (String y : list) {
			System.out.println(y);
		}
		
		System.out.println("---------------------------");
		
		//encontrar a posi��o do elemento 
		
		System.out.println("Index of Isabela: " + list.indexOf("Isabela")); //0, primeira posi��o
		
		System.out.println("Index of Rosana: " + list.indexOf("Rosana")); 
		//vai retornar -1 pois eu removi da lista e/ou n�o existe na lista
		
		System.out.println("---------------------------");
		
		//filtrar e gerar uma nova lista somente com os que come�am com determinada letra
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
				//stream - recebe opera��es lambda
		
		for (String z : result) {
			System.out.println("Somente os que come�am com T");
			System.out.println(z);
		}
		
		
		list.add("Iara"); 
		
		System.out.println("---------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		//vai encontra o primeiro elemento da lista com 'I', se n�o tiver nenhum retorna nulo 
		
		System.out.println(name); //isabela 
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2); //nulo
	}

}


/*

> lista � uma estrutura
- homog�nea (dados do mesmo tipo)
- ordenada (elementos acessados por meio de posi��es)
- inicia vazia, elementos alocados sob demanda
- cada elemento ocupa um nodo da lista 

--------- tipo (interface): List 
---> n�o � uma classe mas sim uma interface
---> � um tipo que define a especifica��o das opera��es

--> vamos instanciar o tipo mas a interface por si s� n�o pode ser instanciada, 
vamos precisar de uma classe que implemente esta interface (exemplo no codigo)

----------vantagens
---> tamanho vari�vel (n�o precisa criar com um tamanho fixo igual vetor)
---> facilidade em realizar inser��es e dele��es
---> vantagens da lista s�o as dificuldades encotnradas no vetor 

---------- desvantagens
---> acesso sequencial ao elemento* 
*depende da implementa��o da lista (ex.: arraylist � uma mistura dos dois)

*/