package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carFactory")
public class carfactory {
	private Connection connection = null;

	private  DataSource dataSource=null;

	@Autowired
	public carfactory(DataSource dataSource) {

		this.dataSource = dataSource;
	}

	public Connection getMyConnection() throws SQLException {
		connection = dataSource.getConnection();
		return connection;
	}
}
