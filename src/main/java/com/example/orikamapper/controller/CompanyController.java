package com.example.orikamapper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orikamapper.mapper.CompanyMapper;
import com.example.orikamapper.request.CompanyForm;
import com.example.orikamapper.resource.CompanyResource;
import com.example.orikamapper.response.CompanyResponse;
import com.example.orikamapper.service.CompanyService;

@RestController
@RequestMapping("api/v1/companies")
public class CompanyController {

	private final CompanyService companyService;
	private final CompanyMapper companyMapper;

	@Autowired
	public CompanyController(CompanyService companyService, CompanyMapper companyMapper) {
		super();
		this.companyService = companyService;
		this.companyMapper = companyMapper;
	}

	@GetMapping("/v1")
	public List<CompanyResponse> getListOfCompanyResponse() {
		return companyMapper.mapToListCompanyResponse(companyService.getAllCompanies());
	}

	@GetMapping("/v2")
	public List<CompanyResource> getListOfCompanyResource() {
		return companyMapper.mapToListCompanyResource(companyService.getAllCompanies());
	}

	@PostMapping
	public void createCompany(@RequestBody CompanyForm companyForm) {
		companyService.createCompany(companyForm);
	}
}
