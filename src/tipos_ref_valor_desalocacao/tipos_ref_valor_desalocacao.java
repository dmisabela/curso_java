package tipos_ref_valor_desalocacao;

public class tipos_ref_valor_desalocacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p;
		
		p = 10;
		
		System.out.println(p); //se n�o inicializar, vai dar erro. o compilador verifica antes

	}

}

//- Classes s�o tipos refer�ncia

/* Vari�veis que tipos s�o classes s�o "caixas", ou seja, quando declaradas
* ficam na Stack que se referem a endere�os de mem�ria dinamicamente alocada 
* para a Heap (tamb�m chamada de ponteiro ou tent�culo)
* 
* Product p1, p2
* p1 = new Product ("TV", 900.00)
* 
* p2 = p1; -> p2 passa a apontar para onde p1 aponta
* 
* - Valor "null"
* � possivel iniciar uma vari�vel refer�ncia sem apontar pra ningu�m, assim fica com valor nulo
* 
* - Tipos primitivos s�o tipos valor
* Vari�veis boolean, char, byte, short, int, long, float e double (etc) o valor fica direto na stack
* ex.: double x,y
* 
* x = 10;
* y = x; -> valor fica na stack mesmo
* 
* 
* - Valores padr�o
* Quando alocamos (new) qualquer tipo estruturado (classe ou array) come�a com valores padr�o
* Numeros - 0, boolean - false, char - 0, objeto - null.
* 
* - Garbage Collector
* Objetos alocados dinamicamente quando n�o tem mais refer�ncia s�o desalocados pelo garbage collector
* Vari�veis locais s�o desalocadas imediatamente assim que o escopo sai da execu��o.  
* 
* */