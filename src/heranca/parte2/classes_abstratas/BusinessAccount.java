package heranca.parte2.classes_abstratas;

public class BusinessAccount extends Account {
	
	private Double loanLimit; 
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void Emprestimo(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		Depositar(amount);
		}		
	}
	
	@Override 
	public void Sacar(double amount) {
		super.Sacar(amount); 
		balance -= 2.0;  
	}

}
