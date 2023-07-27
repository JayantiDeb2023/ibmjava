package com.employee2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "my_product_table_spring")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="employee_id")
private int id;
@Column(name = "employee_name")
private String name;
@Column(name="city_name")
private String city;
public Employee(String name, String city) {
	super();
	this.name = name;
	this.city = city;
}


}
