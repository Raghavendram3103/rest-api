package com.onebill.contactmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onebill.contactmanagementsystem.entity.Name;

@Repository
public interface NameRepository extends JpaRepository<Name,String>{

}
