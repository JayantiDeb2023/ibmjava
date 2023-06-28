package project3;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class Test {
public static void main(String args[])
{
	Scanner ob=new Scanner(System.in);
	Vector <bank> a=new Vector<bank>();
	int ch=0;
	do
	{
		System.out.println("1-Create Account");
		System.out.println("2-withdraw amount");
		System.out.println("3-deposit amount");
		System.out.println("4-view balance");
		System.out.println("Enter your choice");
		ch=ob.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("enter your name");
			String name=ob.next();
			System.out.println("enter your age");
			String age=ob.next();
			System.out.println("How much amount you want to deposit");
			double amount=ob.nextDouble();
			bank b=new bank();
			bank c=b.createcustomer(name, age,amount);
			a.add(b);
			break;
		case 2:
			System.out.println("enter your custid");
			int a2=ob.nextInt();
			Enumeration <bank> e=a.elements();
			while(e.hasMoreElements())
			{
				bank c2=e.nextElement();
				if(c2.getCustid()==a2)
				{
					System.out.println("Enter amount");
					double amount1=ob.nextDouble();
					System.out.println(c2.withdraw(amount1));
				}
				
			}
			break;
		case 3:
			System.out.println("enter your custid");
			int a3=ob.nextInt();
			Enumeration <bank> e1=a.elements();
			while(e1.hasMoreElements())
			{
				bank c3=e1.nextElement();
				if(c3.getCustid()==a3)
				{
					System.out.println("Enter amount");
					double amount1=ob.nextDouble();
					System.out.println(c3.deposit(amount1));
		}
	}
			break;
		case 4:
			System.out.println("enter your custid");
			int a4=ob.nextInt();
			Enumeration <bank> e2=a.elements();
			while(e2.hasMoreElements())
			{
				bank c4=e2.nextElement();
				if(c4.getCustid()==a4)
				{
					System.out.println(c4.viewBalance());
			
}
}
			break;
		}
	}while(ch!=0);
}
}
