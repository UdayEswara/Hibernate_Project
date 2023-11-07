package com.expample3.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToMany(mappedBy="cart",fetch=FetchType.EAGER)
	private Set<Product> cart = new HashSet<>();

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, Set<Product> cart) {
		super();
		this.id = id;
		this.cart = cart;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Product> getCart() {
		return cart;
	}

	public void setCart(Set<Product> cart) {
		this.cart = cart;
	}
}
