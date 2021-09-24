package com.onebill.contactmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebill.contactmanagementsystem.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
