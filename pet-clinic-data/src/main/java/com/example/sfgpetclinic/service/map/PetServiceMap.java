package com.example.sfgpetclinic.service.map;

import com.example.sfgpetclinic.model.Pet;
import com.example.sfgpetclinic.service.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

}
