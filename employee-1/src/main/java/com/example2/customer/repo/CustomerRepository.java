package com.example2.customer.repo;

import java.util.Collection;

import com.example2.customer.model.Customer;

public interface CustomerRepository {
    Customer createCustomer(Customer customer);
    Collection<Customer> getAllCustomers();
    Customer getCustomerById(String customerId);

	Customer updateCustomerById(String customerId, Customer customer);

	String deleteCustomerById(String customerId);

}
