package sobrecarga;


//SOBRECARGA: a classe pode oferecer mais de uma opera��o com o mesmo nome
//mas ao mesmo tempo com diferentes listas de par�metros 

//melhoria: agora a quantidade de produtos vai ser iniciada com valor zero a partir de um novo construtor

public class Product {
		
		public String name;
		public double price;
		public int quantity;
		
		public Product() {
			//posso deixar este construtor padr�o caso queira usar, para come�ar todos com zero
		}
		
		
		public Product(String a, double b, int c) { 
		
		
			this.name = a;
			this.price = b;
			this.quantity = c;
			
		}
		
		public Product(String a, double b) { 
			
			this.name = a;
			this.price = b;
			//quantity vai come�ar com zero
			
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