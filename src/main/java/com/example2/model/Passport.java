package com.example2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Passport")
public class Passport 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="passp_id")
	private int id;
	
	@Column(name="passp_number")
	private String number;
	
	@OneToOne
	private Person person;

	public Passport(int id, String number, Person person) {
		super();
		this.id = id;
		this.number = number;
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

		
}
