package Package2;
import java.util.Scanner;
public class EmployeeFactory {
 private static  int empId=1;
 private String empName;
 private Department dept;
 private String city;
 Scanner ob =new Scanner(System.in);
 public Employee createEmployee()
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
	 return n;
	 
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
 private Location createLocation(int a,String c,String d,int f)
 {
	 Location l=new Location();
	 l.setLocationid(a);
	 l.setCity(c);
	 l.setCountry(d);
	 l.setPincode(f);
	 return l;
 }
}
