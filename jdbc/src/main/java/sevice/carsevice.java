package sevice;

import java.sql.SQLException;
import java.util.List;

import Model.Car;

public interface carsevice {
	public Car createCar(Car car)throws SQLException;
	public List<Car> getAllCars()throws SQLException;

}
