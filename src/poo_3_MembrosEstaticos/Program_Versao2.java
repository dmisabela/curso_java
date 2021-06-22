//classe Calculator com membros de instância

package poo_3_MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program_Versao2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		CalculatorV2 calc = new CalculatorV2(); //instanciando o Calculator com objeto calc
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble()
;
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circumferemce: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", calc.PI);
		
		
		
		sc.close();

	}
	
	

}
