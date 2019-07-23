package edu.pe.unsch.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.unsch.entities.Persona;

public interface  PersonaDAO extends JpaRepository<Persona, Long>{
	
}
