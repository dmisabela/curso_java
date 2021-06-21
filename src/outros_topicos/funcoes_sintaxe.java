package outros_topicos;

import java.util.Scanner;

public class funcoes_sintaxe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
//		if (a > b) {
//			 aux = a;
//		}
//		else if (b > c) {
//			 aux = b;
//		}
//		else if (c > a) {
//			aux = c;
//		}
//		
//			if (aux == 0) {
//				System.out.println("Todos são iguais.");
//			}
//			else {
//			System.out.println("O maior número foi: " + aux);
//			}
			
		sc.close();

	}
	
	
	public static int max (int x, int y, int z) {
		
		int aux = 0;
		
		if (x > y) {
			 aux = x;
		}
		else if (y > z) {
			 aux = y;
		}
		else if (z > x) {
			aux = z;
		}
			//System.out.println("Aux é: " + aux);
			return aux;	
	}
	
	public static void showResult (int value) {
		
		if (value == 0) {
			System.out.println("Todos são iguais.");
		}
		else {
		System.out.println("O maior número foi: " + value);
		}
		
	}

}
