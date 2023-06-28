package project2;

public class Sportsperson extends Person{
private String sportsname;
private double salary;
Sportsperson(String name,int age,double salary,String sportsname)
{
	super(name,age);
	this.salary=salary;
	this.sportsname=sportsname;
}
public String getSportsname() {
	return sportsname;
}
public void setSportsname(String sportsname) {
	this.sportsname = sportsname;
}

public double getSalary() {
	return salary;
}
@Override
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Sportsperson ["+super.toString()+"sportsname=" + sportsname + ", salary=" + salary + "]";
}
}
