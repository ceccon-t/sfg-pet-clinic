package com.example.sfgpetclinic.service.map;

import org.springframework.stereotype.Service;

import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object);
	}

}
