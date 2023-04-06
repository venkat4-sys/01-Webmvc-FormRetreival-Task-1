package com.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="powerbi")
public class Book {
	
	@Id
	private Integer product_id;
	
	private String productname;
	
	private Integer product_cost;

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProduct_cost() {
		return product_cost;
	}

	public void setProduct_cost(Integer product_cost) {
		this.product_cost = product_cost;
	}
	
	
	

}
