package com.onebill.contactmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebill.contactmanagementsystem.entity.Phoneno;

@Repository
public interface PhonenoRepository extends JpaRepository<Phoneno,String>{

}
