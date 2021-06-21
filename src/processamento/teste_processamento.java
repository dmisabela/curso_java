package processamento;

public class teste_processamento {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------");
		System.out.println("processamento");
		System.out.println("-------------------");
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("-------------------");
		System.out.println("casting");
		System.out.println("-------------------");
		
		int a2, b2;
		double resultado, resultado2;
		
		a2 = 5;
		b2 = 2;
		
		resultado = a2/b2; //resultado 2.0, pois a e b foram declaradas como int
		System.out.println(resultado);
		
		resultado2 = (double) a2/b2; //2.5
		System.out.println(resultado2);
		
		double a3;
		int b3;
		
		a3 = 5.2;
		b3 = (int) a3; //ignora as casas decimais (se não colocar isso dá erro)
		
		System.out.println(b3);
		
		
		
	}
}
