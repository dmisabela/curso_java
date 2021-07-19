package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//tem 1 departamento e v�rios contratos
public class Worker {
	
	private String name;
	private WorkerLevel level; 
	private Double baseSalary; 
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); //j� instancia na declara��o
	
	public Worker () {		
	}
	
	//construtor n�o ser� marcado o atributo com lista
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

//	public void setContracts(List<HourContract> contracts) {
//		this.contracts = contracts;
//	} 
	
	/* -> a lista come�a sendo vazia e vai adicionando e removendo, mas o set
	trocaria os componentes da lista ent�o n�o pode existir */
	
	
	/////////////////// M�TODOS ///////////////////
	
	public void addContracts(HourContract contract) {
		contracts.add(contract);
		//adiciona o contrato na lista
	}
	
	public void removeContracts(HourContract contract) {
		contracts.remove(contract);
		//remove o contrato da lista 
	}
	
	public double income(int year, int month) {
		
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			//para cada contrato 'c' na lista de contratos, vou verificar de quando � 
			
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			//Calendar do Java come�a com 0 no m�s
			
			if (year == c_year && month == c_month) {
				soma += c.totalValue();
			}	
		}
		
		return soma;
		
	}
	
	
	
	

}
