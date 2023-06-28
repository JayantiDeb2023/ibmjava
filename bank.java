package project3;

public class bank {
private static int custid=0;
private String customername;
private String age;
private double balance;
public double getBalance() {
	return balance;
}
public bank createcustomer(String customername,String age,double balance)
{
	bank b=new bank();
	b.setCustid(custid);
	b.setCustomername(customername);
	b.setAge(age);
	b.setBalance(balance);
	custid++;
	return b;
	
}
public static int getCustid() {
	return custid;
}
public static void setCustid(int custid) {
	bank.custid = custid;
}
public void setBalance(double salary) {
	this.balance = salary;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public double withdraw(double amount)
{
	if( amount<=balance )
		balance=balance-amount;
	return balance;
}
public String deposit(double amount)
{
	balance=balance+amount;
	return amount+" deposited successfully";
}
public double viewBalance()
{
	return balance;
}
@Override
public String toString() {
	return "bank [custid="+custid+"customername=" + customername + ", age=" + age + ", balance=" + balance + "]";
}



}
