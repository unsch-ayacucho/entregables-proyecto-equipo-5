package edu.pe.unsch.service;

import java.util.List;

import edu.pe.unsch.entities.Persona;

public interface PersonaServ {
	Persona SavePersona(Persona persona);
	List<Persona> GetListaPersona();
}
