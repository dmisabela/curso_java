package construtores_e_this;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//construtor - executado no momento da instancia��o	
	public Product(String a, double b, int c) { 
	//pegar nome, pre�o e quantidade que veio como par�metro do construtor e atribuir ao objeto
	
		this.name = a;
		this.price = b;
		this.quantity = c;
		//refer�ncia ao atributo do objeto	
		//pode ser com o mesmo nome, mas n�o � obrigat�rio
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
