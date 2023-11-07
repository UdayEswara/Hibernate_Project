package com.expample3.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="Product_cart",joinColumns=@JoinColumn(name="product_id"),inverseJoinColumns=@JoinColumn(name="cart_id"))
	private Set<Cart> cart= new HashSet<>();

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

	public Set<Cart> getCart() {
		return cart;
	}

	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}

	public Product(int id, String name, Set<Cart> cart) {
		super();
		this.id = id;
		this.name = name;
		this.cart = cart;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
