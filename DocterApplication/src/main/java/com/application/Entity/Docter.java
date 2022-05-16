package com.application.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "Docter_Application")
public class Docter {
	
	

	@Id  
	private int id;
	private String name;
	private String Specialist;
	public Docter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Docter(int id, String name, String specialist) {
		super();
		this.id = id;
		this.name = name;
		Specialist = specialist;
	}
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
	public String getSpecialist() {
		return Specialist;
	}
	public void setSpecialist(String specialist) {
		Specialist = specialist;
	}
	

}
