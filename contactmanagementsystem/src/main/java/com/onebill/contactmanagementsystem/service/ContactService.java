package com.onebill.contactmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.contactmanagementsystem.entity.Contact;
import com.onebill.contactmanagementsystem.repository.AddressRepository;
import com.onebill.contactmanagementsystem.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	 ContactRepository contactRepository;
	
	@Autowired
	AddressRepository addressRepository;
	

	//adding contact
	public Contact addcontact(Contact contact) {
	return	contactRepository.save(contact);

	}
	
	//deleting contact
	public String deletecontact(int contactid) {
		contactRepository.deleteById(contactid);
		return "Contact deleted successfully "+contactid;
	}
	
	//findinf all contacts
	public List<Contact> findAll(Contact contact){
		return contactRepository.findAll();
	}
	
	//getting single contact by id
	public Contact getcontactbyid(int contactid) {
		return contactRepository.findById(contactid).get();
	}
	
	//updating record
	public void update(Contact contact) {
		contactRepository.save(contact);
	}
	

}
