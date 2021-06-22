//classe Calculator com método estático 

package poo_3_MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program_Versao3 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble()
;
		
		double c = CalculatorV3.circumference(radius);
		double v = CalculatorV3.volume(radius);
		//não preciso mais instanciar o objeto, chamo diretamente a classe estática
		//agora tenho métodos estáticos, constante estática e posso usar os membros independente do objeto 
		
		System.out.printf("Circumferemce: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", CalculatorV3.PI);
		
		sc.close();

	}
	
	

}
