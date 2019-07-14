package com.example.sfgpetclinic.service.map;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

}
