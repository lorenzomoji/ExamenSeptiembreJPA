package org.formacio.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.formacio.domain.Persona;
import org.formacio.repositori.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class PersonaService {

	@Autowired
	PersonaRepository personaRepo;
	
	public Optional<Persona> carrega(Integer codi) {
		Optional<Persona> persona = personaRepo.findById(codi);
		persona.ifPresent(p -> p.getMascotes().size());
		return persona;
	} 
	
}
