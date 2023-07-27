package com.example2.customer.service;

import java.util.Collection;

import com.example2.customer.model.Customer;

public interface CustomerService {
	Customer createCustomer(Customer customer);

	Collection<Customer> getAllCustomers();
	Customer getCustomerById(String customerId);

	Customer updateCustomerById(String customerId, Customer customer);

	String deleteCustomerById(String customerId);
}
