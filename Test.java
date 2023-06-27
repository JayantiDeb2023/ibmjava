package Package2;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class Test {
 public static void main(String args[])
 {
   Scanner ob =new Scanner(System.in);
   Vector <Employee> a= new Vector<Employee>();
   int ch=0;
   do
   {
	  System.out.println("1-add Employee");
	  System.out.println("2-display Employee");
	  System.out.println("3-Find Employee");
	  System.out.println("0-exit");
	  System.out.println("Enter your choice");
	  ch=ob.nextInt();
	  switch(ch)
	  {
	  case 0:
		  System.exit(0);
		  break;
	  case 1:
		  EmployeeFactory f=new EmployeeFactory();
		  Employee g=f.createEmployee();
		  a.add(g);
		  break;
	  case 2:
		  Enumeration <Employee> e=a.elements();
		  while(e.hasMoreElements())
		  {   System.out.println("**************");
			  System.out.println(e.nextElement());
		  }
		  break;
	  case 3:
		  System.out.println("Enter EmployeeId");
			  int empId=ob.nextInt(),g2=0;
					  Enumeration <Employee> e1=a.elements();
			  while(e1.hasMoreElements())
				  {   Employee a1=e1.nextElement();
				  if(a1.getEmpId()==empId)
				  {   g2=1;
					  System.out.println(a1);break;}
			  }
			  if(g2==0)
				  System.out.println("Element not found");
			  break;
	  }
   }while(ch!=0);
 }
}
