package com.example.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.service.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}
