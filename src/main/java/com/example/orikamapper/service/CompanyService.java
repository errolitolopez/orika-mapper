package com.example.orikamapper.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orikamapper.mapper.CompanyMapper;
import com.example.orikamapper.model.Company;
import com.example.orikamapper.repository.CompanyRepository;
import com.example.orikamapper.request.CompanyForm;

@Service
public class CompanyService {

	private final CompanyMapper companyMapper;
	private final CompanyRepository companyRepository;

	@Autowired
	public CompanyService(CompanyMapper companyMapper, CompanyRepository companyRepository) {
		super();
		this.companyMapper = companyMapper;
		this.companyRepository = companyRepository;
	}

	public void createCompany(CompanyForm companyForm) {
		Company company = companyMapper.map(companyForm);
		companyRepository.save(company);
	}

	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}
}
