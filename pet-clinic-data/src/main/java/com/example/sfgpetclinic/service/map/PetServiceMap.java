package com.example.sfgpetclinic.service.map;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.service.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}
