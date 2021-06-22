//m�todos na pr�pria classe do programa

package poo_3_MembrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

public class Program_Versao1 {
	
	public static final double PI = 3.14159; 
	//final -> n�o vai mais mudar
	//padr�o para constantes - mai�sculo -> ex.: NET_SALARY

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble()
;
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumferemce: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI Value: %.2f%n", PI);
		
		
		
		sc.close();

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	//tem que ser est�tico pois est�o na mesma classe, como o main � est�tico
	//caso os demais n�o sejam, ir� ocorrer um erro por estarem na mesma classe
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}

}
