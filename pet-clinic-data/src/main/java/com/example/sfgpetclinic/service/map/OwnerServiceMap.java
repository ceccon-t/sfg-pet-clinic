package com.example.sfgpetclinic.service.map;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
}
