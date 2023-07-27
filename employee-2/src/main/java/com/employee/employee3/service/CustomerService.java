package com.employee.employee3.service;

import java.util.Collection;

import com.employee.employee3.model.Customer;

public interface CustomerService {

	Customer createCustomer(Customer customer);

	Collection<Customer> getAllCustomers();

	Customer getCustomerById(String customerId);

	Customer updateCustomerById(String customerId, Customer customer);

	String deleteCustomerById(String customerId);
}
