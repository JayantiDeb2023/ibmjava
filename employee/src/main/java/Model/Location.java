package Model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Location {
	private int locationId;
	private String locationName;
	private String county;
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + ", county=" + county + "]";
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}@PostConstruct

public void initLocation()

{

    System.out.println("init method called...");

}
@PreDestroy

public void destroyLocation()

{

    System.out.println("destroy method called...");

}
}
