package project2;

public class Politcian extends Person {
	private double salary;
	private String constituency;
	Politcian(String name,int age,double salary,String constituency)
	{
		super(name,age);
		this.salary=salary;
		this.constituency=constituency;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	@Override
	public String toString() {
		return "Politcian ["+super.toString()+"salary=" + salary + ", constituency=" + constituency + "]";
	}
	

}
