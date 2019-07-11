package com.example.sfgpetclinic.service;

import java.util.Set;

import com.example.sfgpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long Id);
	
	Pet save(Pet pet);
	
	Set<Pet>findAll();

}
