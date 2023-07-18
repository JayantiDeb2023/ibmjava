package service;
import org.springframework.dao.support.DaoSupport;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.Productdao;
import entity.Product;
@Component("productservice")
public class productseviceimpl implements productservice{
	private Productdao productdao;

	@Autowired
	public  productseviceimpl(Productdao productdao) {

		this.productdao = productdao;
	}


	public List<Product> getAllproducts() throws SQLException {
		// TODO Auto-generated method stub
		return productdao.getAllProduct();
	}

	@Override
	public Product createProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		return productdao.createProduct(product);
	}

	
}
