package Project5;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Scanner;
public class EmployeeImpl extends EmployeeService {
    Vector <Employee> a=new Vector<Employee>();
    Scanner ob=new Scanner(System.in);
	@Override
	public Vector<Employee> createallEmployees() {
		System.out.println("Enter no of employee");
		int n=ob.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter department");
			DEPT dept=DEPT.valueOf(ob.next());
			System.out.println("Enter name");
			String name=ob.next();
			System.out.println("Enter salary");
			double salary=ob.nextDouble();
			Employee a1=new Employee(name,salary,dept);
			a.add(a1);
			
		}
		return a;
	}

	@Override
	public void deletaallEmployess() {
		if(a!=null)
		{
			a.clear();
		}
		
	}

	@Override
	public void deleteemployeenbyid() {
		System.out.println("enter empid");
		int empid=ob.nextInt();
		Enumeration <Employee> e=a.elements();
		while(e.hasMoreElements())
		{Employee g=e.nextElement();
		if(g.getEmpid()==empid)
		{
			a.remove(g);
		}
			
		}
		
	}

	@Override
	public Vector<Employee> updateemployee() {
		System.out.println("enter empid");
		int empid=ob.nextInt();
		Employee g=null;
		Enumeration <Employee> e=a.elements();
		while(e.hasMoreElements())
		{g=e.nextElement();
		if(g.getEmpid()==empid)
		{
			System.out.println("Enter salary");
			int sal=ob.nextInt();
			g.setSalary(sal);
			
		}
		
	}
		return a;
}}

