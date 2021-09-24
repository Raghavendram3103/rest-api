package com.onebill.contactmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Name {

	@Id
	private String first_name;
	private String middle_name;
	private String last_name;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Name(String first_name, String middle_name, String last_name) {
		super();
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
	}
	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Name [first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name + "]";
	}
	
}
