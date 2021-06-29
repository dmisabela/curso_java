package vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetoresProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");		
		int n = sc.nextInt();
		Product[] vetor = new Product[n]; //n = vetor.length
		
		for (int i=0; i<vetor.length; i++) {
			
			System.out.println("Nome: ");	
			String name = sc.next();
			
			System.out.println("Preço: ");	
			double price = sc.nextDouble();
			
			vetor[i] = new Product(name, price);
			
		}
		
		double soma = 0;
		
		for (int i = 0; i<vetor.length; i++) {
			soma += vetor[i].getPrice();
		}
		
		double media = soma / vetor.length;
		
		System.out.printf("Média de preços dos " + vetor.length + " produtos = %.2f " , media);
				
		sc.close();

	}

}
