package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Product;

public class Productdaoimpl implements Productdao{
	private final Productdao productdao;

	private Connection connection = null;
	private List<Product> list = new ArrayList<>();

	@Autowired
	public Productdaoimpl(Productdao carFactory) {

		this.productdao = carFactory;
	}
	@Override
	public Product createProduct(Product car) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
