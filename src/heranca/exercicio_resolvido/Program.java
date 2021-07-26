package heranca.exercicio_resolvido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de funcionários: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Dados do funcionário #" + i);
			
			System.out.print("É terceirizado? (S/N): ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			String name = sc.next();
			
			System.out.print("Horas trabalhadas: ");
			int hours = sc.nextInt(); 
			
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'S') {				
				System.out.print("Despesa adicional: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				//instanciando um funcionário terceirizado
				list.add(emp);				
			}
			
			else {				
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);		
				//ou: list.add(new Employee(name, hours, valuePerHour);
			}
			
		}
		
		System.out.println("--------------------------------");
		System.out.println("Pagamentos: ");
		
			//para cada funcionário na lista
			for (Employee emp : list) {
				System.out.println(emp.getName() + " - $ " 
								+ String.format("%.2f", emp.payment()));
			}
		
		
		sc.close();
		
	}
	
}
