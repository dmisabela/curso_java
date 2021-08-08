package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Stack_Trace {
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program.");
		
	}
	
	public static void method1() {
		
		System.out.println("***METHOD 1 START***");
		
		method2();
		
		System.out.println("***METHOD 2 START***");
		
	}
	
	public static void method2() {
		
		System.out.println("***METHOD 2 START***");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		String[] vect = sc.nextLine().split(" ");		
		int position = sc.nextInt();		
		System.out.println(vect[position]);
		
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {	
			
			System.out.println("Posi��o inv�lida. Erro: " + e);
			e.printStackTrace(); //imprime o rastreamento do stack
			//mostra a sequ�ncia de chamadas que gerou a exce��o 			
			
			sc.next();
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Valor inv�lido. Erro: " + e);
			e.printStackTrace();
			
		}
		
		sc.close();	
		
		System.out.println("***METHOD 2 END***");
	}

}
