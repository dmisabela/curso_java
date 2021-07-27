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
		//sempre é usado o tipo genérico na coleção, para que tenha o polimorfismo, então a 
		//lista deve ser declarada do tipo da Superclasse para aceitar de todas as subclasses
		
		System.out.print("Digite a quantidade de figuras: ");
		int n = sc.nextInt(); 
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados da figura #" + i);
			
			System.out.println("É retângulo ou círculo? (R/C):");
			char ch = sc.next().charAt(0);
			
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			//palavra digitada será convertida ao Enum Color
			
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
		System.out.println("Área das figuras:");
		
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area())); //polimorfirsmo			
		}
		
		sc.close();
		
	}

}

//MÉTODOS ABSTRATOS
//Não possuem implementação
//Precisam ser abstratos quando a classe é genérica demais para ter sua implementação
//Se a classe possuir 1 método abstrato, a mesma já é abstrata.
//Notação UML: itálico 
