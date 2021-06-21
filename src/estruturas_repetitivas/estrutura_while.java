package estruturas_repetitivas;

import java.util.Scanner;

public class estrutura_while {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numeros = sc.nextInt(); //pra ja iniciar com um valor (1. --> 5)
		int soma = 0;
		
		while (numeros != 0) {
			soma = soma + numeros; //1. 0 = 5 + 0 // 2. 5 = 5+7
			numeros = sc.nextInt();		//1. 7 // 2. 12
			
		}
		
		System.out.println(soma);
		
		sc.close();
		
//		int x = 0;
//		int y = 4;
//		
//		while (x < 3) {
//			y = y + 2;
//			x = x + 1;
//			
//			System.out.println(x + "-" + y);
//			
//		}
		
////////TELA//////////
		
//		1-6
//		2-8
//		3-10
		
	}

}
