package com.onebill.contactmanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phoneno {

	@Id
	private String phonenum;
	
	private String emailid;

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Phoneno(String phonenum, String emailid) {
		super();
		this.phonenum = phonenum;
		this.emailid = emailid;
	}

	public Phoneno() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Phoneno [phonenum=" + phonenum + ", emailid=" + emailid + "]";
	}
	
	
}
