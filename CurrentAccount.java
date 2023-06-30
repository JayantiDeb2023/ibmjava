package Project9;

public class CurrentAccount extends Bank implements Account{
	@Override
	public double deposit(double amount) {
		double balance=super.getBalance();
		super.setBalance(super.getBalance()+amount);
		return super.getBalance();
	}

	@Override
	public double withdraw(double amount) {
		if (amount<=super.getBalance())
				super.setBalance(super.getBalance()-amount);
		return super.getBalance();
	}

	@Override
	public double viewbalance() {
		return super.getBalance();
	}	
}
