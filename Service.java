package Project5;
import java.util.Scanner;
public class Service {
public static void main(String args[])
{
	EmployeeImpl e=new EmployeeImpl();
	Scanner ob=new Scanner(System.in);
	int ch=ob.nextInt();
	do
	{
		System.out.println("1-Create employees");
		System.out.println("2-Delete all Employees");
		System.out.println("3-Delete Employee by id");
		System.out.println("4-Update Employee by id");
		System.out.println("Enter the choice");
		ch=ob.nextInt();
		switch(ch)
		{
		case 1:
			e.createallEmployees();
			break;
		case 2:
			e.deletaallEmployess();
			break;
		case 3:
			e.deleteemployeenbyid();
			break;
		case 4:
			e.updateemployee();
			break;
		}
		
	}while(ch!=0);
}
}
