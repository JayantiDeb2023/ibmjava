package dao;

import java.sql.SQLException;
import java.util.List;

import Model.Car;

public interface cardao {
public Car createcar(Car car) throws SQLException;
public List<Car> getallCars() throws SQLException;
}
