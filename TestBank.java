package Project9;

public class TestBank {
public static void main(String args[])
{
	SavingAccount b=new SavingAccount();
	b.createBankDetails("jayanti", 23, 4000.0);
	System.out.println(b.deposit(2000));
	System.out.println(b.withdraw(3000));
	
}
}
