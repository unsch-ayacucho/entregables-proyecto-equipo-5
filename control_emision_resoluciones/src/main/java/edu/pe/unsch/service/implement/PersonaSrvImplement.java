package edu.pe.unsch.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.unsch.dao.PersonaDAO;
import edu.pe.unsch.service.PersonaServ;
import edu.pe.unsch.entities.Persona;

@Service
public class PersonaSrvImplement implements PersonaServ {
	
	@Autowired
	protected PersonaDAO daoPersona;
	
	@Override
	public List<Persona> GetListaPersona() {
		
		return this.daoPersona.findAll();
	}
	
	@Override
	public Persona SavePersona(Persona persona) {
		// TODO Auto-generated method stub		
		
		return this.daoPersona.save(persona);
	}
}
