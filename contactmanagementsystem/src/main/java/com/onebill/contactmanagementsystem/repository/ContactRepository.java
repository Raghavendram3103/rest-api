package com.onebill.contactmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebill.contactmanagementsystem.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
