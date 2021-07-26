package heranca.parte1;

//UPCASTING E DOWNCASTING

public class Program1 {
	
	
	public static void main(String[] args) {
			
		//account.Depositar(0); //classe B.A. tem todas as classes e métodos de Account		
		Account acc = new Account(1001, "Isabela", 0.0);		
		BusinessAccount bacc = new BusinessAccount(1002, "Rosana", 0.0, 500.0);
		
		/*******************  UPCASTING *******************/ 
		
		Account acc1 = bacc;
		//objeto da subclasse sendo atribuido para um objeto da superclasse 
		
		Account acc2 = new BusinessAccount(1003, "Davi", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Maria", 0.0, 400.0); 
		
		/******************* DOWNCASTING *******************/
		
		//BusinessAccount bacc4 = acc2;  //ERRO: Type mismatch
		
		BusinessAccount bacc2 = (BusinessAccount)acc2;
		bacc2.Emprestimo(100.0);
		
		/**nem sempre o downcasting dá certo**/		
		
		//BusinessAccount bacc3 = (BusinessAccount)acc3;
		
		/* vai dar erro quando executar pois foi instanciada como SavingsAccount
		 * sendo assim BusinessAccount é uma Account, mas ñ é uma SavingsAccount
		 * java.lang.ClassCastException */
		 
		 /* TESTANDO O DOWNCASTING */
		
		//não vai entrar neste if
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc3 = (BusinessAccount)acc3;
			bacc3.Emprestimo(200.0);
			System.out.println("Empréstimo!");
		}
		
		//vai entrar neste if
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount sacc1 = (SavingsAccount)acc3;
			sacc1.atualizarSaldo();
			System.out.println("Atualizado!");
		}		
	}

}



