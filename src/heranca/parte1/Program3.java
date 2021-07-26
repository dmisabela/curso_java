package heranca.parte1;

public class Program3 {
	
	public static void main(String[] args) {
		
		//POLIMORFISMO
		
		Account x = new Account(1020, "Alex", 1000.0); 
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01); 
		//essa instancia��o � feita em tempo de execu��o por meio do upcasting 
		
		x.Sacar(50.0); //945.0
		y.Sacar(50.0); //950.0		
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		/*
		 * Chamei a mesma opera��o em vari�veis do mesmo tipo (Account)
		 * mas elas tiveram comportamentos diferentes. 
		 */
		
	}

}
