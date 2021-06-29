package tipos_ref_valor_desalocacao;

public class tipos_ref_valor_desalocacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p;
		
		p = 10;
		
		System.out.println(p); //se não inicializar, vai dar erro. o compilador verifica antes

	}

}

//- Classes são tipos referência

/* Variáveis que tipos são classes são "caixas", ou seja, quando declaradas
* ficam na Stack que se referem a endereços de memória dinamicamente alocada 
* para a Heap (também chamada de ponteiro ou tentáculo)
* 
* Product p1, p2
* p1 = new Product ("TV", 900.00)
* 
* p2 = p1; -> p2 passa a apontar para onde p1 aponta
* 
* - Valor "null"
* É possivel iniciar uma variável referência sem apontar pra ninguém, assim fica com valor nulo
* 
* - Tipos primitivos são tipos valor
* Variáveis boolean, char, byte, short, int, long, float e double (etc) o valor fica direto na stack
* ex.: double x,y
* 
* x = 10;
* y = x; -> valor fica na stack mesmo
* 
* 
* - Valores padrão
* Quando alocamos (new) qualquer tipo estruturado (classe ou array) começa com valores padrão
* Numeros - 0, boolean - false, char - 0, objeto - null.
* 
* - Garbage Collector
* Objetos alocados dinamicamente quando não tem mais referência são desalocados pelo garbage collector
* Variáveis locais são desalocadas imediatamente assim que o escopo sai da execução.  
* 
* */