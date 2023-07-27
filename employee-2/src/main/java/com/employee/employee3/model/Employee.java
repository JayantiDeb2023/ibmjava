package com.employee.employee3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="employee_table")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="employee_id")
private int employee_id;
@Column(name="first_name")
private String firstname;
@Column(name="last_name")
private String lastname;
@Column(name="salary")
private double salary;
public Employee(String firstname, String lastname, double salary) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.salary = salary;
}
}
