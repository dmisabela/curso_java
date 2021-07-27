package heranca.parte2.metodos_abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in); 
		
		List<Shape> list = new ArrayList<>();
		//sempre � usado o tipo gen�rico na cole��o, para que tenha o polimorfismo, ent�o a 
		//lista deve ser declarada do tipo da Superclasse para aceitar de todas as subclasses
		
		System.out.print("Digite a quantidade de figuras: ");
		int n = sc.nextInt(); 
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da figura #" + i);
			
			System.out.println("� ret�ngulo ou c�rculo? (R/C):");
			char ch = sc.next().charAt(0);
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			//palavra digitada ser� convertida ao Enum Color
			
			if (ch == 'R') {
				System.out.println("Largura: ");
				double width = sc.nextDouble();
				System.out.println("Altura");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			
			else {
				System.out.println("Raio: ");
				double radius = sc.nextDouble();				
				list.add(new Circle(color, radius));
			}			
		}
		
		System.out.println("------------------------------");
		System.out.println("�rea das figuras:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area())); //polimorfirsmo			
		}
		
		sc.close();
		
	}

}

//M�TODOS ABSTRATOS
//N�o possuem implementa��o
//Precisam ser abstratos quando a classe � gen�rica demais para ter sua implementa��o
//Se a classe possuir 1 m�todo abstrato, a mesma j� � abstrata.
//Nota��o UML: it�lico 
