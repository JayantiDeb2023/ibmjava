package Project9;

public class Bank {
   private String name;
   private int age;
   private double balance;
   public void createBankDetails(String name,int age,double balance)
   {
	   this.name=name;
	   this.age=age;
	   this.balance=balance;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Bank [name=" + name + ", age=" + age + ", balance=" + balance + "]";
}
   
}
