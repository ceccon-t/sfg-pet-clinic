package com.example.sfgpetclinic.service.map;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

}
