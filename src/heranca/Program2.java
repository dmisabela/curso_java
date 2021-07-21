package heranca;

public class Program2 {
	
	public static void main(String[] args) {
		
		// SOBREPOSIÇÃO 
		
		Account acc1 = new Account (1001, "Isabela", 1000.0); 
		acc1.Sacar(200.0); //795
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount (1002, "Maria", 1000.0, 0.01); 
		acc2.Sacar(200.0); //800
		System.out.println(acc2.getBalance());
		
		//SOBREPOSIÇÃO + SUPER 
		
		Account acc3 = new BusinessAccount(1003, "Fernanda", 1000.00, 500.0);
		acc3.Sacar(200.0);
		System.out.println(acc3); //793
		
	}

}
