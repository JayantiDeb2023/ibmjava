package sevice;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Model.Car;
import dao.cardao;

public class carseviceimpl implements carsevice {
	private cardao carDao;

	@Autowired
	public carseviceimpl(cardao carDao) {

		this.carDao = carDao;
	}

	@Override
	public Car createCar(Car car) throws SQLException {
		// TODO Auto-generated method stub
		return carDao.createcar(car);
	}

	@Override
	public List<Car> getAllCars() throws SQLException {
		// TODO Auto-generated method stub
		return carDao.getallCars();
	}
}
