package com.example2.customer.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example2.customer.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
	private final Map<Integer, Customer> customers;

	{
		customers = new HashMap<Integer, Customer>();
	}

	@Override

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customers.put(new Random().nextInt(10000), customer);
		return customer;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		Collection<Customer> collection = customers.values();
		return collection;
	}
	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		Customer customer = customers.get(customerId);
		if (customer == null) {
			return null;
		} else {
			return customer;
		}

	}

	@Override
	public Customer updateCustomerById(String customerId, Customer customer) {
		// TODO Auto-generated method stub
		Customer tempcustomer = customers.get(customerId);
		if (customer == null) {
			return null;
		} else {
			tempcustomer.setFirstName(customer.getFirstName());
			tempcustomer.setLastName(customer.getLastName());
			tempcustomer.setEmail(customer.getEmail());
			;
			return tempcustomer;
		}

	}

	@Override
	public String deleteCustomerById(String customerId) {
		Customer tempcustomer = customers.get(customerId);
		if (tempcustomer == null) {
			System.out.println("invalid id");
		}else {
			customers.remove(tempcustomer);
			return "done";
		}
     return null;
	}

}
