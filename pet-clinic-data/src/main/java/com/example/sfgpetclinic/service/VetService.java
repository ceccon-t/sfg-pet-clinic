package com.example.sfgpetclinic.service;

import java.util.Set;

public interface VetService {
	
	VetService findById(Long id);
	
	VetService save(VetService vet);
	
	Set<VetService> findAll();

}
