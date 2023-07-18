package service;
import java.sql.SQLException;
import java.util.List;

import entity.Product;
public interface productservice {
	public Product createProduct(Product product)throws SQLException;
	public List<Product> getAllproducts() throws SQLException;
}
