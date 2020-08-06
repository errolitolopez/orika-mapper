package com.example.orikamapper.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CompanyResponse {

	private final Integer companyId;
	private final String name;
	private final String location;

	public Integer getCompanyId() {
		return companyId;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public CompanyResponse(Integer companyId, String name, String location) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "CompanyResponse [companyId=" + companyId + ", name=" + name + ", location=" + location + "]";
	}

}
