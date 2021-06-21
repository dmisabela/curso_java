package estrutura_condicional;

import java.util.Scanner;

public class estrutura_condicional {
	
	public static void main (String[] args) {
		
		int hora;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (i < 10) {
		
		
		System.out.println("Que horas são?");
		hora = sc.nextInt();
		
		if (hora >= 06 && hora < 12) {
			
				System.out.println("Bom dia!");
		}
		
		else if (hora >= 12 && hora <= 18) { 
		
			System.out.println("Boa tarde!");
		
		}
		
		else if (hora > 18 && hora <= 23) {
			System.out.println("Boa noite!");
		}
		
		else if (hora >= 0 && hora <= 6) {
			System.out.println("Boa madrugada!");
		}
		
		else {
			System.out.println("Defina uma hora válida!");
		}
		
		i++;			
		
		}
		
		sc.close();
		System.out.println("Fim do programa.");
	}

}
