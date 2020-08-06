package com.example.orikamapper.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public class CompanyForm {

	private final String name;
	private final String location;

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public CompanyForm(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "CompanyForm [name=" + name + ", location=" + location + "]";
	}

}
