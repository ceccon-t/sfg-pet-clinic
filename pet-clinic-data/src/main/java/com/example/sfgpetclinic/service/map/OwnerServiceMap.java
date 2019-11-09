package com.example.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
