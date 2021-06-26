package encapsulamento;

//ENCAPSULAMENTO: intuito de esconder detalhes de implementação de uma classe
//regra: objreto deve estar em um estado consistente e não deve expor nenhum atributo (agora, sempre PRIVATE)
//sendo assim, os atributos são acessados por meio de métodos get e set (javabeans)

public class Product {
		
		private String name;
		private double price;
		private int quantity;
		
		///////////////////////////////////////////////////////////////////////
		
		//construtores
		
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
		
		/////////////////////////////////////////////////////////////////////
		
		//métodos get e set
		
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
		
		//regra de negócio: não vou criar set quantity para que seja um método consistente 
		//e só mude quando houver uma entrada ou uma saída, e não por um método set.
		
		public double getQuantity() {
			return quantity;
		}
		
		/////////////////////////////////////////////////////////////////////////////////////
		 	
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