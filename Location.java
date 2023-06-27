package Package2;

public class Location {
     private int locationid;
     private String city;
     private String country;
     private int pincode;
     Location()
     {
    	 
     }
     Location(int locationid,String city,String country,int pincode)
     {this.locationid=locationid;
	 this.city=city;
	 this.country=country;
	 this.pincode=pincode;
    	 
     }
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Location [locationid=" + locationid + ", city=" + city + ", country=" + country + ", pincode=" + pincode
				+ "]";
	}
     
}
