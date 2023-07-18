package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Product;

public interface Productdao {
	public Product createProduct(Product car)throws SQLException;
	public List<Product> getAllProduct()throws SQLException;
}
