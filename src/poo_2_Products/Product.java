package poo_2_Products;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	 
	
	public double totalValueInStock () {
		
		return price * quantity;
		
	}

	public void addProducts (int quantity) { //void pq não vai retornar nada
		
		this.quantity += quantity; 
		
		//soma o int quantity do argumento + o atributo
		//auto-referência ao objeto -> quer acessar o atributo 
		//da classe e não o parâmetro da função
	}
	
	public void removeProducts (int quantity) {
		
		this.quantity -= quantity;
		
	}
	
	
	public String toString() { 
		//sobrepondo a toString padrão do object (herança)
		
		String productResult = (name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock())
				);
		
		return productResult;
		
	}
}
