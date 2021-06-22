package poo_1_Triangle;

import java.util.Locale;
import java.util.Scanner;

public class triang_com_poo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();	
		
		
		System.out.println("Enter de measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter de measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calcularArea();
		double areaY = y.calcularArea();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else if (areaY > areaX) {
			System.out.println("Larger area: Y");
		}
		else {
			System.out.println("Both have the same value.");
		}
						
		
		sc.close();

	}

}
