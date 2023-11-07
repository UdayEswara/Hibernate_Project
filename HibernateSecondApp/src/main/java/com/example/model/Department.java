package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="dept_id")
	private int id;
	
	@Column(name="dept_name")
	private String name;
	
	@OneToMany(mappedBy="department")
	private List<Employee> employee;

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

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, List<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}
}
