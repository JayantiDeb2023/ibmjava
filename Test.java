package Package2;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class Test {
 public static void main(String args[])
 {
   Scanner ob =new Scanner(System.in);
   int ch=0;
   EmployeeFactory c=new EmployeeFactory();
   Vector <Employee> a=c.getAllEmployee();
   do
   {
	  System.out.println("1-add Employee");
	  System.out.println("2-display Employee");
	  System.out.println("3-Find Employee");
	  System.out.println("4-Remove Employee with specific Name");
	  System.out.println("5-Updated Employee");
	  System.out.println("0-exit");
	  System.out.println("Enter your choice");
	  ch=ob.nextInt();
	  switch(ch)
	  {
	  case 0:
		  System.exit(0);
		  break;
	  case 1:
		  c.createEmployee();
		  break;
	  case 2:
		 c.printDetails();
		  break;
	  case 3:
		  Employee g=c.findEmployee();
		  if (g!=null)
			  System.out.println(g);
		  else
			  System.out.println("Employee not found try again");
			  break;
	  case 4:
		  c.removeEmployee();
	  break;
	  case 5:
		  System.out.println("Enter Employee id");
		  int eid=ob.nextInt();
		  c.UpdateEmployee(eid);
		  break;
		  
	  }
   }while(ch!=0);
 }
}
