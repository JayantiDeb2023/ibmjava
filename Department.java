package Package2;

public class Department {
   private int deptid;
   private String deptname;
   private Location location;
   Department()
   {
	   
   }
   Department(int deptid,String deptname,Location location)
   {
	   this.deptid=deptid;
	   this.deptname=deptname;
	   this.location=location; 
   }
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public Location getLocation() {
	return location;
}
public void setLocation(Location location) {
	this.location = location;
}
@Override
public String toString() {
	return "Department [deptid=" + deptid + ", deptname=" + deptname + ", location=" + location.toString() + "]";
}
   
   
}
