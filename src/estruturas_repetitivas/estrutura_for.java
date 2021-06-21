package estruturas_repetitivas;

import java.util.Scanner;

public class estrutura_for {

	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros deseja somar? ");
		
		int cont = sc.nextInt();
		
		int soma = 0;
		int i;
		
		for (i = 0; i < cont; i++) {
			
			System.out.println("Digite um número:");
			int numero = sc.nextInt();
			soma = soma + numero;
					
		}
		
			
		System.out.println("A soma é " + soma);
		
		sc.close();		
		

	}

}
