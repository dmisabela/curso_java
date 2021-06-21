package entrada_de_dados;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------palavra-------");
		
		//Locale.setDefault(Locale.US) //para usar '.' no double		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); //vai digitar a palavra e armazenar em X
		
		System.out.println("Você digitou " + x);
		
			
		System.out.println("-------inteiro-------");
		
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou " + y);
		
		System.out.println("-------ponto flutuante-------");
		
		double z;
		z = sc.nextDouble(); //só funciona com ',' separando
		
		System.out.println("Você digitou " + z); //imprime com '.'
		System.out.printf("Você digitou: %.2f%n ", z); //imprime com ','
		
		System.out.println("-------char-------");
		
		char w;
		w = sc.next().charAt(0); //pega o primeiro caracter da string
		
		System.out.println("Você digitou " + w);		
			
		
		System.out.println("-------string, int, double simultaneamente-------");
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Dados digitados: %s, %d, %.2f%n", x, y, z);
		
		
		sc.close();
	

	}

}
