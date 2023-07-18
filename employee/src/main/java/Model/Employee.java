package Model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
private int employeeid;
@Value("${employee.name}")
private String employeename;
@Value("${employee.salary}")
private double salary;
private Department department;
public Employee(Department department)
{
	this.department=department;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", salary=" + salary
			+ ", department=" + department + "]";
}
@PostConstruct

public void initEmployee()

{

    System.out.println("init method called...");

}
@PreDestroy

public void destroyEmployee()

{

    System.out.println("destroy method called...");

}
}
