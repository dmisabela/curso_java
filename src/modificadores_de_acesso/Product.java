package modificadores_de_acesso;

public class Product {
	
	String name; //para ser acessível a outra classe do mesmo pacote
	private double price;
	private int quantity;
	
	public Product() {

	}		
	
	public Product(String a, double b, int c) { 
	
	
		this.name = a;
		this.price = b;
		this.quantity = c;
		
	}
	
	public Product(String a, double b) { 
		
		this.name = a;
		this.price = b;
		
	}	
	
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		public double getQuantity() {
			return quantity;
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
