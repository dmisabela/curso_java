package poo_3_MembrosEstaticos;

//parte da vers�o 2

public class CalculatorV2 {
	
	public final double PI = 3.14159; 
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		
	}

}
