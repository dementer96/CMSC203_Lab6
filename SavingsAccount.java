
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber;
	private String accountNumber;
	
	public SavingsAccount(String name, double initial) {
		super(name, initial);
		this.savingsNumber = 0;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	public void postInterest() {
		double interest = getBalance() * rate / 12;
		deposit(interest);
	}
	@Override
	public String getAccountNumber()
	{
		return accountNumber;
	}
	public SavingsAccount(SavingsAccount oldAccount, double initial) {
		super(oldAccount, initial);
		this.savingsNumber = oldAccount.savingsNumber + 1;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
