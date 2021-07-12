package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class lista_teoria {

	public static void main(String[] args) {
		
		//exemplo de instanciar interface que dá errado
				//List x = new List();	
		
		
		List<String> list = new ArrayList<>();
		
		/* 
		 * se fosse inteiro não pode ser List<int> pois lista 
		 * não aceita tipos primitivos mas sim List<Integer>
		 * 
		 */
		
		// <  >  - generics: parametriza um tipo informando o outro tipo que você quer
		
		
		
		list.add("Isabela");
		list.add("Rosana");
		list.add("Davi");
		list.add("Fernanda"); 
		list.add("Simba");
		list.add("Hello");		
		list.add(2, "Teste"); //adiciona na posição 2 e os elementos 'pulam' uma posição
		
		System.out.println("Tamanho da lista: " + list.size());
		
		list.remove("Hello"); //remove um dado a partir da comparação dele com o outro
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------------");
		
		list.remove(1); //remove o primeiro
		
		list.removeIf(x -> x.charAt(0) == 'F');		
		//função lambda de predicado, retorna verdadeiro ou falso
				//se a primeira letra for 'F', vai remover
		
		for (String y : list) {
			System.out.println(y);
		}
		
		System.out.println("---------------------------");
		
		//encontrar a posição do elemento 
		
		System.out.println("Index of Isabela: " + list.indexOf("Isabela")); //0, primeira posição
		
		System.out.println("Index of Rosana: " + list.indexOf("Rosana")); 
		//vai retornar -1 pois eu removi da lista e/ou não existe na lista
		
		System.out.println("---------------------------");
		
		//filtrar e gerar uma nova lista somente com os que começam com determinada letra
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
				//stream - recebe operações lambda
		
		for (String z : result) {
			System.out.println("Somente os que começam com T");
			System.out.println(z);
		}
		
		
		list.add("Iara"); 
		
		System.out.println("---------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
		//vai encontra o primeiro elemento da lista com 'I', se não tiver nenhum retorna nulo 
		
		System.out.println(name); //isabela 
		
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2); //nulo
	}

}


/*

> lista é uma estrutura
- homogênea (dados do mesmo tipo)
- ordenada (elementos acessados por meio de posições)
- inicia vazia, elementos alocados sob demanda
- cada elemento ocupa um nodo da lista 

--------- tipo (interface): List 
---> não é uma classe mas sim uma interface
---> é um tipo que define a especificação das operações

--> vamos instanciar o tipo mas a interface por si só não pode ser instanciada, 
vamos precisar de uma classe que implemente esta interface (exemplo no codigo)

----------vantagens
---> tamanho variável (não precisa criar com um tamanho fixo igual vetor)
---> facilidade em realizar inserções e deleções
---> vantagens da lista são as dificuldades encotnradas no vetor 

---------- desvantagens
---> acesso sequencial ao elemento* 
*depende da implementação da lista (ex.: arraylist é uma mistura dos dois)

*/