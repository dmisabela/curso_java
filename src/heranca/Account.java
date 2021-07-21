package heranca;

public class Account {
	
	private Integer number;
	private String holder;
	protected Double balance; //para ser acessível na classe BusinessAccount
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	/* retira setBalance pois o saldo não pode ser alterado livremente */

//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}
	
	public void Sacar(double amount) {
		balance -= amount + 5.0; //saque vai ter taxa de R$5.00 em contas normais
	}
	
	public void Depositar(double amount) {
		balance += amount;
	}
	
	
	
	
	
	

}
