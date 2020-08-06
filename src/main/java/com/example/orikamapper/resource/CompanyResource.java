package com.example.orikamapper.resource;

public class CompanyResource {

	private final String name;
	private final String location;

	public CompanyResource(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "CompanyResource [name=" + name + ", location=" + location + "]";
	}
}
