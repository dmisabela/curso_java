package heranca;

//Classe apenas para testes

public class SavingsAccountPlus extends SavingsAccount {
	
	/*
	 * - Caso SavingsAccount estivesse com "final" daria erro:
	 * erro: The type SavingsAccountPlus cannot subclass the final class SavingsAccount
	 */
	
	
	@Override 
	public void Sacar(double amount) {
		balance -= amount + 2.0; 
	}
	
	//se em "SavingsAccount" o método tiver como public final void Sacar() também daria erro


}
