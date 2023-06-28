package Project5;

public class Employee {
	private String name;
	private double salary;
	private DEPT dept;
	private static int empid=0;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public DEPT getDept() {
		return dept;
	}


	public void setDept(DEPT dept) {
		this.dept = dept;
	}


	public static int getEmpid() {
		return empid;
	}


	public static void setEmpid(int empid) {
		Employee.empid = empid;
	}


	public Employee() {
		super();
	}


	public Employee(String name, double salary,DEPT dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept=dept;
		this.empid=empid+1;
	}


	public final String getDetails()
	{
		return "name" +name+" salary"+salary;
	}
}
