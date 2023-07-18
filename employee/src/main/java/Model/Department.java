package Model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
private int departmentid;
@Value("${department.name}")
private String departmentName;
private Location location;
public Department(Location location2) {
	this.location=location2;
}
public int getDepartmentid() {
	return departmentid;
}
public void setDepartmentid(int departmentid) {
	this.departmentid = departmentid;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}
@Override
public String toString() {
	return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + "]";
}
@PostConstruct

public void initDepartment()

{

    System.out.println("init method called...");

}
@PreDestroy

public void destroyDepartment()

{

    System.out.println("destroy method called...");

}

}
