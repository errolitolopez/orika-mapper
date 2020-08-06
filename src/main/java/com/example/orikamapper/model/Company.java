package com.example.orikamapper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "company")
public class Company {

	@Id
	@Column(name = "company_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer companyId;

	@Column(name = "name")
	private String name;

	@Column(name = "location")
	private String location;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Company(Integer companyId, String name, String location) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.location = location;
	}

	public Company() {
		super();
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", location=" + location + "]";
	}

}
