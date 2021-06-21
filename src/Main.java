import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double x = 10.35784;
		String nome = "Isabela";
		int idade = 19;
		double renda = 1753.61;
		
		System.out.printf("%.2f%n", x); //exibir com duas casas decimais 
		System.out.println("Hello, world!");
		Locale.setDefault(Locale.US); //agora separa ao invés de "," com "."
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado " + x + " metros");
		
		
		System.out.printf("Resultado = %.2f metros %n", x);
		
				
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);
		
		
		
		
		
	}

}
