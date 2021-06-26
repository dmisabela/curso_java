package encapsulamento;


import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
			
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String a = sc.nextLine();
		
		System.out.print("Price: ");
		double b = sc.nextDouble();		
		
		Product product = new Product(a, b); 
		
		System.out.println("Product data: " + product);	
		
		//product.name = "Computer"; // se não tiver get e set, erro: is not visible (agora é private)
		
		product.setName("Computer");
		//agora ao sair, vai mostrar "computer" independente do que o usuario digitar
		
		
		//System.out.println("Updated name: " + product.name);	//vai dar erro pois ainda não tem o getName
		
		System.out.println("Updated name: " + product.getName());
		//saída: Updated name: Computer
		
		product.setPrice(1200.00);
		
		System.out.println("Updated price: " + product.getPrice());
		//saída: Updated price: 1200.0
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		int c = sc.nextInt(); 
		product.addProducts(c);
				
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		c = sc.nextInt();
		product.removeProducts(c);
				
		System.out.println("Updated data: " + product);
		
			
		sc.close();
		
	}

}
