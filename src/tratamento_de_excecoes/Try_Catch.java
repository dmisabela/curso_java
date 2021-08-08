package tratamento_de_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			String[] vect = sc.nextLine().split(" ");
		//ler vários dados na mesma linha separados por espaço 
		//em branco para popular um vetor de Strings
		
		int position = sc.nextInt();
		
		System.out.println(vect[position]);
		
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			//ex.: array tem 3 posições e eu procurei a 4
			
			System.out.println("Posição inválida. Erro: " + e);
		}
		
		catch (InputMismatchException e) {
			
			System.out.println("Valor inválido. Erro: " + e);
			//ex.: ao invés de digitar um int, digitei uma string
		}
		
		System.out.println("Fim do programa.");
		
		sc.close();		
		
	}

}
