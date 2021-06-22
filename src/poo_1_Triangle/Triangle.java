package poo_1_Triangle; //pacote

public class Triangle { //nome da classe
	
	public double a; //atributos
	public double b; //public: atributo ou m�todo pode ser usado em outros arquivos
	public double c;
	
	
	public double calcularArea() { //m�todo  
		
		
		//double: tipo do dado que o m�todo retorna
		//se n�o retorna nada � void
		//est� assim () pois n�o precisa de nenhum par�metro al�m dos que j� est�o na classe
		
		double p = (a + b + c)/2.0;
		
		double result =  Math.sqrt(p * (p - a)  * (p - b) * (p - c));
		
		return result;
		
	}
	
	
	
}
