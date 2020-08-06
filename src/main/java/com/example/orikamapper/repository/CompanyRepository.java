package com.example.orikamapper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orikamapper.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
