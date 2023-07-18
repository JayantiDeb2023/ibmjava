package org.product.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product implements Serializable{
private static int productid=0;
private String productname;
private double productprice;
public Product(String productname, double productprice) {
	this.productid=this.productid++;
	this.productname = productname;
	this.productprice = productprice;
}
}
