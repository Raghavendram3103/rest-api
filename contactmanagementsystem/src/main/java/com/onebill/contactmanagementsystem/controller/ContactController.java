package com.onebill.contactmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.contactmanagementsystem.entity.Contact;
import com.onebill.contactmanagementsystem.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/contact")
	private Contact addcontact(@RequestBody Contact contact) {
		return contactService.addcontact(contact);
	}
	
	@DeleteMapping("/contact/{contactid}")
	private String deletecontactbyid(@PathVariable int contactid) {
		return contactService.deletecontact(contactid);
	}
	@GetMapping("/contact")
	private List<Contact> findAll(@RequestBody Contact contact){
		return contactService.findAll(contact);
	}
	
	@GetMapping("/contact/{contactid}")
	private Contact getcontactbyid(@PathVariable int contactid) {
		return contactService.getcontactbyid(contactid);
	}
	
	@PutMapping("/contact")
	private Contact updatecontact(@RequestBody Contact contact) {
		 contactService.update(contact);
		 return contact;
	}
}
