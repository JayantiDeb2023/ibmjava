package dao;

import factory.carfactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.stereotype.Component;

import Model.Car;

@Component("cardao")
public class cardaoimpl implements cardao {
	private carfactory carfactory1 = null;
	private Connection connection=null;
	private List<Car> list = new ArrayList<>();

	@Autowired
	public cardaoimpl(carfactory carFactory) {

		this.carfactory1 = carFactory;
	}

	@Override
	public Car createcar(Car car) throws SQLException {
		// TODO Auto-generated method stub
		connection = carfactory1.getMyConnection();
		PreparedStatement pStatement=connection.prepareStatement("insert into car values(?,?)");
		pStatement.setInt(1, car.getCarId());
		pStatement.setString(2, car.getCarName());
		pStatement.executeUpdate();
		return car;
	}

	@Override
	public List<Car> getallCars() throws SQLException {
		// TODO Auto-generated method stub
		connection = carfactory1.getMyConnection();
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from car");
		while(resultSet.next())
		{
			list.add(new Car(resultSet.getInt(1), resultSet.getString(2)));
		}
		return list;
	}


}
