package com.example1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int id;
	
	@Column(name="city")
	private String city;
	
	@ManyToOne
	@JoinColumn(name="cust_id")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address(int id, String city, Customer customer) {
		super();
		this.id = id;
		this.city = city;
		this.customer = customer;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
