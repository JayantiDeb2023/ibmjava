package com.example.sevrice;

import java.util.List;

import com.example.model.Customer;

public interface Customerservice {
	public List<Customer> getAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer findCustomerById(int customerId);
	public Customer updateCustomer(Customer customer);
	public Customer search(String name);
	

}
