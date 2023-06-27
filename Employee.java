package Package2;

public class Employee {
     private int empId;
     private String empName;
     private Department dept;
     private String city;
     Employee()
     {
    	 
     }
     Employee(int empid,String empname,Department dept1,String city1){
    	 empId=empid;
    	 empName=empName;
    	 dept=dept1;
    	 city=city1; 
     }
     public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
     public void setDetails(int empid,String empname,Department dept1,String city1)
     {   
    	 empId=empid;
    	 empName=empName;
    	 dept=dept1;
    	 city=city1;
     }
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept.toString() + ", city=" + city + "]";
	}
     
}
