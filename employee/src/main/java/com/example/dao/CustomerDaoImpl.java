package com.example.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Customer;

@Repository
@EnableTransactionManagement
public class CustomerDaoImpl implements CustomerDao {

	private final EntityManager entityManager;


	public CustomerDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		TypedQuery<Customer> query=(TypedQuery<Customer>) entityManager.createQuery("FROM Customer C");
		return query.getResultList();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 entityManager.persist(customer);
	}

	@Override
	@Transactional
	public Customer findCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return entityManager.find(Customer.class, customerId);
	}
	@Override
	@Transactional
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return entityManager.merge(customer);
	}
	@Override
	@Transactional
	public Customer search(String name) {
		// TODO Auto-generated method stub
	    Query query=entityManager.createQuery("From Customer I where I.firstName=:name");
	    query.setParameter("name", name);
	    List<Customer> customers=query.getResultList();
	    return customers.get(0);
	}
	
	
}