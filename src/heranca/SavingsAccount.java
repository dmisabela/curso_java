package heranca;

public class SavingsAccount extends Account {
	
	/* public final class SavingsAccount extends Account { */
	
	//"final" n�o permite que seja herdada
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void atualizarSaldo() {
		balance += balance * interestRate; //saldo += saldo * juros
	}
	
	@Override //indica ao compilador que � uma sobreposi��o de m�todo
	public void Sacar(double amount) {
		balance -= amount; //SavingsAccounts n�o ter�o taxa de saque 
	}

}
