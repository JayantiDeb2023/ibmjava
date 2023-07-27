package com.example.sevrice;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dao.CustomerDao;
import com.example.model.Customer;
@Service
public class CustomerServiceImpl implements Customerservice{
	
	private final CustomerDao customerDao;
	
	

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}



	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}



	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}



	@Override
	public Customer findCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerById(customerId);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}
	@Override
	public Customer search(String name)
	{
		return customerDao.search(name);
	}

	
}