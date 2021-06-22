package poo_1_Triangle; //pacote

public class Triangle { //nome da classe
	
	public double a; //atributos
	public double b; //public: atributo ou método pode ser usado em outros arquivos
	public double c;
	
	
	public double calcularArea() { //método  
		
		
		//double: tipo do dado que o método retorna
		//se não retorna nada é void
		//está assim () pois não precisa de nenhum parâmetro além dos que já estão na classe
		
		double p = (a + b + c)/2.0;
		
		double result =  Math.sqrt(p * (p - a)  * (p - b) * (p - c));
		
		return result;
		
	}
	
	
	
}
