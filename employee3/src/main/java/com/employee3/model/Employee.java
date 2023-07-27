package com.employee3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Data
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue
@Column(name="employee_id")
private int employeeid;
@Column(name="employee_name")
private String employeename;
@Column(name="salary")
private double salary;
public Employee(String employeename, double salary) {
	super();
	this.employeename = employeename;
	this.salary = salary;
}
}
