package sobrecarga;


import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		//Product p = new Product(); 
		//este � o padr�o, que vem com os valores zerados
		
		//System.out.println(p); 
		// sa�da: null, $ 0.00, 0 units, Total: $ 0.00
			
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String a = sc.nextLine();
		
		System.out.print("Price: ");
		double b = sc.nextDouble();
		
		//retirando entrada inicial da quantidade em estoque
		
//		System.out.print("Quantity in stock: ");
//		int c = sc.nextInt();
		
		
		Product product = new Product(a, b); //chamei o que tem s� dois parametros ent�o n�o vai ler a quantidade
		
		System.out.println("Product data: " + product);
		//sa�da: Product data: tv, $ 10.00, 0 units, Total: $ 0.00
		
		System.out.print("Enter the number of products to be added in stock: ");
		int c = sc.nextInt(); //agora sim declara a vari�vel c (quantity) para iniciar a quantidade de produtos
		product.addProducts(c);
				
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed in stock: ");
		c = sc.nextInt();
		product.removeProducts(c);
				
		System.out.println("Updated data: " + product);
		
			
		sc.close();
		
	}

}
