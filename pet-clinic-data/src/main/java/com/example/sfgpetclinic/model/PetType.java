package com.example.sfgpetclinic.model;

public class PetType extends BaseEntity{
	
	private static final long serialVersionUID = -4551235271691184071L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
