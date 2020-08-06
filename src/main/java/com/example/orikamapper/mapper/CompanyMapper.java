package com.example.orikamapper.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.orikamapper.model.Company;
import com.example.orikamapper.request.CompanyForm;
import com.example.orikamapper.resource.CompanyResource;
import com.example.orikamapper.response.CompanyResponse;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Service
public class CompanyMapper {

	private final MapperFactory mapperFactory;

	public CompanyMapper() {
		super();
		this.mapperFactory = new DefaultMapperFactory.Builder().build();
	}

	public CompanyResponse mapToResponse(Company company) {
		return mapperFactory.getMapperFacade()
				.map(company, CompanyResponse.class);
	}

	public Company map(CompanyForm companyForm) {
		return mapperFactory.getMapperFacade()
				.map(companyForm, Company.class);
	}

	public CompanyResource mapToResource(Company company) {
		return mapperFactory.getMapperFacade()
				.map(company, CompanyResource.class);
	}

	public List<CompanyResponse> mapToListCompanyResponse(List<Company> companies) {
		return companies.stream()
				.map(this::mapToResponse)
				.collect(Collectors.toList());
	}

	public List<CompanyResource> mapToListCompanyResource(List<Company> companies) {
		return companies.stream()
				.map(this::mapToResource)
				.collect(Collectors.toList());
	}
}
