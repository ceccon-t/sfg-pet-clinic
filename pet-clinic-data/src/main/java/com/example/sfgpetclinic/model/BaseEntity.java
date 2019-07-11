package com.example.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 51413091142819649L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
