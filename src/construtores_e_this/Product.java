package construtores_e_this;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//construtor - executado no momento da instanciação	
	public Product(String a, double b, int c) { 
	//pegar nome, preço e quantidade que veio como parâmetro do construtor e atribuir ao objeto
	
		this.name = a;
		this.price = b;
		this.quantity = c;
		//referência ao atributo do objeto	
		//pode ser com o mesmo nome, mas não é obrigatório
	}
	 	
	public double totalValueInStock () {
		
		return price * quantity;
		
	}

	public void addProducts (int quantity) { 
		
		this.quantity += quantity; 
		
	}
	
	public void removeProducts (int quantity) {
		
		this.quantity -= quantity;
		
	}
	
	
	public String toString() { 
		
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
