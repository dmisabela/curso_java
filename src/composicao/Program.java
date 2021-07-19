package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departmentName = sc.next(); 
		
		System.out.println("Dados do trabalhador: ");
		
		System.out.println("Nome: ");
		String workerName = sc.next(); 
		
		System.out.println("N�vel: ");
		String workerLevel = sc.next(); 
		
		System.out.println("Sal�rio Base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		//dois objetos associados entre si, um do tipo worker e outro do tipo department
		// composi��o de objetos 
		
		System.out.println("Quantos contratos tem o trabalhador? ");
		int n = sc.nextInt(); 
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Dados do contrato #" + i);
			System.out.println("Date: (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble(); 
			
			System.out.println("Dura��o: ");
			int hours = sc.nextInt(); 
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours); 
			worker.addContracts(contract); //adiciona os contratos � lista
			
			//todos os objetos ser�o associados ao trabalhador, dentro da lista de
			//contratos da classe worker, come�a vazia e vai adicionando com o addContracts
						
		}
		
			System.out.println("Entre com o m�s e ano para calcular o sal�rio (MM/YYYY): ");
			String monthAndYear= sc.next();
			
			int month = Integer.parseInt(monthAndYear.substring(0, 2)); 
			//recorta a string gerando uma substring com os dois d�gitos 
			
			int year = Integer.parseInt(monthAndYear.substring(3));
			
			System.out.println("Nome: " + worker.getName());
			System.out.println("Department " + worker.getDepartment().getName());
			System.out.println("Total dentro do m�s e ano: " 
					+ monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	
		
		sc.close();
		
	}

}

/*     COMPOSI��O     */
//permite que um objeto contenha outro -> tem-um, tem-varios 
// organiza��o, coes�o, flexibilidade, reuso 
// s�mbolo UML � o diamante preto 
