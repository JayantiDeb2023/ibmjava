package Package2;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class EmployeeFactory {
 private static  int empId=1;
 private String empName;
 private Department dept;
 private String city;
 Scanner ob =new Scanner(System.in);
 Vector <Employee> a=new Vector<Employee>();
 public void createEmployee()
 {   Employee n =new Employee();
	 System.out.println("Enter Employee Name");
	 empName=ob.next();
	 System.out.println("Enter Department Name");
	 String deptName=ob.next();
	 dept=createDepartment(deptName);
	 System.out.println("Enter name of the city(Residence) ");
	 city=ob.next();
	 n.setEmpId(empId);
	 n.setEmpName(empName);
	 n.setDept(dept);
	 n.setCity(city);
	 empId+=1;
	 a.add(n);
	 
 }
 private  Department createDepartment(String deptName)
 {
	 Department n=new Department();
	 System.out.println("Enter Department Id");
	 int deptId=ob.nextInt();
	 n.setDeptid(deptId);
	 n.setDeptname(deptName);
	 System.out.println("Enter Location Id");
	 int locationId=ob.nextInt();
	 System.out.println("Enter name of the city(Office) ");
	 String city2=ob.next();
	 System.out.println("Enter name of the country ");
	 String country=ob.next();
	 System.out.println("Enter pincode ");
	 int pincode=ob.nextInt();
	 Location l=createLocation(locationId,city2,country,pincode);
	 n.setLocation(l);
	 return n;
	 
 }
 public Vector<Employee> getAllEmployee()
 {
	 return a;
 }
 public void printDetails()
 {
	 Enumeration <Employee> e=a.elements();
	  while(e.hasMoreElements())
	  {   System.out.println("**************");
		  System.out.println(e.nextElement());
	  }
 }
 public Employee findEmployee()
 {
	 System.out.println("Enter EmployeeId");
	  int empId=ob.nextInt();Employee s=null;
			  Enumeration <Employee> e1=a.elements();
	  while(e1.hasMoreElements())
		  {   Employee a1=e1.nextElement();
		  if(a1.getEmpId()==empId)
		  {   
			  s=a1;}
	  }
	 return s;
 }
 public void removeEmployee()
 {
	 System.out.println("Enter the name of Employee");
	  String n=ob.next();
	  Enumeration <Employee> e1=a.elements();
	  while(e1.hasMoreElements())
	  {   Employee a1=e1.nextElement();
	  if(a1.getEmpName().equals(n))
	  {   a.remove(a1);
		 }
 }
 }
 private Location createLocation(int a,String c,String d,int f)
 {
	 Location l=new Location();
	 l.setLocationid(a);
	 l.setCity(c);
	 l.setCountry(d);
	 l.setPincode(f);
	 return l;
 }
 public void UpdateEmployee(int empid)
 {
	 Employee s=null;
			  Enumeration <Employee> e1=a.elements();
	  while(e1.hasMoreElements())
		  {   Employee a1=e1.nextElement();
		  if(a1.getEmpId()==empid)
		  {   
			  s=a1;}
	  } 
	  
	  if(s!=null)
	  {
		  System.out.println("Enter updated Employee name");
		  String c6=ob.next();s.setEmpName(c6);
	  System.out.println("Enter Updated Department Name");
	  String c5=ob.next();
	  s.getDept().setDeptname(c5);
	  System.out.println("Enter updated city name");
	  String c3=ob.next();
	  s.getDept().getLocation().setCity(c3);
	  System.out.println("Enter updated country name");
	  String c4=ob.next();
	  s.getDept().getLocation().setCountry(c4);
	  System.out.println("Enter updated pincode");
	  int p=ob.nextInt();
	  s.getDept().getLocation().setPincode(p);
	  System.out.println("Employee updated successfully");}
 }
}
