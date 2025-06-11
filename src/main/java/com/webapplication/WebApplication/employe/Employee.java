package com.webapplication.WebApplication.employe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity(name="employe")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	@Size(min = 1, message = "Enter at least one skill")
	private String technology;
	private String experiaence;
	
	
	

	public Employee() {
		super();
	}

	public Employee(long id, String name, String technology, String experiaence) {
		super();
		this.id = id;
		this.name = name;
		this.technology = technology;
		this.experiaence = experiaence;
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getExperiaence() {
		return experiaence;
	}

	public void setExperiaence(String experiaence) {
		this.experiaence = experiaence;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", technology=" + technology + ", experiaence=" + experiaence
				+ "]";
	}

}
