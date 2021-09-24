package com.onebill.contactmanagementsystem.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int contactid;
	private String dob;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> address;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Name> name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Phoneno> phonenos;
	
	
	
	public List<Phoneno> getPhonenos() {
		return phonenos;
	}
	public void setPhonenos(List<Phoneno> phonenos) {
		this.phonenos = phonenos;
	}
	public Set<Name> getName() {
		return name;
	}
	public void setName(Set<Name> name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Contact(int contactid, String dob) {
		super();
		this.contactid = contactid;
		this.dob = dob;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", dob=" + dob + "]";
	}
	
	
}
