package com.example1.model;



import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cust_id")
	private int id;
	
	@Column(name="cust_name")
	private String name;
	
	@OneToMany(mappedBy="customer")
	private List<Address> address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Customer(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

		
}
