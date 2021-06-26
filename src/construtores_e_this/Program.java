package construtores_e_this;

//CONSTRUTOR: permitir ou obrigar que o objeto receba dados no momento da instanciação

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
		
		System.out.print("Quantity in stock: ");
		int c = sc.nextInt();
		Product product = new Product(a, b, c);
		//obriga a informar os dados antes de instanciar, para não ficar com valores null, 0.0, 0 no início do programa
		
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		c = sc.nextInt();
		product.addProducts(c);
				
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		c = sc.nextInt();
		product.removeProducts(c);
				
		System.out.println("Updated data: " + product);
		
			
		sc.close();
		
	}

}
